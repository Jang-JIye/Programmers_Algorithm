package factorization;

import java.util.ArrayList;
import java.util.List;

//소인수분해
//소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
// 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();//소인수를 담을 리스트 생성

        //2 ~ n 까지 반복문을 돌며 n의 소인수 찾기
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {//n이 소인수 인 경우
                while (n % i == 0) { //i가 n의 소인수가 아닐 때까지
                    n /= i; //n을 i로 나누어 떨어지지 않을 때까지 나누기
                }
                list.add(i); //리스트에 추가하기
            }
        }
        //리스트에 추가된 소인수를 비열로
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
