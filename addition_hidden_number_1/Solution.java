package addition_hidden_number_1;
//숨어있는 숫자의 덧셈(1)
//문자열 my_string 이 매개변수로 주어집니다.
// my_string 안의 모든 자연수들의 합을 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //숫자만 추출해서 str 에 저장
        String str = my_string.replaceAll("[^0-9]","");

        //추출한 숫자들의 합 구하기(str 은 char 타입으로 저장되어 있기 때문에 각각의 문자를 숫자로 변환해주어야 한다. -> getNumericValue())
        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}