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

console.log("---------------------------");
console.log("---------------------------");

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
	else if(windSpeed > 89 || windSpeed <=117){
		return 'Severe tropical storm detected'
	}
	else{
		return 'Typhoon detected';
	}
};

message = determineTyphoonIntensity(110);
console.log(message);

console.log(determineTyphoonIntensity(110));