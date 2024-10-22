// break
for (let i = 0; i < 10; i++) {
  console.log(i)

  // {}는 코드를 묶어주는 역할
  // 코드가 한 줄이면 생략 가능
  if (i == 6) break;
}

// continue
for (let i = 0; i < 10; i++) {
  if (i % 2) {  // 나머지가 존재하면
    continue;   // 아래 코드 실행하지 않고 다음 반복으로
  }

  console.log(i);
}

// break와 continue의 차이
// break를 만나면 반복문을 종료
// conitnue를 만나면 현재 반복 건너뛰고 다음 반복으로