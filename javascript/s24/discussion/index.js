let cellphone = {
	name: "Nokia 3210",
	manufactureDate: 1999
};

/* let objectName = {
	property: value // key or property
	key: value
};*/

console.log("Result from creating objects using initializers/literal notation");
console.log(cellphone);
console.log(typeof cellphone); // object

// Creating objects using constructor function
// Creates a reusable function to create several objects that have the same data structure:
/*
	Syntax:
	function objectName(keyA, keyB){
		this.keyA = keyA;
		thiskeyB = keyB;
	};
*/
function Laptop(name, manufactureDate){
	
	/* The "this" keyword allows us to assign new object properties by
	associating them with values received from constructor function's parameter*/
	
	this.name = name;
	this.manufactureDate = manufactureDate;
}

// The "new" operator creates an instance of an object
let laptop = new Laptop("Lenovo", 2008);
console.log("Result from creating object using constructors: ");
console.log(laptop);

let myLaptop = new Laptop("Macbook Air", 2020);
console.log(myLaptop);

/*
	The example above invokes/calls the "Laptop" function instead
	of creating a new object instance.

*/

// Accessing Object Properties

// Dot Notation
console.log("Result from dot notation: " + myLaptop.name);

// Square Bracket Notation
console.log("Result from square bracket notation: " + myLaptop['name']);

// Accessing Array Objects
let array = [laptop, myLaptop];

console.log(array[0]["name"]);
console.log(array[1]["name"]);
console.log(array[0].name);

console.log(array[0]["manufactureDate"]);
console.log(array[1]["manufactureDate"]);
console.log(array[0].manufactureDate);
console.log(array[1].manufactureDate);


/*------------------------*/

// Initializing / adding object properties using dot notation
let car = {};

car.name = "Honda Civic";
console.log("Result from adding properties using dot notation: ")
console.log(car);

// Initializing / adding object properties using bracket notation
car["manufacture date"] = 2019;
console.log("Result from adding properties using square bracket notation: ")
console.log(car);

// Updating object properties
car.name = "Honda Civic Type R";
console.log("Result from updating properties using dot notation: ")
console.log(car);

car["name"] = "Honda Civic Type R S Pro";
console.log("Result from updating properties using square bracket notation: ")
console.log(car);

// Deleting object properties
delete car['manufacture date'];
console.log('Result from deleting properties: ');
console.log(car);

// Object
// A method is a function which is a property of an object

let person ={
	name: 'John',

	// method
	talk: function(){
		console.log('Hello my name is ' + this.name);
	}
}

person.talk();

// Adding methods to object
person.walk = function(){
	console.log(this.name + ' walked 25 steps forward.');
}

person.walk();
console.log(person);


let friend = {
	firstName: 'Joe',
	lastName: 'Smith',
	address: {
		city: 'Austin',
		country: 'Texas'
	},
	email: ['joe@mail.com','joesmith@email.xyz'],
	introduce: function(){
		console.log("Hello my name is " + this.firstName + ' ' + this.lastName);
	}
}
friend.introduce();

/* Methods are useful for creating reusable functions that perform tasks related to objects*/

/*
	- Scenario
	1. We would like to create a game that would have several
	pokemons interact with each other.
	2. Every pokemon would have the same set of stats, properties, 
	and functions

*/

// Using object literals to create multiple literals
let myPokemon = {
	name: "Pikachu",
	level: 3,
	health: 100,
	attack: 50,
	tackle: function(){
		console.log("This Pokemon tackled targetPokemon");
		console.log("targetPokemon health is now reduced to _targetPokemonhealth_");
	},
	faint: function(){
		console.log("Pokemon fainted");
	}

}
// NOTE: This would be time consuming if building/creating several pokemons

//Creating an object constructor instead will help with this process.

function Pokemon(name, level){

	// Properties
	this.name = name;
	this.level = level;
	this.health = 2 * level;
	this.attack = level;

	// Methods
	this.tackle = function(target){
		console.log(this.name + ' tackled ' + target.name);
		console.log("targetPokemon's health is now reduced");
	}
	this.faint = function(){
		console.log(this.name + 'fainted');
	}
}

let pikachu = new Pokemon("Pikachu", 16);
//console.log(pikachu);

let rattata = new Pokemon("Rattata",8);
//console.log(rattata);

pikachu.tackle(rattata)