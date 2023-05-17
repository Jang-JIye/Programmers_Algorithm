package close_number;
//가까운 수
//정수 배열 array 와 정수 n이 매개변수로 주어질 때,
// array 에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0]; // 초기값으로 첫 번째 원소 설정

        int minDiff = Math.abs(array[0] - n); // 초기값으로 첫 번째 원소와의 차이를 최소값으로 설정

        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); // 현재 원소와 n과의 차이 계산(절대값 함수 Math.abs() 사용)

            if (diff < minDiff) { // 현재 원소와 n과의 차이가 더 작다면
                minDiff = diff; // 최소값 갱신
                answer = array[i]; // 가장 가까운 수로 설정
            } else if (diff == minDiff && array[i] < answer) { //diff가 동일할 경우 더 작은 값을 선택
                answer = array[i];
            }
        }

        return answer;
    }
}
