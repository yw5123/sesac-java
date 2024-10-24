const numbers = [1, 2, 3, 4];

const doubled = numbers.map((num) => {
  return num * 2;
});

console.log(doubled);


// strNumbers => numNumbers로 바꾸어 새 변수에 할당해보기
const strNumbers = ['1', '2', '3', '4'];
const numNumbers = strNumbers.map((num) => {
  return parseInt(num);
})

// // for문으로 작성하면..
// let numNumbers = [];
// for (let strNum of strNumbers) {
//   let intNum = parseInt(strNum);
//   numNumbers.push(intNum);
// }

// // 한줄로 작성 가능
// let numNumbers = strNumbers.map((num) => parseInt(num));

console.log(strNumbers);
console.log(numNumbers);