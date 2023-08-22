// console.log('Hello');
	
/*1. Create a function called addNum which will be able to add two numbers.
	- Numbers must be provided as arguments.
	- Return the result of the addition.
   
   Create a function called subNum which will be able to subtract two numbers.
    - Numbers must be provided as arguments.
    - Return the result of subtraction.

    Create a new variable called sum.
     - This sum variable should be able to receive and store the result of addNum function.

    Create a new variable called difference.
     - This difference variable should be able to receive and store the result of subNum function.

    Log the value of sum variable in the console.
    Log the value of difference variable in the console.*/

// Addition
function addNum(num1, num2){
	let sum = num1 + num2;
	console.log("Displayed sum of " + num1 + " and " + num2);
	return sum;
};
console.log(addNum(5,15));


// Subtraction
function subNum(num1, num2){
	let difference = num1 - num2;
	console.log("Displayed difference of " + num1 + " and " + num2);
	return difference;
};
console.log(subNum(20, 5));


/*2. Create a function called multiplyNum which will be able to multiply two numbers.
	- Numbers must be provided as arguments.
	- Return the result of the multiplication.

	Create a function divideNum which will be able to divide two numbers.
	- Numbers must be provided as arguments.
	- Return the result of the division.

	Create a new variable called product.
	 - This product variable should be able to receive and store the result of multiplyNum function.

	Create a new variable called quotient.
	 - This quotient variable should be able to receive and store the result of divideNum function.

	Log the value of product variable in the console.
	Log the value of quotient variable in the console.*/

// Multiplication
function multiplyNum(num1, num2){
	let product = num1 * num2;
	console.log("The product of " + num1 + " and " + num2 + ":");
	return product;
};
console.log(multiplyNum(50, 10));


// Division
function divideNum(num1, num2){
	let quotient = num1 / num2;
	console.log("The quotient of " + num1 + " and " + num2 + ":");
	return quotient;
};
console.log(divideNum(50, 10));


/*3. Create a function called getCircleArea which will be able to get total area of a circle from a provided radius.
	- a number should be provided as an argument.
	- look up the formula for calculating the area of a circle with a provided/given radius.
	- look up the use of the exponent operator.
	- return the result of the area calculation.

	Create a new variable called circleArea.
	- This variable should be able to receive and store the result of the circle area calculation.
	- Log the value of the circleArea variable in the console.*/

function getCircleArea(radius){
	const pi = 3.1416;
	let circleArea = pi * (radius ** 2);
	console.log("The result of getting the area of a circle with " + radius + " radius:");
	return circleArea;
	// return Math.PI * (Math.pow (radius, 2)); // Other solution c/o Dude
};
console.log(getCircleArea(15));

/*4. Create a function called getAverage which will be able to get total average of four numbers.
	- 4 numbers should be provided as an argument.
	- look up the formula for calculating the average of numbers.
	- return the result of the average calculation.
	
	Create a new variable called averageVar.
	- This variable should be able to receive and store the result of the average calculation
	- Log the value of the averageVar variable in the console.*/

function getAverage(numA, numB, numC, numD){
	let averageVar = (numA + numB + numC + numD) / 4;
	console.log('The average of ' + numA + ', ' + numB + ', ' + numC + ', and ' + numD + ':');
	return averageVar;
};
console.log(getAverage(20, 40, 60, 80));


/*5. Create a function called checkIfPassed which will be able to check if you passed by checking the percentage of your score against the passing percentage.
	- this function should take 2 numbers as an argument, your score and the total score.
	- First, get the percentage of your score against the total. You can look up the formula to get percentage.
	- Using a relational operator, check if your score percentage is greater than 75, the passing percentage. Save the value of the comparison in a variable called isPassed.
	- return the value of the variable isPassed.
	- This function should return a boolean.

	Create a global variable called outside of the function called isPassingScore.
		-This variable should be able to receive and store the boolean result of the checker function.
		-Log the value of the isPassingScore variable in the console.*/

let isPassingScore = checkIfPassed(38, 50);

function checkIfPassed(yourScore, totalScore){
	let scorePercentage = (yourScore / totalScore) * 100;
	let isPassed = (scorePercentage >= 75);
	console.log('Is ' + yourScore + '/' + totalScore + ' a passing score?');
	return isPassed;
};

console.log(isPassingScore);

// More efficient solution 

/*function checkIfPassed(score, total){
	console.log(`Is ${score}/${total} a passing score?`);
	return ((score/total)) * 100 >= 75;
};

console.log(checkIfPassed(38,50));*/


//Do not modify
//For exporting to test.js
//Note: Do not change any variable and function names. All variables and functions to be checked are listed in the exports.
try{
	module.exports = {

		addNum: typeof addNum !== 'undefined' ? addNum : null,
		subNum: typeof subNum !== 'undefined' ? subNum : null,
		multiplyNum: typeof multiplyNum !== 'undefined' ? multiplyNum : null,
		divideNum: typeof divideNum !== 'undefined' ? divideNum : null,
		getCircleArea: typeof getCircleArea !== 'undefined' ? getCircleArea : null,
		getAverage: typeof getAverage !== 'undefined' ? getAverage : null,
		checkIfPassed: typeof checkIfPassed !== 'undefined' ? checkIfPassed : null,

	}
} catch(err){

}