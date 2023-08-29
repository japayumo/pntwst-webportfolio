// [Section] JSON Objects
/*
	- JSON stands for JavaScript Object Notation
	- JSON is also used in other programming languages
	- Core JavaScript has built-in JSON object that contains methods for passing JSON objects and converting into JavaScript objects

	- Syntax:
	{
		"propertyA": "valueA",
		"propertyB": valueB"
	}

*/


// JSON Objects
/*
	{
		"city": "Quezon City",
		"province": "Metro Manila",
		"country": "Philippines"
	}
*/


// [Section] JSON Arrays
/*
	"cities":[
		{"city": "Quezon City", "province": "Metro Manila", "country": "Philippines"}
		{"city": "Manila City", "province": "Metro Manila", "country": "Philippines"}
		{"city": "Makati City", "province": "Metro Manila", "country": "Philippines"}
	]
*/


// [Section] JSON Methods
/*
	- Stringified JSON is a JavaScript object converted into a string to be used into other functions of a JavaScript application
	- They are commonly used in HTTP request where information is required to be sent and received in a stringified JSON format
	- Requests are an important part of a programming where application communicates with a backend application to perform different tasks such as getting, creating, updating, or deleting data in a database

	- A frontend application is an application that is used to interact with users to perform visual tasks and display information while backend application are commonly used for all business logic and data processing

*/

let batchesArr = [{batchName: 'Batch X'}, {batchName: 'Batch Y'}];

console.log("Result from stringify method:")
console.log(JSON.stringify(batchesArr));

let data = JSON.stringify({
	name: 'John',
	age: 31,
	address:{
		city: 'Manila',
		country: 'Philippines'
	}
});

console.log(data);

// [Section] Using Stringify method with variables
/*
	- In JavaScript, the JSON.stringify() method is used to convert a JavaScript object into a JSON-formatted string. JSON (JavaScript Object Notation) is a lightweight data interchange format that is easy for humans to read and write and easy for machines to parse and generate.

	- Syntax:
		JSON.stringify({
			propertyA: valueA,
			propertyB: valueB
		});

*/

let firstName = prompt(`What is your first name? `);
let lastName = prompt(`What is your last name? `);
let age = prompt(`What is your age? `);
let address = {
	city: prompt(`What city do you live in?`),
	country: prompt(`Which country does your city address belong to?`)
};

let otherData = JSON.stringify({
	firstName: firstName,
	lastName: lastName,
	age: age,
	address: address
});

console.log(otherData);

// [Section] Converting JSON formatted string into JavaScript Objects
/*
	- Objects are common data type used in applications because of the complex data structures that can be created out of them
	- Information is commonly sent to applications in stringified JSON and then converted into objects
	- This happens both for sending information to backend application and sending information back to frontend application
*/

let batchesJSON = `[{"batchName": "Batch X"}, {"batchName": "Batch Y"}]`;
console.log("Result from parse method");
console.log(JSON.parse(batchesJSON));

let stringifiedObject = `{"name": "John", "age": 31, "address": {"city": "Manila", "country": "Philippines"}}`;
console.log(stringifiedObject);