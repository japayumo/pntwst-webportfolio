// [Section] Syntax, Statements, and comments
console.log("Hello Eric!");

//[Section] Variables

//Declaring variables
let myVariable;
console.log(myVariable)

//Declaring and initializing variables
	//variable = value
let productName = "desktop computer";
console.log(productName);

productName = "laptop";
console.log(productName);

let productPrice = 18999;
console.log(productPrice);

const interest = 3.539;
console.log(interest);

/*interest = 10;*/

// let variable cannot be re-declared its scope.
let friend = "Kate";
console.log(friend);

/*let friend = "Jane";
console.log(friend);*/
// Uncaught SyntaxError: Identifier 'friend' has already been declared (at index.js:30:5)

//--------------------

// Reassigning variables

let supplier; //undefined

// Initialization
// Initialization is done after the variable has been declared
supplier = "John Smith Tradings";
console.log(supplier);

supplier = "Zuitt Store";
console.log(supplier);

// Can you declare a const variable w/o initialization?

//const pi; //No, An error will occur. It should have an initial value.

// Multiple variable declarations
let productCode = "DC017";
let productBrand = "Dell";
console.log(productCode, productBrand);

/* Data Types*/

// Strings
let country = 'Philippines';
let province = 'Metro Manila';

//Concatenating strings

let fullAddress = province + ', ' + country;
console.log(fullAddress);

let greeting = 'I live in the '+ country;
console.log(greeting);

let mailAddress = 'Metro Manila\n\nPhilippines';
console.log(mailAddress);

mailAddress = province + "\n\n" + country;
console.log(mailAddress);

let message = "John's Employee went home early";
console.log(message);

message = 'John\'s Employee went home early';
console.log(message);


// Numbers
let headcount = 26;
console.log(headcount);

// Decimal Numbers
let grade = 98.7
console.log(grade);

// Exponential notation
let planetDistance = 2e10;
console.log(planetDistance);

console.log("John's grade last quarter is " + grade);

// Boolean (true or false)
let isMarried = false;
let inGoodConduct = true;
console.log("Alma isMarried: " + isMarried);

// Arrays
let grades = [100, 99, 99.9, 99.8];
console.log(grades);

//
let person = {
	fullName: 'Juan Dela Cruz',
	age : 35,
	isMarried: false,
	contact: ["0917-123-4567" , "81234567"],
	address:{
		housenumber:'345',
		city: 'Manila'
	}
};

/*Syntax*/
/* let/const objectName={
	propertyA: valueA;
	propertyB: valueB;
	propertyC: valueC;	
}
*/

console.log(person);

/* type of operator isused to determine the type of data 
or value of a variable. It outputs a string that shwos the  data type.*/
console.log(typeof grades);
console.log(typeof person);

// Null
let spouse = null;

let myNumber = 0;
let myString = '';

console.log(spouse);

// Undefined
let fullName;
console.log(fullName);

// Undefined vs Null
/* It is an assignment value that represent 
a deliberate absence on any object value*/
/* In the context of JS, it need to be 
explicitly assigned to a variable*/
let varA = null;
console.log(varA);

/* When a variable is declared but not initialized */
let varB;
console.log(varB);

