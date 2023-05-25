package find_divisor;

import java.util.Arrays;
//약수 구하기
//정수 n이 매개변수로 주어질 때,
// n의 약수를 오름차순으로 담은 배열을 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        //n 까지의 배열을 만든다.

        int count = 0;
        //배열을 돌면서 n을 나눌 때, 나머지가 0인 수를 새 배열에 추가한다.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[count++] = i;
            }
        }
        return Arrays.copyOf(answer, count);
    }
}