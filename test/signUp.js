document.addEventListener('DOMContentLoaded', () => {
  const signUpButton = document.querySelector('#signupButton');

  signUpButton.addEventListener('click', () => { 
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    localStorage.setItem('username', username);
    localStorage.setItem('password', password);

    alert("회원가입 성공! 로그인 페이지로 이동합니다.");

    window.location.href = './signIn.html';
  });
})