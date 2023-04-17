package set_treatment_order;
//진료순서 정하기
//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
// 정수 배열 emergency 가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int[] emergency) {
        //emergency 길이의 배열 만들기
        int[] answer = new int[emergency.length];

        //이미 값을 채운 경우 건너뜀
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                continue;
            }
            //순위 초기화
            int idx = 1;
            //배열의 길이만큼 반복하면서 -> 자신보다 응급도가 높은 경우 -> 순위증가
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            //순위 저장
            answer[i] = idx;
        }
        return answer;
    }
}