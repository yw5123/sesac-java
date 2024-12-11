// 데일리 알고 53: 특정 구간마다 배열의 원소 선택하기 - 코드 리뷰

class Solution {
    public int[] solution(int[] numbers, int step) {
        // int num = 0;

        // for (int i = 0; i < numbers.length; i += step) {
        //     num++;
        // }

        // int[] answer = new int[num];
        // int idx = 0;
        // for (int i = 0; i < numbers.length; i += step) {
        //     answer[idx++] = numbers[i];
        // }

        int answerLength = 1 + (numbers.length - 1) / step;
        // int answerLength = (int) Math.ceil((double) numbers.length / step);  // 이렇게 계산할 수도 있음
        int[] answer = new int[answerLength];

        int index = 0;
        for (int i = 0; i < numbers.length; i += step) {
            answer[index] = numbers[i];
            index++;
        }
        
        return answer;
    }
}