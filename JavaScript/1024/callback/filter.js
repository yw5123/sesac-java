const numbers = [1, 2, 3, 4];

const evenNumbers = numbers.filter((num) => {
  return num % 2 === 0;
})

console.log(evenNumbers);


// filter를 사용해 소수만 모으기
const nums = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14];
const primeNumbers = nums.filter((num) => {
  for (let i = 2; i <= num**(1/2); i++) {
    if (num % i === 0) return false;
  }
  return true;
})

console.log(primeNumbers);