package solve_code;
//암호 해독
//군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//암호화된 문자열 cipher를 주고받습니다.
//그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        //문자열을 배열로 변경하기
        char[] charArray = cipher.toCharArray();

        //배열을 code 로 나눌 때 나머지가 code-1인 것만 새 배열에 추가 후 문자열로 변환
        for (int i = code - 1; i < charArray.length; i += code) {
            answer.append(charArray[i]);
        }
        return answer.toString();
    }
}
