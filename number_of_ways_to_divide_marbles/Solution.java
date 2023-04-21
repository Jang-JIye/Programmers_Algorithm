package number_of_ways_to_divide_marbles;
//구슬을 나누는 경우의 수
//머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
//머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
// balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
class Solution {

    private int answer, balls, share;

    public int solution(int balls, int share) {
        answer = 0;
        this.balls = balls;
        this.share = share;

        for (int i = 0; i < balls; i++) { //구슬의 개수만큼 반복
            combination(i, 1); //combination 메소드 호출
        }

        return answer;
    }

    private void combination(int curIdx, int curCount) { //조합 구현 메소드
        if (curCount == share) { //조함의 개수가 나누어줄 구슬의 개수와 같을 경우,
            answer++; //경우의 수 추가
            return;
        }

        for (int i = curIdx + 1; i < balls; i++) { //현 인덱스보다 큰 구슬들로 조합 구현
            combination(i, curCount + 1);
        }
    }
}