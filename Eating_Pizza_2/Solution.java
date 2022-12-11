package Eating_Pizza_2;

/*
머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
*/

class Solution {
    public int solution(int n) {
        int max = 1;

        //최대공약수를 구한다.
        for (int i = 1; i <= 6 &&i <=n; i++) {
            if (6 % i == 0 && n % i == 0) {
                max = i;
            }
        }
/*
        //최소공배수를 구한다.
        int min = 6 * n / max;
        //최소공배수 = 피자 조각이므로 /6을 해서 필요한 피자 판수를 구한다,
        int answer = n / max;
        return answer;
*/
        int answer =  n / max;
        return answer;
    }
}