// Non-Mutator methods
/*
	- Non-mutator methods are function that do not modify or change an array after they are created.

	- These methods do not manipulate the original array performing various takss such as returning elements from an array and combining arrays, and printing the output
*/

let countries = ['US', 'PH', 'CAN', 'SG', 'TH', 'PH', 'FR', 'JP'];

/*--------------------------------------------------------------*/

// indexOf()
/*
	- Returns the index number of the first matching element found in an array
	
	- If no match was found, the result will be -1.

	- Syntax:
		arrayName.indexOf();
*/
let firstIndex = countries.indexOf('PH');
console.log('Result of indexOf method: ' + firstIndex);
// Console: Result of indexOf method: 1

let noMatch = countries.indexOf('BR');
console.log('Result of indexOf method: ' + noMatch);
// Console: Result of indexOf method: -1


/*--------------------------------------------------------------*/
console.log('-----------------------------')

// lastIndexOf()
/*
	- Returns the index number of the last matching element found in an array.

	- The search process will be done from the last element proceeding to the first element.

	- Syntax:
		arrayName.lastIndexOf(); 
*/

let lastIndex = countries.lastIndexOf('PH')
console.log('Result of lastIndexOf method: ' + lastIndex);
// Console: Result of indexOf method: 5

let lastIndexStart = countries.lastIndexOf('PH', 6);
console.log('Result of lastIndexOf method: ' + lastIndexStart);
// Console: Result of indexOf method: 5

let lastIndexStart2 = countries.lastIndexOf('PH', 4);
console.log('Result of lastIndexOf method: ' + lastIndexStart2);
// Console: Result of indexOf method: 1

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// slice()
/*
	- Portions/slices elements from an array and returns a new array.

	- Syntax:
		arrayName.slice(startingIndex);
		arrayName.slice(startingIndex, endingIndex);
*/

let slicedArrayA = countries.slice(2);
console.log('Result from slice method: ');
console.log(slicedArrayA);
/* Console: Result from slice method: 
			(6) ['CAN', 'SG', 'TH', 'PH', 'FR', 'JP'] */

// Slice off elements from specified index to another index
let slicedArrayB = countries.slice(4);
console.log(slicedArrayB);
// Console: (4) ['TH', 'PH', 'FR', 'JP']

let slicedArrayB2 = countries.slice(2,7);
console.log(slicedArrayB2);
// Console: (5) ['CAN', 'SG', 'TH', 'PH', 'FR']

let slicedArrayB3 = countries.slice(6,2);
console.log(slicedArrayB3);
// Console: [] // Does not work from right to left

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// toString()
/*
	- Return an array to string separated by commas

	- Syntax:
		arrayName.toString();
*/
let stringArray = countries.toString();
console.log(stringArray);
// Console: US,PH,CAN,SG,TH,PH,FR,JP

let num = 100
console.log(num);
console.log(typeof num);
console.log(num.toString());
console.log(typeof num.toString());
/* Console:
	100
	number
	100
	string
*/

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// concat()
let taskArrayA = ["drink html", "eat javascript"];
let taskArrayB = ["inhale css", "breathe bootstrap"];
let taskArrayC = ["sleep with git", "coffee with java"];

let tasks = taskArrayA.concat(taskArrayB);
console.log(`Result from concat method:`)
console.log(tasks);
/* Console: Result from concat method:
			(4)['drink html', 'eat javascript', 'inhale css', 'breathe bootstrap'] */

let allTasks = taskArrayA.concat(taskArrayB, taskArrayC);
console.log(`Result from concat method:`)
console.log(allTasks);
// Console: (6) ['drink html', 'eat javascript', 'inhale css', 'breathe bootstrap', 'sleep with git', 'coffee with java']

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// join()
/*
	- Returns an array as string separated by specified separator string
*/

let users = ['John', 'Jane', 'Joe', 'Jobert'];
console.log(users.join());
// Console: John,Jane,Joe,Jobert

console.log(users.join(" "));
// Console: John Jane Joe Jobert

console.log(users.join(" - "));
// Console: John - Jane - Joe - Jobert

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// Iteration Method

// forEach()

console.log(allTasks); // ['drink html', 'eat javascript', 'inhale css', 'breathe bootstrap', 'sleep with git', 'coffee with java']

/*
	- Similar to for loop that iterates on each array element.

	- For each item in the array, the anonymous function passed in the forEach will be run.
*/
allTasks.forEach(function(task){
	console.log(task);
});
/*
console: drink html
		 eat javascript
		 inhale css
		 breathe bootstrap
		 sleep with git
		 coffee with java
*/

// Using forEach with conditional statements

// ['drink html', 'eat javascript', 'inhale css', 'breathe bootstrap', 'sleep with git', 'coffee with java']

let filteredTasks = [];
allTasks.forEach(function(task){

	if(task.length > 10){
		filteredTasks.push(task);
	}

});
console.log(filteredTasks); // (4) ['eat javascript', 'breathe bootstrap', 'sleep with git', 'coffee with java']

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// map()

/*
	-Iterates on each elmeent AND returns new array with different values depending on the result of the function's operator

	- This is useful for performaing tasks where mutating/changing the elements are required.

	- Unlike the forEach method, the map method requires the use of "return" statement in order to create another array with the performed operation
*/

let numbers = [1, 2, 3, 4, 5];
let numberMap = numbers.map(function(number){
	return number * number
});

console.log(`Original Array:`); // Original Array:
console.log(numbers); // (5) [1, 2, 3, 4, 5]

console.log(`Result of map method:`); // Result of map method:
console.log(numberMap); // (5) [1, 4, 9, 16, 25]

// map() vs forEach()
let numbersForEach = numbers.forEach(function(number){
	return number * number
});

console.log(numbersForEach); // Console: undefined

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// every()
/*
	- Checks if all elements in an array meet the given condition
*/

// let numbers = [1, 2, 3, 4, 5];
let allValid = numbers.every(function(number){
	return (number < 3);
});

console.log("Result of every method: ") // Result of every method: 
console.log(allValid); // false

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// some()
/*
	- Checks if at least one element in the array meets the given condition
*/


// let numbers = [1, 2, 3, 4, 5];
let someValid = numbers.some(function(number){
	return (number < 3);
});

console.log("Result of every method: ") // Result of some method: 
console.log(someValid); // true

if(someValid){
	console.log('Some numbers in the array are less than 3')
}; // Some numbers in the array are less than 3 // will display since someValid is truthy

if(allValid){
	console.log('ALl numbers in the array are less than 3')
}; // won't display since allValid is falsy

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// filter()
/*
	- Returns a new array that contains elements which meets the given condition

	- Returns an empty array if no elements were found
*/

let filterValid = numbers.filter(function(number){
	return (number < 3);
});

console.log("Result of filter method: ") // Result of filter method: 
console.log(filterValid); // (2) [1, 2]


let nothingFound = numbers.filter(function(number){
	return (number === 0);
});

console.log("Result of filter method: ") // Result of filter method: 
console.log(nothingFound); // []

// --------

let filteredNumbers = [];
numbers.forEach(function(number){
	// console.log(number);
	if (number > 3){
		filteredNumbers.push(number);
	}
})

console.log("Result of filter method: ") // Result of filter method: 
console.log(filteredNumbers); // (2) [4, 5]

console.log('-----------------------------')
// monitoring index number
// let numbers = [1, 2, 3, 4, 5];
numbers.forEach(function(number, index){
	console.log(`Index: ${index} -- Number: ${number}`)
	// console.log('Index: ' + index);
	// console.log('Number ' + number);
});

/*
	Console: Index: 0 -- Number: 1
			 Index: 1 -- Number: 2
			 Index: 2 -- Number: 3
			 Index: 3 -- Number: 4
			 Index: 4 -- Number: 5
*/

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// includes()
/*
	- inlcudes() method checks if te argument passed can be found in an array
	- it returns a boolean which can ba saved in a variable
*/

let inventory = ['Mouse', 'Keyboard', 'Laptop', 'Monitor'];
let productFound1 = inventory.includes('Mouse')
console.log(productFound1); // true

let productFound2 = inventory.includes('Headset')
console.log(productFound2); // false

/*
	- Methods can be "chained" using them one after another
*/

// let inventory = ['Mouse', 'Keyboard', 'Laptop', 'Monitor'];
let filteredProducts = inventory.filter(function(item){
	return item.toLowerCase().includes('a');
});

console.log(filteredProducts); // (2) ['Keyboard', 'Laptop']

/*--------------------------------------------------------------*/
console.log('-----------------------------')

// reduce()
/*
	- How the "reduce" method works
	1. The first/result element in the array is stored in the "accumulator" parameter.
	2. The second/next element in the array is stored to the "currentValue" parameter.
	3. An operation is performed on the two elements.
*/

let iteration = 0;

let reducedArray = numbers.reduce(function(acc,curr){
	console.warn(`current iteration ${++iteration}`)
	console.log('accumulator: ' + acc);
	console.log('currentValue: ' + curr);
	console.log(`Result of return: ${acc + curr}`)

	return acc + curr;

});

console.log(`Result of reduced method:`)
console.log(reducedArray);

/*	Console:
	current iteration 1
	accumulator: 1
	currentValue: 2
	Result of return: 3

	current iteration 2
	accumulator: 3
	currentValue: 3
	Result of return: 6

	current iteration 3
	accumulator: 6
	currentValue: 4
	Result of return: 10

	current iteration 4
	accumulator: 10
	currentValue: 5
	Result of return: 15

	Result of reduced method:
	15
*/

let list = ['Hello', 'Again', 'World'];
let joinedWReduceMethod = list.reduce(function(acc,curr){
	return acc + curr;
});

console.log(`Result of reduced method: ${joinedWReduceMethod}`); // Result of reduced method: HelloAgainWorld
