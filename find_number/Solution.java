package find_number;

//문제설명
//정수 num과 k가 매개변수로 주어질 때,
//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        //int num -> String 변환
        String s = Integer.toString(num);

        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) == k) {
                answer = i + 1; //index 는 0부터 시작하기 때문에 자릿루를 구할 땐 1을 더한다.
                break;
            }
        }
        return answer;
    }
}