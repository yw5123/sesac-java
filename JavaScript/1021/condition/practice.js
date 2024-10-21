// 다음 점수에 따라 등급을 출력하는 코드를 작성하시오.
// 90 이상: "A" / 80 이상: "B" / 그 외: "C"
// 단, 100점은 A학점과 더불어 '교수님의 총애', 40점 미만은 C학점과 더불어 '학사 경고'

console.log("--- 성적 ---")

const score = 100;

if (score >= 90) {
  console.log("A");
  if (score === 100) {
    console.log("교수님의 총애");
  }
} else if (score >= 80) {
  console.log("B");
} else {
  console.log("C");
  if (score < 40) {
    console.log("학사 경고");
  }
}


// 새싹이는 주말이거나 일과시간 이후면 휴식
// 단, 주말의 일과시간 이후에는 자기개발
// 일과시간이 09~18시일 때, 변수의 상태에 따라 일/휴식/자기개발 출력

console.log("\n--- 일과 ---")

const isWeekend = true;
const nowTime = 19;

if (nowTime >= 9 && nowTime <= 18) {
  if (isWeekend) {
    console.log("휴식");
  } else {
    console.log("일");
  }
} else {
  if (isWeekend) {
    console.log("자기개발");
  } else {
    console.log("휴식");
  }
}

// -----------------

let isWorkingHour;

if (nowTime >= 9 && nowTime <= 18) {
  isWorkingHour = true;
} else {
  isWorkingHour = false;
}

// let isWorkingHour = (nowTime >= 9 && nowTime <= 18)? true: false;
let toDo;

if (isWeekend) {
  if (isWorkingHour) {
    toDo = "휴식";
  } else {
    toDo = "자기개발";
  }
} else {
  if (isWorkingHour) {
    toDo = "일";
  } else {
    toDo = "휴식";
  }
}

console.log(toDo);
