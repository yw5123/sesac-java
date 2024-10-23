const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]


// 1 ~ 9 순서대로 출력해보기
for (let num of nums) {
  for (let n of num) {
    console.log(n);
  }
}


// 행들의 합의 값으로 리스트 만들기
let sumRow = [];

for (let num of nums) {
  let sum = 0;
  for (let n of num) {
    sum += n;
  }
  sumRow.push(sum);
}

console.log(sumRow);


// 모든 원소들의 합 구하기
let sumAll = 0;

for (let num of nums) {
  for (let n of num) {
    sumAll += n;
  }
}

console.log(sumAll);


// 열들의 합의 값으로 리스트 만들기
let sumCol = [];

for (let i = 0; i < nums.length; i++) {
  for (let j = 0; j < nums[i].length; j++) {
    if (i === 0) sumCol[j] = 0;
    sumCol[j] += nums[i][j];
  }
}

// for (let j = 0; j < nums[0].length; j++) {
//   let sum = 0;
//   for (let i = 0; i < nums.length; i++) {
//     sum += nums[i][j];
//   }
//   sumCol.push(sum);
// }

console.log(sumCol);