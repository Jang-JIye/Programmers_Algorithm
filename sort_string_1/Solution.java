package sort_string_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//문자열 정렬하기(1)
//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
class Solution {
    public int[] solution(String my_string) {

        // 알파벳 소문자를 빈 문자열로 대체하여 숫자만 남김
        my_string = my_string.replaceAll("[a-z]","");

        // 숫자 배열 생성
        int[] answer = new int[my_string.length()];

        // 문자열에서 숫자를 하나씩 꺼내서 answer 배열에 넣기
        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        // 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}