// 리스트의 길이 계산
const names = ['jun', 'beemo', 'ken', 'lynda'];
let length = 0;

for (_ in names) {
  length++;
}
console.log(length);
console.log(names.length);


// 리스트의 합계 계산
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let sum = 0;

for (num of nums) {
  sum += num;
}
console.log(sum);


// 리스트의 최소값
const nums2 = [10, 6, 8, 5, 4, 2, 3, 11]
let min = nums2[0];

for (const num of nums2) {
  if (min > num) {
    min = num;
  }
}
console.log(min);


// 리스트 순서 뒤집기
const nums3 = [10, 6, 8, 5, 4]
let reversedNum = []

for (let index in nums3) {
  reversedNum[nums3.length - index - 1] = nums3[index];
}
console.log(reversedNum);