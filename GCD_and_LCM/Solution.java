package GCD_and_LCM;
/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
*/
class Solution {
    public int[] solution(int n, int m) {
        //배열 칸 2개 만들기
        int[] answer = new int[2];

        int max = 0; //최대 공약수
        for (int i = 1; i<= n && i<= m; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        int min = (n * m ) / max; //최소 공배수

        answer[0] = max;
        answer[1] = min;

        return answer;
    }
}