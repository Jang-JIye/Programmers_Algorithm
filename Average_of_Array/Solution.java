package Average_of_Array;

import java.util.Arrays;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum, i = 0;

        for (sum = 0; i < numbers.length; i++) {
            sum += numbers[(int) i];
        }
        answer = sum / numbers.length;
        return answer;
    }
}