package Division_of_two_numbers;

class Solution {
    public int solution(int num1, int num2) {

        double answer = (double)num1 / num2 * 1000; //소수점 까지 값을 구해야 하므로 double을 사용한다.
        return (int)answer;
    }
}