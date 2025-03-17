// obj01.js (object)

//# JS의 객체(Object) #//

//! 객체란?
// : 관련된 데이터와 함수를 모아놓은 집합
// - 데이터: 프로퍼티(속성)
// - 함수: 메서드(기능)

// cf) 객체지향 프로그래밍
// : 실세계의 모든 것을 객체로 표현

//! '객체'의 특징
// : (참조) 데이터 타입 중 하나, 다양한 값을 담을 수 있는 컨테이너

//? cf) 배열도 여러 타입의 자료를 담을 수 있는 '객체'의 일부
//      >> 여러 데이터를 '순차적'으로 '인덱스'를 부여한 타입

// typeof(데이터): 해당 데이터의 형태 반환
console.log(typeof([1, 2, 3])); // object

//! '객체'의 구조
// : 고유한 특성과 동작을 가짐

// EX) '사람'이라는 객체 정의

//? 특성(속성, 프로퍼티) - 변수
// : 객체가 가진 데이터(값)
// - 객체를 구성하는 정보의 일부, 상태를 나타냄
// >> 이름, 나이, 성별, 직업, 주민등록번호, 키, ... 등

//? 기능(동작, 메서드) - 함수
// : 객체가 수행할 수 있는 행동이나 기능 정의
// - 속성을 활용하거나 조작 가능
// >> 공부하다, 먹다, 걷다, 말하다, ...등

// EX) '자동차'라는 객체 정의
//? 속성
// - 모델명: 'Kia k9' / 색상: 'Black' / 연식: 2025 / 현재 속도: 0
//? 기능
// - 가속하다: '현재 속도 증가' / 정지하다: '차량을 정지' / 경적을울리다: '경적을 울림'

//! '객체'의 기본 형태
/* 
let objectName = { 
    키1: 값1, 
    키2: 값2 
    ... 
}

- 값의 데이터 형식에 제한 X
  : 배열, 또 다른 객체, 함수 가능
- 키와 값을 하나의 쌍으로 나열, 각각의 쌍은 콤마(,)로 분리
- 각각의 멤버(키와 값)은 콜론(:)으로 분리

>> 값은 중복될 수 있지만, 키는 중복이 불가능
*/

let lsa1 = ['이', '승아'];

//? 1) 객체 '리터럴' 방식
// : 가장 간단하고 직관적인 객체 생성 방식
// : 중괄호를 사용하여 객체를 선언하고 초기화 - 내부에 속성과 메서드 정의

let lsa2 = {
  // 키(이름)는 문자열로 작성, 따옴표 생략
  1: '이',
  2: '승아',
  lastName: '이',
  firstName: '승아',

  height: 169,
  hobby: ['야구 시청', '운동']
}

//? 2) '생성자 함수' 사용 방식
// : new 키워드와 함께 '사용자 정의 생성자 함수'를 사용하여 객체 생성
// - 같은 형태(구조)의 객체를 여러 개 생성 가능
// >> 함수 내부에서 this 키워드를 사용하여 객체의 속성(프로퍼티) 정의

// cf) 생성자 함수명은 UpperCamelCase 사용을 권장
//      : 객체 생성을 위한 함수로 사용성을 명확히 지정
function Human(nameParam, heightParam) {
  // this 키워드
  // : 해당 생성자 함수로 생성되는 객체 그 자체
  // - 각 개체마다 값이 달라짐

  this.name = nameParam;
  this.height = heightParam;

  this.greet = function() { // 익명 함수: 함수 표현식
    console.log(`Hello, ${this.name}`);
  }
}

let person1 = new Human('이승아', 169);
let person2 = new Human('이도경', 157);

console.log(person1.name);
console.log(person1.height);
person1.greet(); // Hello, 이승아

console.log(person2.name);
console.log(person2.height);
person2.greet(); // Hello, 이도경