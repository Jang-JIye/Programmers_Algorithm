package sort_strings_2;

import java.util.Arrays;

//문자열 정렬하기(2)
//영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
// my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public String solution(String my_string) {
        //대문자 -> 소문자 함수 : .toLowerCase() <-> .toUpperCase()
        String answer = "";
        String s = my_string.toLowerCase();

        //문자 배열로 바꾼 후 알파벳 순 정렬
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        //answer 에 String 으로 저장
        answer = new String(charArray);
        return answer;
    }
}
