// 데일리 알고: 배열의 덧셈

class Solution {
    public int[] solution(int[] numbers1, int[] numbers2) {
        int[] answer = new int[numbers1.length + numbers2.length];

        for (int idx = 0; idx < numbers1.length; idx++) {
            answer[idx] = numbers1[idx];
        }

        for (int idx = 0; idx < numbers2.length; idx++) {
            answer[numbers1.length + idx] = numbers2[idx];
        }
        
        return answer;
    }
}