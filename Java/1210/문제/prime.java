// 데일리 알고: 범위 내 소수의 개수 구하기

public class Problem {

    // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
    // 클래스 이름은 유지

    public static void main(String[] args) {
        // 함수 실행
        //   Solution.solution();
        System.out.println(Solution.solution(1, 10));
        System.out.println(Solution.solution(10, 20));
        System.out.println(Solution.solution(5, 5));
    }

// ////////////////////////////////////////////////////////////////////////////////////
    // 이 부분에 daily algo의 템플릿 복사
    //    public (타입) solution 을
    //    public static (타입) solution 으로 변경
    class Solution {
        public static int solution(int start, int end) {
            int answer = 0;

            for (int i = start; i <= end; i++) {
                boolean check = true;

                if (i == 1) check = false;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        continue;
                    }
                }

                if (check) answer += 1;
            }

            return answer;
        }
    }
// ////////////////////////////////////////////////////////////////////////////////////
}