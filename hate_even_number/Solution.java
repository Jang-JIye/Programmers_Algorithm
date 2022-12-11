package hate_even_number;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if(i % 2 != 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}