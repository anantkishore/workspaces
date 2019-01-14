"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var message = "Hello Anant";
console.log(message);
var x;
var y = 20;
var sum;
var title = "typescript";
var isBeginner = true;
var total = 0;
var name = 'Anant';
var sentence = 'My name is ${name} I ' + 'am a beginner in typescript';
console.log(sentence);
var n = null;
var u = undefined;
var isNew = null;
var myName = undefined;
var arr1 = [1, 2, 3];
var arr2 = [1, 2, 3, 4];
var person1 = ['Anant', 29];
var Color;
(function (Color) {
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["Blue"] = 3] = "Blue";
})(Color || (Color = {}));
;
var c = Color.Blue;
console.log(c);
var randomValue = 10;
randomValue = true;
randomValue = 'Anant';
var myVariable = 10;
function hasName(obj) {
    return !!obj &&
        typeof obj == "object" &&
        "name" in obj;
}
if (hasName(myVariable)) {
    console.log(myVariable.name);
}
//(myVariable as string).toUpperCase();
var a;
a = 10;
a = true;
var b = 20;
//b = true; not assinable to number
var multiType;
multiType = 20;
multiType = true;
var anyType;
//optional parameter
function add(num1, num2) {
    if (num2)
        return num1 + num2;
    else
        num1;
}
add(5, 10);
var result;
//result = add(5,5);
console.log(add(5));
//default parameter
function add2(num1, num2) {
    if (num2 === void 0) { num2 = 10; }
    if (num2)
        return num1 + num2;
    else
        num1;
}
console.log(add2(5));
function fullName(person) {
    console.log('{person.firstname} ${person.lastname}');
}
var p = {
    firstname: 'Anant',
    lastname: 'kishore'
};
fullName(p);
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.empName = name;
    }
    Employee.prototype.greet = function () {
        console.log('Welcome, ' + this.empName);
    };
    return Employee;
}());
var emp1 = new Employee('Anant');
emp1.greet();
//console.log(emp1.empName);
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(managerName) {
        return _super.call(this, managerName) || this;
    }
    Manager.prototype.delegateWork = function () {
        console.log('Manager delegating task');
    };
    return Manager;
}(Employee));
var manager = new Manager('Anant');
manager.delegateWork();
manager.greet();
console.log(manager.empName);
