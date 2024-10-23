// 구구단이 들어있는 2차원 배열 만들기
const util = require('util');
let mulTable = [];

for (let i = 1; i <= 9; i++){
  let mulRow = []
  for (let j = 1; j <= 9; j++){
    mulRow.push(i * j);
  }
  mulTable.push(mulRow);
}

// console.log(mulTable);

for (let mul of mulTable) {
  console.log(util.inspect(mul, { breakLength: Infinity, compact: true }));
}