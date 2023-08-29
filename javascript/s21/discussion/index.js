// console.log("Hello");

/*function userInput(){
	let name = prompt("Enter your name: ")
	return name;
}

console.log(userInput());*/
/*-------------------------------------------------------------------*/
// Prompt - prompt outputs a STRING

/*function printInput(){
	let nickname = prompt("Enter your nickname");
	console.log("Hi, " + nickname);
};

printInput();*/

// However, for some cases, this may not be ideal

/* FOr other cases, function process data directly passed
into it instead of relying on Global variables and prompt. */

/*--------------------------------------------------------------------*/
function printName(name){
	console.log("My name is " + name);
}

printName("zxc");

// 'name' is called a parameter
// A parameter acts as named variable/container that exists only inside of a function
// It is used to store information that is provided to a function when is is called/invoked

// Argument
// "Juana", the information/data provided directly into the function is called an argument
// Value/s are passed into the parameters

let sampleVariable = "Yui";
printName(sampleVariable);

/*---------------------------------------------------------------------*/

console.log("---------------------")

function checkDivisibilityBy8(num){
	let remainder = num % 8;
	console.log("The remainder of " + num + " divided by 8 is " + remainder);
	let isDivisibleBy8 = remainder === 0;
	console.log("Is " + num + " divisible by 8? \n")
	console.log(isDivisibleBy8);
};

checkDivisibilityBy8(64);
checkDivisibilityBy8(10);

/* YOu can also do the same using prompt(), however, take not that prompt() outputs a string.
Strings are not ideal for mathematical expressions*/

/*----------------------------------------------------------------------*/
console.log("---------------------")

function argumentFunction(){
	console.log("This function was passed as an argument before the message was printed");
};

function invokeFunction(parameterFunction){
	console.log(parameterFunction);
	//argumentFunction();
};

invokeFunction(argumentFunction());

// Using multiple parameters

/*----------------------------------------------------------------------*/
console.log("---------------------")

function createFullName(firstName, middleName, lastName){
	console.log(firstName + ' ' + middleName + ' ' + lastName);
}

createFullName("Juana", "Dela", "Cruz");

/*
	"Juana" will be stored in th parameter "firstName"
	"Dela" will be stored in th parameter "middleName"
	"Cruz" will be stored in th parameter "lastName"
*/

createFullName("Juana", "Dela");
/*
	- Providing less arguments thna the expercted parameters will autmatically 
	assign an undefined value to the parameter

	- In other prog languages, this will return an ERROR, stating that "the expected 
	number of arguments do not match number of parameters"
*/

createFullName("Juana", "Dela", "Cruz", "wiw");


// Using variables as arguments
let firstName = "John";
let middleName = "Doe";
let lastName = "Smith";

createFullName(firstName, middleName, lastName);

/* 
	The order of the argument is the same to the order of the parameters.
	The first argument will be stored in the first parameter, The second argument 
	will be stored in the second parameter, The third argument will be stored in 
	the third parameter, and so on ...
*/

function printFullName(middleName, firstName, lastName){
	console.log(firstName + ' ' + middleName + ' ' + lastName);
}

printFullName("Juana", "Dela", "Cruz");

/*----------------------------------------------------------------------*/
console.log("---------------------")

// Using alert()
function showSampleAlert(name){
	alert("Hello, " + name);
}

/*showSampleAlert("Topher");

console.log("I will only log inside the console whne the alert is dismissed.");
console.log("A");
console.log("B");
console.log("C");
*/


// Using prompt()
// prompt() allows us to show a small window at the top of the browser to gather user input.
/*let samplePrompt = prompt("Enter your name");
console.log("Hello, " + samplePrompt);*/

/*----------------------------------------------------------------------*/
console.log("---------------------")

function printWelcomeMessage(){
	let student1 = prompt("Enter student 1: ")
	let student2 = prompt("Enter student 2: ")
	console.log("Welcome back, " + student1 + ' and ' + student2);
	console.log("Congratulations! " + student1)
}

// printWelcomeMessage();

// Argument as prompt()

function printNewlyGrad(student1){
	console.log("Congratulations! " + student1)
}

printNewlyGrad(prompt("Enter student 1: "));
