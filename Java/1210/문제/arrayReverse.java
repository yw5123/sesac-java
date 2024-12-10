// 데일리 알고: 배열 뒤집기

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];

        for (int idx = 0; idx < len; idx++) {
            answer[idx] = numbers[len - idx - 1];
        }
        
        return answer;
    }
}