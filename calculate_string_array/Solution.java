package calculate_string_array;
//문자열 계산하기
//my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
// 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //공백으로 연산자 찾기
        String[] parts = my_string.split(" ");

        //초기값 설정
        answer = Integer.parseInt(parts[0]);

        // 연산자와 숫자 순차적 처리
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int operand = Integer.parseInt(parts[i + 1]);

            //연산자 별 계산
            if (operator.equals("+")) {
                answer += operand;
            } else if (operator.equals("-")) {
                answer -= operand;
            }
        }
        return answer;
    }
}
