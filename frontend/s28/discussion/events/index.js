const clickButton = document.querySelector("#clicker")
const inputField = document.querySelector("#input-example")

clickButton.addEventListener('click', function() {
	//console.log('Button Clicked');
	alert('Button Clicked');
});

/*clickButton.addEventListener('click', () => {
	//console.log('Button Clicked');
	alert('Button Clicked');
});*/

inputField.addEventListener('input', (event) => {
	console.log(`Input value changed: ${event.target.value}`)
});