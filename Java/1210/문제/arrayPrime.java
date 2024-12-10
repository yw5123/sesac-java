// 데일리 알고: 배열의 특정 원소 개수 구하기 2

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) answer++;
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}