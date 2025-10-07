// function greet(name: string): string{
//     return `Hell Mr ${name}`;
// }
// greet('name')
let isTrue: boolean;
let username: string

//array
// let myArr:Array<number | string>=[45,77];
// myArr[0]='foo'

// enum Directions{UP, DOWN, LEFT, RIGHT};
//  let joyStStatus=  1;

// if(joyStStatus ===Directions.UP){

// }

// class Emp{
//     constructor(name: string){
//         name=name
//     }
// }
// let e1=new Emp('raj')

// let data: string | number="raja"
// data="abc"
// let data: any="raja"
// data="abc"

//interface in ts
interface Person {
  firstName: string;
  lastName: string;
}

function print(p: Person) {
  console.log(`the details of person ${p.firstName} and ${p.lastName}`);
}

let ob: Person = { firstName: "raj", lastName: "gupta" };
print(ob);