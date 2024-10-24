const numbers = [1, 2, 3, 4];

// 일반적인 사용법
numbers.forEach((num) => {
  console.log(num);
})

// 위 코드를 분해한 코드
const console_log = (num) => {
  console.log(num);
};

numbers.forEach(console_log);

// numbers.forEach(
//   console_log() // 괄호가 있으면 함수의 결과값 전달
//   // console_log는 아무것도 return하지 않음 => undefined
//   // undefined는 함수가 아니라 오류 발생
// );


// 아래 코드와 같은 의미
function myForEach(arr, func) {
  for (let value of arr) {
    func(value);
  }
}

myForEach(numbers, console_log);


// 콜백함수의 function 자리 input 값으로 call이 들어가면 안 됨

// --------------

const arr = ['a', 'b', 'c', 'd'];
arr.forEach((value, index, arr) => {
  console.log(value, index, arr);
})

// forEach 안에 index와 배열 자체도 들어가있음
// value만 사용하면 뒤의 인자들이 무시되는 것