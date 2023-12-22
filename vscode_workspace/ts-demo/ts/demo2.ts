//联合类型
let flag:(string|boolean)='男'


let flag1:(string|boolean)[]=['男',true,false]
let flag2:(string|boolean)[]=['男',false]


//类型别名
type ArrayType=(string|number|boolean)
let flag3:ArrayType[]=[1,2,3,true,'文龙']
console.log(`${flag}:${flag1}:${flag2}:${flag3}`);

