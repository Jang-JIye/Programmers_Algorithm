package number_of_7;

import java.util.ArrayList;
//문제 설명
//머쓱이는 행운의 숫자 7을 가장 좋아합니다.
// 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                arrayList.add(array[i] % 10);
                array[i] /= 10;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 7) {
                answer++;
            }
        }
        return answer;
    }
}