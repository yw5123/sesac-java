// 데일리 알고: 배열 회전하기

class Solution {
    public int[] solution(int[] numbers, int direction) {
        int len = numbers.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int index = (i + direction) % len;
            if (index < 0) index += len;
            
            answer[index] = numbers[i];
        }
        
        return answer;
    }
}