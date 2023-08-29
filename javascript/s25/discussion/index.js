let studentNumberA = '2020-1923'
let studentNumberB = '2020-1924'
let studentNumberC = '2020-1925'
let studentNumberD = '2020-1926'
let studentNumberE = '2020-1927'

// Now, with an array, we can simply write the code above like this:
let studentNumbers = ['2020-1923','2020-1924','2020-1925','2020-1926','2020-1927'];

// Arrays 
/*
	- are used to store multiple related values in a single variable.
	- They are declared using square brackets([]) also known as
	"Array Literals"
*/

// Common examples of arrays
let grades = [76, 99, 100, 98];
let computerBrands = ['Acer', 'Asus', 'Lenovo', 'HP', 'Apple', 'Dell', 'Redfox', 'MSI', 'Samsung'];

let mixedArr = [12, 'Asus', null, undefined, {}]
console.log(grades);
console.log(computerBrands);
console.log(mixedArr);

// Alternative way to write arrays in JS

let myTasks = [
	'drink html',
	'eat javascript',
	'inhale css',
	'snack java spring boot'
];
console.log(myTasks);

let city1 = 'Tokyo';
let city2 = 'Manila';
let city3 = 'Hongkong';

let cities = [city1, city2, city3];
console.log(cities);

// Length Property
// The length property allows us to get and set the total number of items in an array
console.log(myTasks.length);

// length property can also be used with strings
let fullName = "Jamie Noble";
console.log(fullName.length);


// Delete the last item in an array
myTasks.length = myTasks.length-1;
console.log(myTasks);

// Another example using decrementation
cities.length--;
console.log(cities);

// However we cann't do the same on strings
fullName.length = fullName.length -1;
console.log(fullName);
console.log(fullName.length)

// Reading from Arrays
/*
	- Each element from an array  is associated with its own index/index number
	- In JS, the first element is associated with the number 0 and increasing the number by 1 for every element.
*/

console.log(grades); // [76, 99, 100, 98]
console.log(computerBrands); // ['Acer', 'Asus', 'Lenovo', 'HP', 'Apple', 'Dell', 'Redfox', 'MSI', 'Samsung']

// Syntax: arrayName[indexNumber]
console.log(grades[0]);

// Accesing an array element that does not exist will return "undefined"
console.log(grades[20]);

console.log(computerBrands[3]);

let lakersLegends = ["Kobe", "Shaq", "LeBron", "Magic", "Kareem"];
console.log(lakersLegends[1]);
console.log(lakersLegends[1]);

console.log('Array before reassignment')
console.log(lakersLegends);

console.log('Array after reassignment')
lakersLegends[2] = "Pau Gasol";
console.log(lakersLegends);

// Accesing the last element of an array
let bullsLegends = ['Steve Kerr', 'Jordan', 'Rodman', 'Pippen', 'Rose', 'Kukoc']
let lastElementIndex = bullsLegends.length - 1;
console.log(bullsLegends[lastElementIndex]);


// You can also access the last element directly using length-1 as value inside the square bracket
console.log(bullsLegends[bullsLegends.length-1]);


// Adding items into an array
bullsLegends[bullsLegends.length] = "Kai Sotto"
console.log(bullsLegends);
console.log(bullsLegends[bullsLegends.length-1]);

let newArr = [];
console.log(newArr[0]);

newArr[0] = "Cloud Strife"
console.log(newArr);

newArr[1] = "Tifa Lockheart"
console.log(newArr);

// You can also add items at the end of the array usng length as index.
newArr[newArr.length] = "Barrett Wallace"
console.log(newArr);

// Looping over an array
for(let index=0; index < newArr.length; index++){
	console.log(newArr[index]);
}

/*----------------------------------------------*/
let numArr = [5,12,30,46,40];
for(let index=0; index < numArr.length; index++){
	if(numArr[index]%5 === 0){
		console.log(`${numArr[index]} is divisible by 5.`);
	}
	else{
		console.log(`${numArr[index]} is not divisible by 5`);
		// console.log(`The element is not divisible by 5`);
	}
};

// [Section] Multidimenstional Arrays

/*
	- Multidimensional arrays are useful for storing complex data structures.
	- A practical appllication of this is to help visualize/create real world objects.
	-Though useful in number of cases, creating complex array structures is not always recommended.
*/

// Array inside of an array
let chessBoard = [
    ['a1', 'b1', 'c1', 'd1', 'e1', 'f1', 'g1', 'h1'],
    ['a2', 'b2', 'c2', 'd2', 'e2', 'f2', 'g2', 'h2'],
    ['a3', 'b3', 'c3', 'd3', 'e3', 'f3', 'g3', 'h3'],
    ['a4', 'b4', 'c4', 'd4', 'e4', 'f4', 'g4', 'h4'],
    ['a5', 'b5', 'c5', 'd5', 'e5', 'f5', 'g5', 'h5'],
    ['a6', 'b6', 'c6', 'd6', 'e6', 'f6', 'g6', 'h6'],
    ['a7', 'b7', 'c7', 'd7', 'e7', 'f7', 'g7', 'h7'],
    ['a8', 'b8', 'c8', 'd8', 'e8', 'f8', 'g8', 'h8']
];

// Accessing elements in a multidimensional array
console.log(chessBoard[0][3]);
console.log(chessBoard[5][6]);
console.log(chessBoard[chessBoard.length-1][4]);

console.log("Pawn moves to: " + chessBoard[1][5]);