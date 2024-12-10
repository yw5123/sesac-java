// 데일리 알고: 배열 원소의 최소값 찾기

class Solution {
    public int solution(int[] numbers) {
        // int answer = 501;

        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] < answer) answer = numbers[i];
        // }

        int answer = numbers[0];

        for (int num : numbers) {
            if (num < answer) answer = num;
        }
        
        return answer;
    }
}