var _a, _b;
var appConfig = {
    user: {
        settings: {
            theme: "dark"
        }
    }
};
console.log((_b = (_a = appConfig.user) === null || _a === void 0 ? void 0 : _a.settings) === null || _b === void 0 ? void 0 : _b.theme); // "dark"
// interface User {
//   name: string;
//   address ?: {
//     city?: string;
//     zipCode?: string;
//   };
// }
// const user1: User = {
//   name: "Alice"
// };
// console.log(user1.address?.city); // ❌ Error: Cannot read property 'city' of undefined
//classes 
// class User {
//   private name: string;
//   private surname: string;
//   private age: number;
//   constructor(name: string, surname: string, age: number) {
//     this.name = name;
//     this.surname = surname;
//     this.age = age;
//   }
// }
// class User {
//   constructor(private name: string,private surname: string,private age: number) {
//   }
// }
// let u=new User('raj','gupta',50)
// class Car{
//     engine: string;
//     constructor(engine: string){
//             this.engine=engine;
//     }
//     printCar(): void{
//         console.log(`this is egine number ${this.engine}`)
//     }
// }
// let c=new Car('v8')
// c.printCar();
//interface inheritance
// interface Person { 
//    age:number 
// } 
// interface Musician extends Person { 
//    instrument:string 
// } 
// let drummer = <Musician>{}; 
// drummer.age=34;
// drummer.instrument='drum'
// interface Person {
//   firstName: string;
//   lastName ?: string;
//   salary ?: number;
//   sayHi : ()=>string 
// }
// function print1(p: Person) {
//   console.log(`the details of person ${p.firstName} and ${p.lastName}`);
//   p.sayHi()
// }
// let ob: Person = { firstName: "raj" ,"salary": 56888, sayHi: ()=>  'i love js'};
// print1(ob);
