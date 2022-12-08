package Addition_of_fractions;

/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
*/

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {

        int[] answer = new int[2];

        //분자값
        int topNum = denum1 * num2 +denum2 * num1;
        //분모값
        int bottomnum = num1 * num2;

        answer[0] = topNum;
        answer[1] = bottomnum;

        //분자 분모 중 작은 값 고르기
        int min = Math.min(answer[0], answer[1]);
        //최대공약수를 구한다.
        int max = 1;
        for (int i = 1; i <= min; i++) {
            if (answer[0] % i == 0 && answer[1] % i ==0){
                max = i;
            }
        }
        answer[0] = answer[0] / max;
        answer[1] = answer[1] / max;
        return answer;
    }
}