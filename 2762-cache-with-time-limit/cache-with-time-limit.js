/**
 * @constructor
 */
var TimeLimitedCache = function() {
  // Map: key -> { value: any, timer: Timeout }
  this.map = new Map();
};

/**
 * @param {number} key
 * @param {number} value
 * @param {number} duration (milliseconds)
 * @return {boolean} true if un-expired key already existed and was overwritten
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
  // If key exists, it's currently unexpired (because we remove when it expires)
  const exists = this.map.has(key);

  // If there's an existing timer, clear it so it won't delete the new value.
  if (exists) {
    clearTimeout(this.map.get(key).timer);
  }

  // Create a timer that will remove the key once duration elapses
  const timer = setTimeout(() => {
    this.map.delete(key);
  }, duration);

  // Store / overwrite the value and timer
  this.map.set(key, { value, timer });

  return exists;
};

/**
 * @param {number} key
 * @return {number} value or -1 if not found / expired
 */
TimeLimitedCache.prototype.get = function(key) {
  const entry = this.map.get(key);
  return entry ? entry.value : -1;
};

/**
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
  return this.map.size;
};
