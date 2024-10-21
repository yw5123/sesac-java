// 변수 number_1 선언하고 숫자 할당 후 출력
// number_1가 숫자 10보다 작은지 확인하는 조건문 작성
// 숫자 10보다 작으면 "number_1은 10보다 작다."를 출력
const number_1 = 10;
console.log(number_1);
if (number_1 < 10) {
  console.log("number_1은 10보다 작다.");
}


// 변수 number_2 선언하고 숫자 할당 후 출력
// number_2를 2로 나눈 나머지가 0인지 확인하는 조건문 작성
// 2로 나눈 나머지가 0이면 "짝수"를 출력
const number_2 = 2;
console.log(number_2);
if (number_2 % 2 === 0) {
  console.log("짝수");
}


// 변수 variable 선언하고 임의의 값 할당 후 출력
// variable의 자료형이 number인지 확인하는 조건문 작성
// nuber라면 "숫자형"을 출력
const variable = 2;
console.log(variable);
if (typeof(variable) === 'number') {
  console.log("숫자형");
}


// 변수 number_3 선언하고 숫자 할당 후 출력
// number_3과 숫자 10을 비교하는 조건문 작성
// 숫자 10보다 작으면 "number_3은 10보다 작다."를 출력
// 숫자 10보다 크면 "number_3은 10보다 크다."를 출력
// 숫자 10과 같으면 "number_3은 10이다."를 출력
// number_3이 자료형이 아니면 "숫자가 아니다."를 출력
const number_3 = 10;
console.log(number_3);
if (typeof(number_3) != 'number') {
  console.log("숫자가 아니다.");
} else {
  if (number_3 < 10) {
    console.log("number_3은 10보다 작다.");
  } else if (number_3 > 10) {
    console.log("number_3은 10보다 작다.");
  } else {
    console.log("number_3은 10이다.");
  }
}


// 변수 username, password를 선언하고 임의의 값 할당 후 출력
// 두 변수가 아래의 정보와 일치하는지 확인하는 조건문 작성
//  - username: sesac
//  - password: sesac1234
// 정보가 일치하면 "로그인 성공", 다르면 "로그인 실패" 출력
const username = "beemo";
const password = "sesac1234";
if (username==="sesac"&&password==="sesac1234") {
  console.log("로그인 성공");
} else {
  console.log("로그인 실패");
}


// 변수 number_4, number_5를 선언하고 숫자 할당 후 출력
// 두 변수의 크기를 비교하는 조건문을 작성
// 더 큰 값을 출력 (같으면 "같다"를 출력)
const number_4 = 1;
const number_5 = 2;
console.log(number_4);
console.log(number_5);
if (number_4 > number_5) {
  console.log(number_4);
} else if (number_4 < number_5) {
  console.log(number_5);
} else {
  console.log("같다");
}


// 변수 number_6을 선언하고 숫자 할당 후 출력
// 변수의 값이 2와 3의 배수인지 확인하는 조건문 작성
// 2의 배수이면서 3의 배수이면 "6의 배수"를 출력
// 2의 배수이면서 3의 배수가 아니면 "2의 배수"를 출력
// 3의 배수이면서 2의 배수가 아니면 "3의 배수"를 출력
// 둘 다 해당되지 않으면 "2의 배수도 아니고, 3의 배수도 아니다."를 출력
const number_6 = 6
console.log(number_6);
if (number_6 % 2===0 && number_6 % 3===0) {
  console.log("6의 배수");
} else if (number_6 % 2 === 0) {
  console.log("2의 배수");
} else if (number_6 % 3 === 0) {
  console.log("3의 배수");
} else {
  console.log("2의 배수도 아니고, 3의 배수도 아니다.");
}