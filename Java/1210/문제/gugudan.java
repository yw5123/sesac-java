// 데일리 알고: 구구단 결과 합 구하기

class Solution {
    public int solution(int start, int end) {
        int answer = 0;

        // for (int i = start; i <= end; i++) {
        //     for (int j = 1; j <= 9; j++) {
        //         answer += i * j;
        //     }
        // }
        
        int num = 0;
        
        for (int i = start; i <= end; i++) {
            num += i;
        }

        for (int i = 1; i <= 9; i++) {
            answer += num * i;
        }
        
        return answer;
    }
}