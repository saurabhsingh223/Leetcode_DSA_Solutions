/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // classFunction must be a function
    if (typeof classFunction !== "function") return false;

    // null and undefined are never instances
    if (obj == null) return false;

    // If obj is a primitive, wrap it so it has a prototype chain
    if (typeof obj !== "object" && typeof obj !== "function") {
        obj = Object(obj);
    }

    let proto = Object.getPrototypeOf(obj);

    while (proto !== null) {
        if (proto === classFunction.prototype) return true;
        proto = Object.getPrototypeOf(proto);
    }

    return false;
};
