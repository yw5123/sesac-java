let arr_1 = [1, 2, 3];
let arr_2 = arr_1;
let arr_3 = [...arr_1];

arr_1[1] = 100;

console.log(arr_1); // [1, 100, 3]
console.log(arr_2); // [1, 100, 3]
console.log(arr_3); // [1, 2, 3]


let mat_1 = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];
let mat_2 = mat_1;
let mat_3 = [...mat_1];

mat_1[1][1] = 100;

console.log(arr_1); // 바뀜
console.log(arr_2); // 바뀜
console.log(arr_3); // 바뀜

mat_1[1] = 100;

console.log(arr_1); // 바뀜
console.log(arr_2); // 바뀜
console.log(arr_3); // 안 바뀜