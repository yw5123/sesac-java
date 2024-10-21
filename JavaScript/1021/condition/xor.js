let money = true;
let car = true;

// money와 car 조합해서 false가 나오도록 하기
// xor 만들기

console.log((money || car) && !(money && car));