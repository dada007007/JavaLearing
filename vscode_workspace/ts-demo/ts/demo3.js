//函数的类型
//具名函数
function add(x, y) {
    return x + y;
}
console.log(add(10, 20));
//匿名函数
let add2 = function (x, y) {
    return x + y;
};
console.log(add(100, 200));
//箭头函数
let add3 = (x, y) => {
    return x + y;
};
console.log(add(1000, 2000));
function getFullName(firstname, lastname) {
    return firstname + '' + lastname;
}
console.log(getFullName('Tom'));
console.log(getFullName('Tom', 'Cat'));
