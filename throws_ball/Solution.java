package throws_ball;
//공 던지기
//머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
// 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0; // 공을 던지는 사람의 index를 저장할 변수
        int count = 1; // 공을 던진 횟수를 저장할 변수
        while(count < k) { // k번째 공을 던질 때까지 반복
            answer = (answer + 2) % numbers.length; // 오른쪽으로 한명 건너뛰고, index가 배열의 길이를 넘어가면 다시 처음으로 돌아감
            count++; // 공을 던진 횟수 증가
        }
        return numbers[answer]; // k번째로 공을 던지는 사람의 번호 반환
    }
}