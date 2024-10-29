// 변수 arr 을 선언하고 배열을 할당
const arr = [1, 3, 5, -3, 9, 10, 23, -6, 44, 22, -10, 5, 20];


// 원소 중 양수이면서 짝수인 원소만 모아서 새로운 배열 만들어서 출력
const newArr = arr.filter((el) => (el > 0) && !(el % 2));
console.log(newArr);


// 배열의 모든 원소를 곱한 값 출력
const mulValue = arr.reduce((arr, cur) => arr * cur);
console.log(mulValue);


// 배열의 원소 중 마지막으로 나온 홀수의 값 추력
const lastOdd = arr.reduce((arr, cur) => cur % 2 ? cur : arr);
console.log(lastOdd);