package appearNum_once;

import java.util.Arrays;
//한 번만 등장한 문자
//문자열 s가 매개변수로 주어집니다.
// s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0;

        Arrays.sort(str);
        //반복문을 돌면서 카운트 -> 반복문을 다시 돌면서 같은 문자가 있을 경우 카운트 추가
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            //카운트가 1 일 때, answer 에 추가한다.
            if (count == 1) {
                answer += str[i];
            }
            count = 0;
        }
        return answer;
    }
}
