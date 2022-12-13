package Parallel;

import java.util.ArrayList;

/*
점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
        [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    //두 직선의 기울기가 같다면 평행이다.
    //기울기 = y값 증가량 / x값 증가량 = (y2 - y1) / (x2 - x1)
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < dots.length - 1; i++) {
            if (answer == 1) {
                break;
            } else {
                for (int j = i + 1; j < dots.length; j++) {
                    double tmp = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                    if (arr.contains(tmp)) {
                        answer = 1;
                        break;
                    } else {
                        arr.add(tmp);
                    }

                }
            }
        }
        return answer;
    }
}