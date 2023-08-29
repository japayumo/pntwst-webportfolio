/*console.log("Hello World");*/

// Arithmetic Operators
// +, -, *, /, %

// Assignment Operators
	// Basic Asssignment Operator (=)
	/* The assignment operators adds the value of the 
	right operand to a variable and assigns the resilt 
	to the variable*/
	let assignmentNumber = 8;

	// Addition Assignment Operator (+=)
	assignmentNumber += 2;
	console.log("Result of addition assignment operator: " + assignmentNumber)

	/*assignmentNumber = assignmentNumber + 2;
	console.log("Result of addition assignment operator: " + assignmentNumber)*/

	// Subtraction/Multiplication/Division Assignment Operator (-=, *=, /=)
	assignmentNumber -= 2;
	console.log("Result of subtraction assignment operator: " + assignmentNumber);	
	assignmentNumber *= 2;
	console.log("Result of multiplication assignment operator: " + assignmentNumber);
	assignmentNumber /= 2;
	console.log("Result of division assignment operator: " + assignmentNumber);

	// Modulo
	let number = 10;
	let r = number % 9;
	console.log(r);

// Increment and decrement
	/* Operators that add or subtract values by 1 
	and reassigns the value of the variable where 
	the increment/decrement was applied */

	// Pre-incerement
	let z = 1;
	let increment = ++z;
	console.log("Result of pre-increment (increment): " + increment);
	console.log("Result of pre-increment (z): " + z);

	// Post-increment
	let a = 1;
	increment2 = a++;
	console.log("Result of post-increment (increment): " + increment2);
	console.log("Result of post-increment (a): " + a);

	increment2 = a++;
	console.log("Result of post-increment (increment): " + increment2);
	console.log("Result of post-increment (a): " + a);

	// Pre-decrement
	let y = 2;
	let decrement = --y;
	console.log("Result of pre-decrement (decrement): " + decrement);
	console.log("Result of pre-decrement (y): " + y);


	// Post-decrement
	let b = 2;
	let decrement2 = b--;
	console.log("Result of post-decrement (deccrement): " + decrement2);
	console.log("Result of post-decrement (b): " + b);

// Type Coercion
	/*Type coercion is the automatic or the implicit conversion of values
	from one data type to another*/

	let numA = '10';
	let numB = 12;

	let coercion = numA + numB;
	console.log(coercion);
	console.log(typeof coercion);

	/*Adding/concatenating a string and a number will result to a string*/

	/*------------------------*/
	let numC = 16;
	let numD = 14;
	let nonCoercion = numC + numD;
	console.log(nonCoercion);
	console.log(typeof nonCoercion);

	// The result is a number

	/*-----------------------*/

	/*
		true = 1
		false = 0
	*/
	let numE = true + 1;
	console.log(numE);

	/*
		The result is a number
		The boolean "true" is also associated withe the value of 1
	*/

	let numF = false + 1;
	console.log(numF);
	/*
		The result is a number
		The boolean "false" is also associated withe the value of 0
	*/

// Comparison Operators

	let juan = 'juan';

	// Equality operator (==)
	/*
		- Checks whether the operands are equal or have the
		same content. 
		- It also attempt to CONVERT and COMPARE operands of 
		different data types.
		- Returns a boolean value (true or false)
	*/
	
	console.log(1==1);
	console.log(1==2);
	console.log(1=='1'); // Output is true
	console.log (0 == false); // output is true
	/* Compaers two strings if they are the same (spelling, casing,
	and spaces are considered for comparing.
	*/
	console.log('juan' == juan);
	// Compares a string with the variable 'juan' declared above
	console.log('juan' == juan);


	// Inequality Operator
	console.log(1!=1);
	console.log(1!=2);
	console.log(1!='1'); // output is false
	console.log(0!=false); // output is false since false = 0
	console.log('juan'!='juan'); // output is false 
	console.log('juan'!=juan); // output is false 

	// Strict Equality Operator
	console.log(1===1); // true
	console.log(1===2);	// false
	console.log(1==='1'); // false
	console.log (0 === false); // false (same value, diff data type)
	console.log('juan' === juan); // true
	console.log('juan' === juan); // true

console.log('-------------------------');
// Relational Operators
	let num1 = 50;
	let num2 = 65;

	// greater than operator
	let isGreatherThan = num1 > num2; //false
	console.log(isGreatherThan);

	// less than operator
	let isLessThan = num1 < num2; //true
	console.log(isLessThan);

	// greater than or equal operator
	let isGTorEqual = num1 >= num2; // false
	console.log(isGTorEqual);

	// less than or equal operator
	let isLTorEqual = num1 <= num2; // true
	console.log(isLTorEqual);

console.log('-------------------------');
// Logical Operators

	let isLegalAge = true;
	let isRegistered = false;

	// Logical AND Operator (&& Double ampersand)
	// Returns true if ALL operands are TRUE
	let allRequirementsMet = isLegalAge && isRegistered;
	console.log("Result of logical AND operator: "+ allRequirementsMet);

	// Logical OR operator (|| Double pipe)
	// Returns true if one of the operands are TRUE
	let someRequirementsMet = isLegalAge || isRegistered;
	console.log("Result of logical OR operator: "+ someRequirementsMet);

	let someRequirementsNotMet = !isRegistered;
	console.log("Result of logical NOT operator: " + someRequirementsNotMet);

	