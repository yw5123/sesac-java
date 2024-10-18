// $ node basic.js

console.log('사칙 연산');

let a = 7;
let b = 2;

console.log(a + b); // 9
console.log(a - b); // 5
console.log(a * b); // 14
console.log(a / b); // 3.5

console.log(10 % 3); // 1
console.log(2 ** 3); // 8

let count1 = 5;
count1++; 
console.log(count1); // 6

count1--;
console.log(count1); // 5


console.log('\n추가 연산');

console.log(10 % 3); // 1
console.log(2 ** 3); // 8

let count2 = 5;

count2++; 
console.log(count2); // 6

count2--;
console.log(count2); // 5


console.log('\n할당 연산자');
let x = 10;

x += 5; 
console.log(x); // 15

x *= 2; 
console.log(x); // 30


console.log('\n비교 연산자');

console.log(5 == '5');  // true (값이 같음)
console.log(5 === '5'); // false (자료형이 다름)
console.log(10 > 5);    // true
console.log(10 >= 5);    // false


console.log('\n논리 연산자');

let isOnline = true;
let isActive = false;

console.log(isOnline && isActive); // false
console.log(isOnline || isActive); // true
console.log(!isOnline); // false


console.log('\n타입 연산자');

console.log(typeof 123); // "number"
console.log(typeof 'Hello'); // "string"