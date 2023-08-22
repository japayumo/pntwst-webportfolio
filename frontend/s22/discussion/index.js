// console.log('hello')

/* What are conditional statements? Conditional statements allow
us to control the flow of our program. It allows us to run a 
statement/instruction if a condition is met or runa nother separate 
instruction otherwise. */

// [Section] if, else if, and else statement

let numA = -1

// if statement
// Executes a statement if a specified condition is true
if (numA < 0){
	console.log('Negative number');
};

/*
	Syntax:

	if(condition){
		statement
	};
*/

console.log(numA < 0);
// Results to true, so the if statement will run.

numA = 0

if (numA < 0){
	console.log('Negative number');
};
// It will not run because the expression results to false
console.log(numA < 0);

let city = "New York";
if (city === "New York"){
	console.log("Welcome to New York City!");
};

/*---------------------------------------------------------*/
// else-if clause

/*
	- Executes a statement if previous conditions are false, 
	and if the specified condition is true.

	- The "else-if" clause is optional and can be added to
	capture additional conditions to change the flow of a
	program
*/

console.log("------------------------");
console.log("------------------------");

let numH = 1;
if(numH < 0){
	console.log("Negative number")
}

else if(numH > 0){
	console.log("Positive number")
};


/*let numX = -1;
if(numX < 0){
	console.log("Negative number");
}

else if(numX > 0){
	console.log("Negative number detected");
};*/

city = "Tokyo"

if (city === "New York"){
	console.log("Welcome to New York City!")
}
else if(city === "Tokyo"){
	console.log("Welcome to Tokyo, Japan")
};

// else statement
/*
	- Executes a statement if all other conditions are false
	- THe 'else' statement is optional and can be added to
	capture any other result to change the flw of a program.
*/

numH = 0;

if(numH < 0){
	console.log("Negative number")
}

else if(numH > 0){
	console.log("Positive number")
}
else{
	console.log("Zero")
};

/*
	- Since both preceding if and else if conditions failed,
	the else statement will run instead.

	- Else statement should only be addded if there is a preceding 
	if condition. Else statement by itself will not work.

	- However, if statements will work even if there is no else statement.
*/

let message = "No message";
console.log(message);

function determineTyphoonIntensity(windSpeed){
	if (windSpeed < 30){
		return 'Not a typhoon yet';
	}
	else if(windSpeed <= 61){
		return 'Tropical depression detected';
	}
	else if(windSpeed >= 62 && windSpeed <= 88){
		return 'Tropical storm detected';
	}
	else if(windSpeed >= 89 && windSpeed <=117){
		return 'Severe tropical storm detected'
	}
	else{
		return 'Typhoon detected';
	}
};

message = determineTyphoonIntensity(110);
console.log(message);

console.log(determineTyphoonIntensity(110));

/*---------------------------------------------------------*/
// [Section] Truthy and Falsy

/*
	- In JavaScript a "truthy" value is a value that is considered
	true when encountered in a  Boolean context

	- Values are considered true unlesss defined otherwise
*/

// Truthy Examples
if(true){
	console.log('Truthy');
}

if(1){
	console.log('Truthy');
}

if([]){
	console.log('Truthy');
}

// Falsy Examples
if(false){
	console.log('Falsy')
}

if(0){
	console.log('Falsy')
}

if(undefined){
	console.log('Falsy')
}

/*console.log(true + 1);
console.log(false + 1);*/

if('asd'){
	console.log('Truthy');
}

/*---------------------------------------------------------*/
console.log("-----------------------");
console.log("-----------------------");
// [Section] Conditional (Ternary) Operator
/*let ternaryResult = (1 < 18) ? 'Yes' : 'No' ;
console.log("Result of Ternary Operator: " + ternaryResult);*/

let ternaryResult = (1 < 18) ? true : false ;
console.log("Result of Ternary Operator: " + ternaryResult);
/*
	- Ternary result operator has implicit return
*/
// Translation to if else statement
function checkIfLesser(){
	if (1 < 18){
		return true;
	}
	else{
		return false;
	}
};

let ternaryResult2 = checkIfLesser();
console.log(ternaryResult2);

/*---------------------------------------------------------*/

// Using diff possible output aside from true or false
/*let name;

function isOfLegalAge(){
	name = 'John';
	return 'You are of the legal age limit';
}

function isUnderAge(){
	name = 'Jane';
	return 'You are under the age limit';
}

let age = parseInt(prompt("What is your age?"));
console.log(age);
let legalAge = (age > 18) ? isOfLegalAge() : isUnderAge();
console.log("Result of Ternary Operator in functions: " + legalAge + ', ' + name);*/

/*---------------------------------------------------------*/

// [Section] Switch Statement
/*let day = prompt("What day of the week is it today?").toLowerCase();
console.log(day);

switch(day){
	case 'monday':
		console.log('The color of the day is red');
		break;

	case 'tuesday':
		console.log('The color of the day is orange');
		break;

	case 'wednesday':
		console.log('The color of the day is yellow');
		break;

	case 'thursday':
		console.log('The color of the day is green');
		break;

	case 'friday':
		console.log('The color of the day is blue');
		break;

	case 'saturday':
		console.log('The color of the day is indigo');
		break;

	case 'sunday':
		console.log('The color of the day is violet');
		break;

	default:
		console.log('Please input a valid day');
		break;
}*/
/*---------------------------------------------------------*/

// [Section] Try-Catch-Finally Statement
// Error handlers
// Program still runs even with errors/warn

function showIntentistyAlert(windSpeed){
	try{
		alerat(determineTyphoonIntensity(windSpeed));
	} 
	// error / err are commonly used variable names used by developers used by developers for storing errors.
	catch(error){
		console.error(error);
		console.log(typeof error);
		//console.warn(error.message);
		//console.error("ERROR: Wrong spelling / casing of alert() function");
	}
	finally{
		/* continue executiion of code regardless of success and failure of code
		execution in the 'try' block to handle/resolve errors*/
		alert('Intensity updates will show new alert.');
	}
}
showIntentistyAlert(56);

console.log("End of s22");

/*
	- The "try-catch" statement are commonly used for error handling 
	- There are instances when the application returns an error warning that 
	is not necessarily in the context of our code.
	- They are used to specif are response whenever an exception/error 
	is received.

	-It is also useful for debugging code because of the "error" object that
	can be caught using try-catch statement
	-In most programming languages, an "error" object is used to provide detailed 
	information about an error and which also provides access to function that can be 
	used to handle/resolve errors to create "exceptions" within our code

	- The finally blocked is used to specify a response or action that is used to 
	handle/resolve errors.
*/