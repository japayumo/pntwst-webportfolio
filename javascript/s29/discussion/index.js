// ----- [Section] Exponent Operator -----

const firstNum = 8 ** 2;
console.log(firstNum); // Output: 64

const secondNum = Math.pow(8, 2);
console.log(secondNum); // Output: 64

// ----- [Section] Template Literals -----
/*
	- Allows to write strings without using the concatenation operator (+)
	- It greatly helps with code readability	
*/

let name = 'John';

// Pre-template Literal String
let message = 'Hello ' + name + '! Welcome to programming!';
console.log(message); // Output: Hello John! Welcome to programming!

// Strings using template literals
// Uses backticks (``)
message = `Hello ${name}! Welcome to programming!`;
console.log(message); // Output: Hello John! Welcome to programming!


let anotherMessage = `
${name} attended a Math competition. 
He won it by solving the problem 8 ** 2 with the answer of ${firstNum}.
`;
console.log(anotherMessage); // Output: John attended a Math competition. He won it by solving the problem 8 ** 2 with the answer of 64.

/*
	- Template literals allow us to write strings with embedded JavaScript Expressions
	- "${}" are used to include JavaScript Expressions in strings using template literals
*/

// ----- [Section] Array Destructuring -----
/*
	- Allows to unpack element in arrays into distinct variables
	- Syntax:
		- let/const [variableName, variableName, variableName] = array;
*/

const fullName = ['Juan', 'Dela', 'Cruz'];

// Pre-Array Destructuring
console.log(fullName[0]); // Output: Juan
console.log(fullName[1]); // Output: Dela
console.log(fullName[2]); // Output: Cruz

console.log(`Hello ${fullName[0]} ${fullName[1]} ${fullName[2]}!. It's nice to meet you!`); // Output: Hello Juan Dela Cruz!. It's nice to meet you!


// Array Destructuring
const [firstName, middleName, lastName] = fullName
console.log(firstName);
console.log(middleName);
console.log(lastName);
console.log(fullName);

console.log(`Hello ${firstName} ${middleName} ${lastName}!. It's nice to meet you!`); // Output: Hello Juan Dela Cruz!. It's nice to meet you!

// [Section]Object Destructuring
/*
	- Allows to unpack properties of objects into distinct variables
	- Syntax:
		- let/const [variableName, variableName, variableName] = object; 
*/

const person = {
	givenName: 'Jane',
	maidenName: 'Dela',
	familyName: 'Cruz'
};

// Pre-Object Destruction
console.log(person.givenName); // Output: Jane
console.log(person.maidenName); // Output: Dela
console.log(person.familyName); // Output: Cruz
console.log(`Hello ${person.givenName} ${person.maidenName} ${person.familyName}! It's good to see you again`) // Output: Hello Jane Dela Cruz! It's good to see you again

// Object Destructuring
const {givenName, maidenName, familyName} = person
console.log(givenName); // Output: Jane
console.log(maidenName); // Output: Dela
console.log(familyName); // Output: Cruz
console.log(`Hello ${givenName} ${maidenName} ${familyName}! It's good to see you again`); // Output: Hello Jane Dela Cruz! It's good to see you again

function getFullName({givenName, maidenName, familyName}){
	console.log(`${givenName} ${maidenName} ${familyName}`) // Output: Jane Dela Cruz
};

getFullName(person);

// [Section] Arrow Function
/*
	- This is a compact alternative syntax to traditional functions
	- Useful for code snippets where craeting function will not be reused in any other portion of the code
*/

function printFullName(fName, mInitial, lName){
	console.log(`${fName} ${mInitial} ${lName}`);
};

printFullName('John', 'D', 'Smith'); // Output: John D Smith

const printName = (fName, mInitial, lName) => {
	console.log(`${fName} ${mInitial} ${lName}`);
};

printName('Aang', 'D', 'Avatar'); // Output: Aang D Avatar


// Implicit Return Statemet
/*
	- These are instances when you can omit the "return" statement
	- This works because even w/o the "return" statement, JavaScript implicitly adds it for the result of the function
*/

// Pre-Arrow Function
const add = (x,y) => {
	console.log(x + y);
};

add (1, 2); // Output: 3

// Pre-Arrow Function
const addNum = (x,y) => x + y;
console.log(addNum(1, 2)); // Output: 3


// Arrow Function with Loops
const students = ['John', 'Jane', 'Judy'];

students.forEach(function(student){
	console.log(`${student} is a student`)
}); // Output: John is a student
//			   Jane is a student
//			   Judy is a student

students.forEach((student) => {
	console.log(`${student} is a student`)
}); // Output: John is a student
//			   Jane is a student
//			   Judy is a student

students.forEach((student) => console.log(`${student} is a student`));
// Output: John is a student
//		   Jane is a student
//		   Judy is a student

// ------ [Section] Class-Based Object Blueprints -----
/*
	- The constructor is a special method of a class for creating/initializing an object for that class
	- The "this" keyword refers to the properties of an object created/initialized from the class

	- By using the "this" keyword and accessing an object property this allows us to reassign its values
	- Syntax:
		class className{
			constructor(objectPropertyA, objectPropertyB){
				this.objectPropertyA = objectPropertyA;
				this.objectPropertyB = objectPropertyB;
			}
		}
*/
class Car{
	constructor(brand, name, year){
		this.brand = brand;
		this.name = name;
		this.year = year;
	}
};

// Instantiating an object

const myCar = new Car();
console.log(myCar); // Output: Car {brand: undefined, name: undefined, year: undefined}

/*
	- Creating a constant with the "const" keyword and assigning it a value of an object makes the variable itself immutable,so you cannot reassign it to hold another object. However,
	- It does not mean that it's properties cannot be changed/immutable
*/
myCar.brand = 'Ford';
myCar.name = 'Ranger Raptor';
myCar.year = 2021;

console.log(myCar); // Output: Car {brand: 'Ford', name: 'Ranger Raptor', year: 2021}
// You cannot update the array and/or constructor as a whole, but you can update it by updating each property

// myCar = {brand:'Toyota', name:'Innova', year:2022}; // Uncaught TypeError: Assignment to constant variable.

// myCar = ('Toyota', 'Vios', 2023); // Uncaught TypeError: Assignment to constant variable.

// Creating/Instantiatin g a new objec from the car class with initialized values
const myNewCar = new Car('Toyota', 'Vios', 2022);
console.log(myNewCar); // Output: Car {brand: 'Toyota', name: 'Vios', year: 2022}