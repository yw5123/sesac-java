// nums가 다음과 같을 때 구구단 3단 출력
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]

for (let index in nums) {
  let num = nums[index];
  console.log(`3 x ${num} = ${num*3}`);
}


// 출석번호를 포함하여 출석 부르기
const names = ['jun', 'beemo', 'ken', 'lynda']

for (let index in names) {
  let name = names[index];
  console.log(`${++index}번 ${name}`);
}


// 18살 jun
// 28살 beemo
// 37살 ken
// 을 출력하시오.
const names2 = ['jun', 'beemo', 'ken'];
const ages = [18, 28, 37];

for (let index in names2) {
  let name = names2[index];
  let age = ages[index];
  console.log(`${age}살 ${name}`);
}