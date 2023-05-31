package find_biggest_number;
//가장 근 수 찾기
// 정수 배열 array가 매개변수로 주어질 때,
// 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        // 가장 큰 수의 인덱스 찾기
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        answer[0] = array[maxIndex];
        answer[1] = maxIndex;

        return answer;
    }
}