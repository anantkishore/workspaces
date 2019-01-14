export {}

let message = "Hello Anant";
console.log(message);

let x;
const y = 20;

let sum;

const title = "typescript";

let isBeginner: boolean = true;
let total: number = 0;
let name: string = 'Anant';

let sentence: string = 'My name is ${name} I '+'am a beginner in typescript';

console.log(sentence);

let n: null = null;
let u: undefined = undefined;

let isNew: boolean = null;
let myName: undefined = undefined;

let arr1: number[] = [1,2,3];
let arr2: Array<number> = [1,2,3,4];

let person1: [string, number] = ['Anant', 29];

enum Color {Red = 1, Green, Blue};

let c: Color = Color.Blue;

console.log(c);

let randomValue: any = 10;
randomValue = true;
randomValue = 'Anant';

let myVariable: unknown = 10;

function hasName(obj:any): obj is { name: string } {
    return !!obj &&
        typeof obj == "object" &&
            "name" in obj
} 


if(hasName(myVariable)) {
    console.log(myVariable.name);
}

//(myVariable as string).toUpperCase();

let a;

a = 10;
a = true;

let b = 20;

//b = true; not assinable to number

let multiType: number | boolean;
multiType = 20;
multiType = true;

let anyType: any;

//optional parameter
function add(num1:number, num2?:number)
{
    if(num2)
        return num1+num2;
    else
        num1;
}

add(5, 10);

let result: string;

//result = add(5,5);

console.log(add(5));

//default parameter
function add2(num1:number, num2:number = 10)
{
    if(num2)
        return num1+num2;
    else
        num1;
}

console.log(add2(5));

function fullName(person: Person)
{
    console.log('{person.firstname} ${person.lastname}');
}

let p = {

    firstname: 'Anant',
    lastname: 'kishore'
};

fullName(p);

//interface for generic type
interface Person {
    firstname: string,
    lastname?: string
}

class Employee {
    private empName: string;

    constructor(name:string)
    {
        this.empName = name;
    }

    greet()
    {
        console.log('Welcome, ' + this.empName);
    }
}

let emp1 = new Employee('Anant');
emp1.greet();
//console.log(emp1.empName);

class Manager extends Employee {
    constructor(managerName: string) {
        super(managerName);
    }
    delegateWork() {
        console.log('Manager delegating task');
    }
}

let manager = new Manager('Anant');

manager.delegateWork();
manager.greet();
console.log(manager.empName);

