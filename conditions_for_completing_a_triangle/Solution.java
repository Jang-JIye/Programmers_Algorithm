package conditions_for_completing_a_triangle;
//삼각형의 완성 조건(1)
//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
// 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        // sides 의 가장 큰 수가 다른 두 수의 합 보다 작다면 1을 리턴, 그 외에는 2를 리턴.
        if (a < b + c && b < a + c && c < a + b) {
            return 1;
        } else {
            return 2;
        }
    }
}