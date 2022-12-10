package Finding_the_Mode;

import java.util.HashMap;
import java.util.Map;

/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.
*/
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCnt = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int cnt = map.getOrDefault(number, 0) + 1;
            //찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 매서드
/*
            getOrDefault(Object key, V DefaultValue)
                매개변수 : 이 메서드는 두개의 매개변수를 허용
                key : 값을 가져와야 하는 요소의 키
                defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본 값
                반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환
*/

            if (cnt > maxCnt) {
                maxCnt = cnt;
                answer = number;
            } else if (cnt == maxCnt) {
                answer = -1;
            }
            map.put(number, cnt);
        }
        return answer;
    }
}