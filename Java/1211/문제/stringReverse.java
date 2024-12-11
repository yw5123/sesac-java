// 데일리 알고 38: 문자열 뒤집기

class Solution {
    public String solution(String word) {
        // char[] answer = new char[word.length()];

        // for (int i = 0; i < word.length(); i++) {
        //     answer[i] = word.charAt(word.length() - i - 1);
        // }

        // return String.valueOf(answer);

        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}