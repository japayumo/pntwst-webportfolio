// The fetch() method has one argument by default, the url. A url is a representative address of accesssing resource/data in another machine.
// For now, we will use the jsonpalceholder url, which is a sample server we we can get data from.
// The .then() method will allow us to process data when retrieced using fetch in another function
// The data returned in our fetch method can be passed into the .then() where we can receive it as a parameter
// response is simply the parameter name, it is however, a convention, indicating that we are now going to process the response from our server.
// It is a representation of what we "got" from our server. response.json() is a method to parse the incoming data as proper JS object we can further process.
// We can add another .then() method to do something with the processed server response.

fetch("https://jsonplaceholder.typicode.com/posts")
.then((response) => response.json())
.then((data) => showPosts(data));

/*------------------------------------------------------------*/

/*fetch("https://jsonplaceholder.typicode.com/posts")
.then(function(response){
// This function logs the 'response' object to the console.
console.log(response.json());	

// The 'response.json()' method returns a Promise that resolves with the parsed JSON data.
// return response.json();
});

.then(function(data){
console.log(data);
});*/

/*------------------------------------------------------------*/
// show posts
// const showPosts = function(posts){}
const showPosts = (posts) => {
	let postEntries = '';

	posts.forEach((post) => {
		postEntries += `
			<div id="post-${post.id}">
				<h3 id="post-title-${post.id}">${post.title}</h3>
				<p id="post-body-${post.id}">${post.body}</p>

				<button onclick="editPost(${post.id})">Edit</button>
				<button onclick="deletePost()">Delete</button>
			</div>
		`
	})
	document.querySelector("#div-post-entries").innerHTML = postEntries;

	//document.querySelector("#post-4").innerHTML = "";

	document.querySelector("#post-4").remove();
};

console.log(document.querySelector("#div-w-content").innerHTML);

document.querySelector("#div-w-content").innerHTML = "NEW CONTENT";

// addPost

let addPostForm = document.querySelector('#form-add-post').addEventListener('submit', (event) => {

// addPostForm.addEventListener('submit', (event) => {
	// event.preventDefault() is preventing the browser from performing its default action, which in the context of a form submission, would be to refresh the page.
	event.preventDefault();



	fetch("https://jsonplaceholder.typicode.com/posts/", {
		method: 'POST', 
		body: JSON.stringify({
			title: document.querySelector('#txt-title').value,
			body: document.querySelector('#txt-body').value,
			userID: `${id}`
		}),
		headers: {'Content-Type': 'application/json'}
	})
	.then((response) => response.json())
	.then((data) => {
		alert("Successfully added.");
		console.log(data);
	})

	document.querySelector('#txt-title').value = null;
	document.querySelector('#txt-body').value = null;
})

function editPost(id){

	let title = document.querySelector(`#post-title-${id}`).innerHTML;
	let body = document.querySelector(`#post-body-${id}`).innerHTML;

	console.log(title);
	console.log(body);

	document.querySelector("#txt-edit-id").value = id;
	document.querySelector("#txt-edit-title").value = title;
	document.querySelector("#txt-edit-body").value = body;

	// enables button once clicked the edit button
	document.querySelector("#btn-submit-update").removeAttribute('disabled');

};

// Update post. This function will be run when the edit form is submitted.
document.querySelector('#form-edit-post').addEventListener('submit', (e) => {
    e.preventDefault();

let id = document.querySelector('#txt-edit-id').value

    //PUT is the value of method this time because the action to be done is editing/updating.
    fetch(`https://jsonplaceholder.typicode.com/posts/${id}`, {
        method: 'PUT',
        body: JSON.stringify({
            id: document.querySelector('#txt-edit-id').value,
            title: document.querySelector('#txt-edit-title').value,
            body: document.querySelector('#txt-edit-body').value,
            userId: 1
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        alert('Successfully updated.');


        // values
        
        //let title = document.querySelector('#txt-edit-title').value
        //let body = document.querySelector('#txt-edit-body').value

        
        document.querySelector(`#post-title-${data.id}`).innerHTML = document.querySelector('#txt-edit-title').value;
        document.querySelector(`#post-body-${data.id}`).innerHTML = document.querySelector('#txt-edit-body').value;


        
        document.querySelector('#txt-edit-title').value = null;
        document.querySelector('#txt-edit-body').value = null;
        document.querySelector('#btn-submit-update').setAttribute('disabled', true);
    
    });
});