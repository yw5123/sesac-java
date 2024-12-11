# 데일리 알고 57: 배열의 곱셈 - 코드 리뷰

class Solution {
    public int[] solution(int[] numbers, int n) {
        // int len = numbers.length;
        // int[] answer = new int[len * n];

        // for (int idx = 0; idx < len; idx++) {
        //     for (int i = 0; i < n; i++) {
        //         answer[idx + len * i] = numbers[idx];
        //     }
        // }


        int[] answer = new int[numbers.length * n];

        // int index = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int number : numbers) {
        //         answer[index] = number;
        //         index++;
        //     }
        // }

        // index를 사용하지 않게 수정해보기

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < numbers.length; i++) {
                answer[numbers.length * j + i] = numbers[i];
            }
        }
        
        return answer;
    }
}