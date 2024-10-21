// 변수 let_variable, 상수 const_variable 선언 후
// console.log()를 사용해 출력
let let_variable = "Hello World";
const const_variable = "Hello World";
console.log(let_variable);
console.log(const_variable);


// 숫자 number_variable, 문자열 string_variable 생성 후
// console.log()와 typeof를 사용하여 자료형 출력
const number_variable = 1;
const string_variable = '1';
console.log(typeof(number_variable));
console.log(typeof(string_variable));


// 코드의 일부를 수정해서 오류를 해결
// const variable = '상수형 변수에는 재할당 할 수 없다.';
let variable = '상수형 변수에는 재할당 할 수 없다.';
variable = '재할당';
console.log(variable);


// '정우영'을 저장한 변수 name 생성 후
// '안녕하세요. ㅇㅇㅇ입니다.'를 저장한 변수 hello 생성
// ㅇㅇㅇ에는 변수 name 삽입
const name = "정우영";
const hello = `안녕하세요. ${name}입니다.`
console.log(hello);



let number1, number2;

// 100 저장한 변수 number1, 200 저장한 변수 number2 생성 후
// 두 변수에 대한 사칙연산 결과 출력
number1 = 100;
number2 = 200;
console.log(`덧셈: ${number1 + number2}`);
console.log(`뺄셈: ${number1 - number2}`);
console.log(`곱셈: ${number1 * number2}`);
console.log(`나눗셈: ${number1 / number2}`);


// 짝수를 저장한 변수 number1, 홀수를 저장한 변수 number2 생성 후
// 두 변수를 2로 나눈 나머지 출력
number1 = 14;
number2 = 17;
console.log(`number1을 2로 나눈 나머지: ${number1 % 2}`);
console.log(`number2을 2로 나눈 나머지: ${number2 % 2}`);


// 1부터 10까지 저장한 배열 number_arr 생성 후 인덱싱해서 출력
const number_arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(number_arr[0]);
console.log(number_arr[2]);
console.log(number_arr[8]);
console.log(number_arr[9]);


// 빈 배열 arr 생성 후 원소 추가하고 출력
let arr = [];
arr.push(10);
arr.push(20);
arr.push(30);
arr.push(40);
arr.push(50);
console.log(arr);


// 객체의 속성의 값에 접근하고 출력
let todo = {
  userId: 1,
  id: 1,
  title: 'delectus aut autem',
  completed: false,
};
console.log(todo.userId);
console.log(todo.id);
console.log(todo.title);
console.log(todo.completed);


// 정보를 기반으로 객체 생성하고 변수 person에 할당
// 변수 person을 출력
let person = {
  name: '정우영',
  age: 20,
  city: '서울',
  location: '성동',
  language: ['HTML', 'CSS', 'JavaScript']
}
console.log(person);