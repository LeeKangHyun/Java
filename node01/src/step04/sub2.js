/* 모듈 만들기 방법2 */
module.exports = function(op) {
    switch(op) {
        case "*":
            return function(a, b) {
                return a * b;
            };
        case "/":
            return function(a, b) {
                return a / b;
            };
    }
};

exports.multiple = function(a, b) {
    return a * b;
};

exports.divide = function(a, b) {
    return a / b;
};
