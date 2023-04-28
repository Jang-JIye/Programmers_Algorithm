package factorial;
//팩토리얼
//i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
// 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
// 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int n) {
        int i = 1;
        int answer = 1;
        while (n >= answer) { // 1. 주어진 수 n보다 크지 않은 최대의 i를 찾기 위해 팩토리얼을 계산합니다.
            i++;
            answer *= i;
        }
        return i - 1; // 2. n보다 크지 않은 최대의 i를 찾았으면 i-1을 반환합니다.
    }
}