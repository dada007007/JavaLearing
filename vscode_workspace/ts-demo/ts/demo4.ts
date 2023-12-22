//对象类型
let stu: { name: string, age: Number, gender: number, say(): void } = {
    name: 'Tom',
    age: 18,
    gender: 1,
    say() {
        console.log('==========> say....');
    }
}
console.log(stu.name);
stu.say();

interface User{
    name:string,
    age:number,
    gender: number,
     say(): void 
}

let stu1: User = {
    name: 'John',
    age: 18,
    gender: 1,
    say() {
        console.log('==========>User say....');
    }
}
console.log(stu1.name);
stu1.say();
