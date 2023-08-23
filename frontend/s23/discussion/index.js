// console.log('Hello');

// While Loop
let count = 5 // initial value

while (count !==0 ){ // condition

	// statements
	console.log(`Count: ${count}`);
	console.log('Thank you for the pizza');

	// decreases the value of count by 1 every iteration
	count--; // count = count - 1

};
console.log("----------------------")
let counter = 0

while (counter < 6){
	console.log(counter);
	counter++;
};


/*------------------------------------*/
console.log("----------------------")
// Do While Loop
/*
	- The 'Number' function works similarly to the 'parseInt' function
	- Both differ significantly in terms of processes being undertaken
	in converting information into a number data type and other features
	that help with manipulating data.
*/
/*let number = Number(prompt(`Give me a number`));
do{
	console.log(`Do while: ${number}`);

	// increases the value of 'number' by 1 in every iteration
	number++; // number += 1; // number = number + 1
}
while(number < 10);
*/
console.log("----------------------")
let num = 146

while (num <=162){
	console.log(num);
	// num++;
	num+=16;
};


/*------------------------------------*/
console.log("----------------------")
// For Loop

// initialization; condition; iteration
for(let count = 0; count < 6; count++){
	console.log(count);
};

/*
	- A for loop is more flexible than while or do-while
	loop. It consists of 3 parts.(Initialization, expression/condition,
	finalExpression/Iteration).

	The for loop encapsulates the initlaization, condition
	and iteration all within its structure. This can lead
	to cleaner and more concise code, as you don't need to 
	declare these components outside the loop.

	1.  "Initialization", at the beginning of the loop, an initial value
	is set to track the loop's progression. This value seves as the 
	staring point for loop's iteration.
	2. The "expression/condition" that will be evaluated which will 
	determine whether the loop will run one more time.
	3. The "finalExpression/iteration" indicates how to advance the loop.
*/

console.log("----------------------")

for (count = 227; count <= 756; count+=529){
	console.log(count);
};

console.log("----------------------")
let myName = "JAcOb"

// console.log(myName[0]);
// 0 1 2 3 4
// J A c O b

for(let i = 0; i < myName.length; i++){
	// console.log(myName[i].toLowerCase());

	if (
		myName[i].toLowerCase() == "a" ||
		myName[i].toLowerCase() == "e" ||
		myName[i].toLowerCase() == "i" ||
		myName[i].toLowerCase() == "o" ||
		myName[i].toLowerCase() == "u" 

		){
		console.log(myName[i] + " is a vowel");
	}

	else{
		console.log(myName[i] + " is not a vowel");
	};
}

/*------------------------------------*/
console.log("----------------------")

// Continue and Break
let name = 'Alejandro'
for(let i = 0; i < name.length; i++){

	// The current letter is printed out based on its index
	console.log(name[i]);

	if(name[i].toLowerCase() === "a"){
		console.log("Continue to the next iteration")
		continue;
	}

	if(name[i].toLowerCase() === "d"){
		console.log("Break it down yow");
		break;
		/* break - tells te code to terminate/stop the loop even if 
		the expression/condition of the loop defines it should execute*/
	}
};

console.log("----------------------")
for(let count=0; count <= 20; count++){
	if(count%2 === 0){
		console.log(count);
		console.log("Continue");
		continue;
		// continue - tells the code to continue to the next iteration of the loop.
		// This ignores all statements after the continue statement.
	}

	/*if (count%4 === 0){
		console.log(count);
		console.log("Break");
		break;	
	}*/

	if(count > 10){
		console.log(count);
		console.log("Break");
		break;
	}
};