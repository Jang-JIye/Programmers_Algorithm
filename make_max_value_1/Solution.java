package make_max_value_1;

import java.util.Arrays;

//최댓값 만들기(1)
//정수 배열 numbers 가 매개변수로 주어집니다.
// numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 오름차순으로 정렬합니다.
        int length = numbers.length;
        return Math.max(numbers[0] * numbers[1], numbers[length-1] * numbers[length-2]);
    }
}