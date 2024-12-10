// 데일리 알고: 자릿수 구하기

class Solution {
    public int solution(long number) {
        int answer = 1;

        while (number / 10 > 0) {
            number /= 10;
            answer += 1;
        }
        
        return answer;
    }
}