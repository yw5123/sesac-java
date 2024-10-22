// 어제 수업시간에 했던 과제들
// while / for 사용해서 다시 풀어보기

// nums가 다음과 같을 때 구구단 3단 출력
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]

for (num of nums) {
  console.log(`3 x ${num} = ${3 * num}`);
}


// 출석번호 포함하여 출력
const names = ['jun', 'beemo', 'ken', 'lynda']
let index = 0;

while (true) {
  console.log(`${index + 1}번 ${names[index]}`);
  index++;

  if (index === names.length) break;
}


// 주어진 리스트의 합계
const nums_ = [1, 2, 3, 4, 5, 6, 7, 8, 9]
let sum = 0;

for (num of nums) {
  sum += num;
}
console.log(sum);