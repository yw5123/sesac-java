// map, filter 연습

const arr1 = [1, 2, 3, 4, 5];
// 를 활용하여
// const newArr1 = [1, 4, 9, 16, 25];
// 를 만들어보자.

const newArr1 = arr1.map((el) => el**2);
console.log(newArr1);


// // 이렇게 함수를 만들어서 넣을 수도 있음!
// function square(num) {
//   return num ** 2;
// }
// const newArr1_1 = arr1.map(square);
// console.log(newArr1_1);

///////////////////////////////////////////////////////////////////////////////////////

const arr2 = ["1", "2", "3", "4", "5"];
// 를 활용하여
// const newArr2 = [1, 2, 3, 4, 5];
// 를 만들어보자.

const newArr2 = arr2.map((el) => parseInt(el));
console.log(newArr2);

// -------------
// const newArr2_1 = arr2.map(parseInt);
// console.log(newArr2_1);
// 이렇게는 동작이 안 됨: [ 1, NaN, NaN, NaN, NaN ]
// map 메서드는 콜백 함수에서 3개의 인자(element, index, array)를 전달하고
// parseInt는 2개의 매개변수(변환할 문자열, 진법)를 받아서
// 의도하지 않은 추가 매개변수가 전달되어 의도와 다른 결과가 나온다

///////////////////////////////////////////////////////////////////////////////////////

const arr3 = [
  {
    name: "jun",
    age: 18,
  },
  {
    name: "alex",
    age: 28,
  },
  {
    name: "ken",
    age: 38,
  },
];
// 를 활용하여
// const newArr3 = [18, 28, 38];
// 를 만들어보자.

const newArr3 = arr3.map((el) => el.age);
console.log(newArr3);

///////////////////////////////////////////////////////////////////////////////////////

const arr4 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// 를 활용하여
// 짝수만 들어있는 array를 만들어보자.

// 짝수이면서 5이상인 숫자만 들어있는 array를 만들어보자.
const newArr4 = arr4.filter((el) => el % 2 === 0);
console.log(newArr4);

///////////////////////////////////////////////////////////////////////////////////////


const arr5 = [
  {
    name: "jun",
    age: 18,
  },
  {
    name: "alex",
    age: 28,
  },
  {
    name: "ken",
    age: 38,
  },
  {
    name: "beemo",
    age: 48,
  },
  {
    name: "lynda",
    age: 8,
  },
];
// 를 활용하여
// age가 30 이하인 사람들의 정보가 담긴 array를 만들어보자.
const newArr5 = arr5.filter((el) => el.age <= 30);
console.log(newArr5);

// 를 활용하여
// age가 30 이하인 사람들의 이름이 담긴 array를 만들어보자.
const newArr6 = newArr5.map((el) => el.name);
console.log(newArr6);

// const newArr7 = arr5.filter((el) => el.age <= 30 ? true : false).map((el) => el.name);
// console.log(newArr7);