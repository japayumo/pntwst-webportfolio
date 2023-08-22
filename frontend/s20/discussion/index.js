console.log("Hello World");

// Functions
/*
	Function in JS are lines/blocks of code that tell our device or applications 
	to perform a certain task when called/invoked.

	Functions are mostly created to create complicated tasks to run several lines 
	of codes in successsion.

	They are also used to prevent repeating lines/blocks of code that perform
	same task/function
*/

// function declaration
function printName(){
	console.log("My name is John");
}

// function invocation
printName();

/*
	Syntax:
		function functionName(){
			code block(statement)
		};

		// function keyword - used to define a JS function
		// functionName - the function name. Functions are named to be able to be invoked/called
		// function block ({}) - the statements which comprise the body of the function.

		// NOTE: Semicolons (;) are used to separate executable statements
		function functionName(){
			code block(statement);
			code block(statement);
			code block(statement)
		};

*/


// Hoisting
/* Hoisting is JS' behavior for certain variables 
and functions to run or use them before their declaration. */
declaredFunction();

function declaredFunction(){
	console.log("Hello world from declaredFunction()")
}

// declaredFunction();

// Function expression
// A function can also be stored in a variable. This is what we called function expression.
// A function expression is an anonymouse function assigned to a variable.
// Anoynmous function - a function w/o a name.

// variableFunction();
// Error - function expressions, being stored in a let or const variable cannot be hoisted.

let variableFunction = function(){
	console.log("Hello Again!");
};

variableFunction();

// We can also create a function of a named function
// However, to invoke the function expression, we invoke it by its variable name, not its function name
// Function Expressions are always invoked/called using its variable names.

let funcExpression = function funcName(){
	console.log("Hello from the other side");
};

//funcName(); // Error: funcName is not defined

/* You can reassign declared functions and function expressions to new 
anonymous functions*/

declaredFunction = function(){
	console.log("Updated declaredFunction")
};

declaredFunction(); 

funcExpression = function(){
	console.log("Hello, is it me you're looking for")
};

funcExpression();

/* However we cannot reassign a function expression initialized with const. */

const constantFunc = function(){
	console.log("Initialized with const!")
};

constantFunc();

/*constantFunc = function(){
	console.log("I want to change")
};*/

// Error: Uncaught TypeError: Assignment to constant variable.
// We cannot reassign function expression initialized with const.

// Name function
function helloWorld(){
	console.log("Hello World");
};

// Function expression
let helloWorld2 = function(){
	console.log("Hello World");
};

// Function scope
/*
	Scope is the accesibility/visibility of variables within a program

	Javascript variables has 3 types of scope:
	1.	local/block scope
	2.	global scope
	3.	function scope
*/

	{
		let localVar = "Armando Perez";
	}

	let globalVar = "Mr. Worldwide";

	console.log(globalVar);

	// console.log(localVar); // Error: Uncaught ReferenceError: localVar is not defined
	// local scope can't be called outside its code block.

	// Function Scope

	function showNames(){
		// function scoped variables
		var functionVar = "Joe";
		const functionConst = "John";
		let functionLet = "Jane";

		/*console.log(functionVar);
		console.log(functionConst);
		console.log(functionLet);*/
	};

		/*showNames();
		console.log(functionVar); // ReferenceError: functionVar is not defined
		console.log(functionConst);
		console.log(functionLet)*/


	// Function and GLobal Scoped Variable

	let globalName = "Pitbull";

	function myNewFunction(){
		let nameInside = "Renz";

		// Variables declared globally/outside the function have global scope.
		// Global variables can be accessed anywhere in a JS.
		// program including form inside a function
		console.log(globalName);
	}

	myNewFunction();

	//console.log(nameInside); // Error: ReferenceError: nameInside is not defined


	// Nested Functions
	// You can create another functon inside a function. THis is called nested function.
	/* This nested function, being inside the function will have access to the variable
	as they are within the same scope/code block */

	function myNewFunction(){
		let name = "Jane"

		function nestedFunction(){
			let nestedName = "John";
			console.log(name);
		}

		nestedFunction();
		// console.log(nestedName);
	}
	myNewFunction();

// [Section] Using alert();
	//alert("Hello world!");
	/* alert() allows us to show a small window at the top of our browser page to show
	information to our users.*/

	function showSampleAlert(){
		alert("Hello user");
	}

	// showSampleAlert();

// [Section] Using prompt
	// let samplePrompt = prompt("Enter your name");
	// console.log("Hello, " + samplePrompt);

	function printWelcomeMessage(){
		let firstName = prompt("Enter your first name");
		let lastName = prompt("Enter your last name");

		console.log("Hello, " + firstName + " " + lastName + "!")
		console.log("Welcome to my page!");
	}
	//printWelcomeMessage();


// Function Naming Conventions
	/* Function names should be definitive of the task it will perform.
	It is usually a verb */

	//




	// Accessing values inside the function
	/*function getCourses(){
		let courses = ["Science 101", "Math 101", "English 101"]
		return courses;
	}

	let courses = getCourses;
	console.log(courses);*/

	// Avoid using generic names to avoid confusion within your code
	function get(){
		let name = "Jamie";
		return name;

	};
	let name = get();
	console.log(name);


	// Avoid pointless and inappropriate function names

	function asd(){
		return 25%5;
	}

	console.log(asd());
	
	// Name your functions in small caps. Follow camelCase when naming variables and functions

	function displayCarInfo(){
		console.log("Brand: Toyota");
		console.log("Type: Sedan");
		console.log("Price: 1,500,000")
	}

	displayCarInfo();

	console.log("--------------------------");

	// Named function

	// Function declaration
	// "function" keyword
	//getDivisibility - name of the function
	// { } - code block (function scope)

	function getDivisibility(){
		// Declaration and initialization
		let numA = 10; // let - values can be reassigned
		const numB = 2; // values are constant/cannot be reassigned
		let remainder = (numA % numB);
		console.log("Remainder of 10/2: " + remainder);

		const divisibility = 0
		let isDivisible = (divisibility == remainder);
		let output = "Is 10 divisibile by 2? " + isDivisible;

		// console.log(`Is ${numA} divisible by ${numB}: ${isDivisible}`); // Shortcut c/o Eliot


		// return keyword
		return output;
		
	}



	// Invocation / Call

	getDivisibility();

	console.log("--------------------------");

	// Function Expression

	let divisibilityFunc = function(){
		let numA = 10; // let - values can be reassigned
		const numB = 2; // values are constant/cannot be reassigned
		let remainder = (numA % numB);
		// console.log("Remainder of 10/2: " + remainder);

		const divisibility = 0
		let isDivisible = (divisibility == remainder);
		let output = "Is 10 divisibile by 2? " + isDivisible;
		return output;
	};

	divisibilityFunc();



	