package Cut_Array;
//배열 자르기
//정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        //잘라낸 부분을 저장할 배열
        int[] answer = new int[num2 - num1 +1];
        //새로 만든 배열의 인덱스 변수
        int array = 0;
        for (int i = num1; i <= num2; i++) {
            answer[array] = numbers[i]; //자른 부분을 새로운 배열에 저장
            array++;
        }
        return answer;
    }
}