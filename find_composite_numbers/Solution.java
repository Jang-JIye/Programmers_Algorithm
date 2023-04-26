package find_composite_numbers;
//합성수 찾기
//약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
// 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int n) {
        //1보다는 크고 n 보다는 작은 수로 나눴을 때 나머지가 0인 경우 합성수이다.
        int answer = 0;
        // n의 약수 중에서 가장 작은 수는 1이므로, 2부터 n까지 탐색합니다.
        for (int i = 2; i <= n; i++) {
            int factorNum = 0; // 현재 탐색 중인 수 i의 약수 개수를 세는 변수입니다.
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) { // i가 j의 약수인 경우
                    factorNum++; // 약수 개수를 1 증가시킵니다.
                }
                if (factorNum >= 3) { // 약수 개수가 3 이상인 경우
                    answer++; // 합성수의 개수를 1 증가시킵니다.
                    break; // 다음 수로 넘어갑니다.
                }
            }
        }
        return answer;
    }
}