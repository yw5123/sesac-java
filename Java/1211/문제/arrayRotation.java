# 데일리 알고 54: 배열 회전하기 - 코드 리뷰

class Solution {
    public int[] solution(int[] numbers, int direction) {
        // int len = numbers.length;
        // int[] answer = new int[len];

        // for (int i = 0; i < len; i++) {
        //     int index = (i + direction) % len;
        //     if (index < 0) index += len;
            
        //     answer[index] = numbers[i];
        // }

        int[] answer = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            int newIndex = (i + direction + numbers.length) % numbers.length;
            answer[newIndex] = element;
        }

        return answer;
    }
}