package add_digits;
//자릿수 더하기
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
class Solution {
    public int solution(int n) {
        int answer = 0;
        //int 를 String으로 변환
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i +1));
        }
        return answer;
    }
}