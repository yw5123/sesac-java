// 더하기 함수
function add(x1, x2) {
  return x1 + x2;
}

const num1 = 1;
const num2 = 2;

console.log('더하기 함수')
console.log(num1);
console.log(num2);
console.log(add(num1, num2));


// 크기 비교 함수
function compare(x1, x2) {
  if (x1 > x2) return x1;
  if (x1 < x2) return x2;
  if (x1 === x2) return null;
}

const num3 = 1;
const num4 = 1;

console.log('\n크기 비교 함수');
console.log(num3);
console.log(num4);
console.log(compare(num3, num4));


// 양수, 음수, 0
function determine(x) {
  if (x > 0) return 1;
  if (x < 0) return -1;
  if (x === 0) return 0;
}

const num5 = 10;

console.log('\n양수 음수 0');
console.log(num5);
console.log(determine(num5));


const numList = [ 10, 25, 36, 99, 58 ];

// 가장 큰 값
function maxNumber(arr) {
  let max = -Infinity;
  for (const num of arr) {
    if (num > max) max = num;
  }
  return max;
}

console.log('\n가장 큰 값');
console.log(numList);
console.log(maxNumber(numList));


// 가장 작은 값
function minNumber(arr) {
  let min = Infinity;
  for (const num of arr) {
    if (num < min) min = num;
  }
  return min;
}

console.log('\n가장 작은 값');
console.log(numList);
console.log(minNumber(numList));


// 짝수
function evenNumber(arr) {
  let new_arr = [];
  for (const num of arr) {
    if (num % 2 === 0) new_arr.push(num);
  }
  return new_arr;
}

console.log('\n짝수');
console.log(numList);
console.log(evenNumber(numList));