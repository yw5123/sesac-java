// 데일리 알고: 배열의 곱셈

class Solution {
    public int[] solution(int[] numbers, int n) {
        int len = numbers.length;
        int[] answer = new int[len * n];

        for (int idx = 0; idx < len; idx++) {
            for (int i = 0; i < n; i++) {
                answer[idx + len * i] = numbers[idx];
            }
        }

        return answer;
    }
}