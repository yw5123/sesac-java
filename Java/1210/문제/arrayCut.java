// 데일리 알고: 배열 자르기

class Solution {
    public int[] solution(int[] numbers, int start, int end) {
        int len = end - start + 1;
        int[] answer = new int[len];

        for (int idx = 0; idx < len; idx++) {
            answer[idx] = numbers[start + idx];
        }

        return answer;
    }
}