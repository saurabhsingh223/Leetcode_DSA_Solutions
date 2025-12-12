/**
 * @param {Function} fn
 * @return {Function}
 */
var memoize = function(fn) {
  const cache = new Map();
  return function(...args) {
    // create stable key for the arguments
    const key = JSON.stringify(args);
    if (cache.has(key)) return cache.get(key);
    const res = fn(...args);
    cache.set(key, res);
    return res;
  };
};
