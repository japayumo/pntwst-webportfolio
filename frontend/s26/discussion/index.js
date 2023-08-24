// Array Methods

// JavaScript has built-in functions and methods for arrays. This allows us to manipulate and access array items.
// Mutator Methods
	/*
		- Mutator methods are functions that "mutate" or change an array after they're created
		- These method manipulate the original array performing various tasks such as adding and removing elements
	*/

let fruits = ['Apple', 'Orange', 'Kiwi', 'Dragon Fruit', 'Mango', 'Gum gum fruit'];


/*--------------------------------------------------------------*/
// push()
// Adds an elements in the end of an array and returns the array's length:
// Syntax: arrayName.push("itemToPush");

console.log("Current array: ")
console.log(fruits);
let fruitsLength = fruits.push('Grapes');
console.log(fruitsLength);
console.log('Push Method: Add element at the end of arr');
console.log(fruits);

function addFruit(fruit){
	fruits.push(fruit);
}
addFruit("Pineapple");
console.log(fruits)


/*--------------------------------------------------------------*/
console.log('----------------------------')

// pop()
// Removes the last element in an array AND returns the removed element
// Syntax: arrayName.pop("itemToPop");

let removeFruit = fruits.pop();
console.log(removeFruit);
console.log('Pop Method: Removes the last element of the arr');
console.log(fruits)

function removeFruit2(){
	fruits.pop();
}
removeFruit2();
console.log(fruits);

/*--------------------------------------------------------------*/
console.log('----------------------------')

// unshift()
// Adds one or more elements at the beginning of an array
fruits.unshift("Lime", "Banana");
console.log('Unshift Method: Adds element at beginning of arr');
console.log(fruits);

function addAtArrayStart(fruit){
	fruits.unshift(fruit);
}
addAtArrayStart("Calamansi");
console.log(fruits)


/*--------------------------------------------------------------*/
console.log('----------------------------')

//shift()
// Removes one element at the beginning of an array
let anotherFruit = fruits.shift();
console.log(anotherFruit);
console.log('Shift Method: Removes element at beginning of arr');
console.log(fruits)

function removeFruitFromBeginning(){
	fruits.shift();
}
removeFruitFromBeginning();
console.log(fruits);

/*--------------------------------------------------------------*/
console.log('----------------------------')

//splice()
// It simultaneously removes element/s from specified index and adds elements
// Syntax
/*
	arrayName.splice(startingIndex, deleteCount, elementsToBeAdded);
*/
fruits.splice(1, 3, 'Lime', 'Cherry');
console.log('Splice Method: Add/Remove in any location of the arr');
console.log(fruits);

// function that adds only 1 fruit
/*function spliceFruit(index, deleteCount,fruit){
	fruits.splice(index,deleteCount,fruit);
};

spliceFruit(1,1,'Avocado'); 
console.log(fruits);*/

function spliceFruit(index, deleteCount,fruit){
	fruits.splice(index,deleteCount,...fruit);
};

spliceFruit(1,1,['Avocado', 'Juicy Fruit']); 
console.log(fruits);

/*--------------------------------------------------------------*/
console.log('----------------------------')

//sort()
// - Rearanges the array elements in alphanumeric order
// Syntax: arrayName.sort()
fruits.sort();
console.log('Sort Method: Sorts alpanumerically')
console.log(fruits);

let alphaNumericArray = [1, 2, 3, 'a', 'b', 'c', '1a', '2b'];
alphaNumericArray.sort(); 
console.log(alphaNumericArray);

let numericArray = [100, 2, 3, 4, 5]
numericArray.sort(); 
console.log(numericArray);

let numericArray2 = [2, 3, 4, 5, 100]
numericArray.sort(function (a, b){
	return a - b;
}); 
console.log(numericArray2);
/*--------------------------------------------------------------*/
console.log('----------------------------')

// reverse()
// Reverses the order of array elements
fruits.reverse();
console.log('Reverse Method: Sorts alphanumerically in reverse order');
console.log(fruits);