// function 함수명(매개변수) {
//   기능
//   return 출력값;
// }

const n = 8;

function plusOne(num) {
  let plusOneNumber = num + 1;
  
  return plusOneNumber;
}


// 1. 2를 곱하는 함수
function mul2(num) {
  return num * 2;
}
console.log(mul2(n))


// 2. 소수를 판별하는 함수
function checkPrime(num) {
  if (num === 1) return false;
  else {
    for (let i = 2; i <= n**(1/2); i++) {
      if (n % i === 0) {
        return false;
      }
    }
    return true;
  }
}
console.log(checkPrime(n));


// 3. 구구단 중 n단을 return하는 함수
function nDan(num) {
  let n_dan = [];

  for (let i = 1; i <= 9; i++) {
    n_dan.push(i * num);
  }

  return n_dan;
}
console.log(nDan(n));