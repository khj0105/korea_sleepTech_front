document.addEventListener('DOMContentLoaded', () => {
  const signInButton = document.querySelector('#signInButton');


  signInButton.addEventListener('click', () => { 
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
  });

});