package ctrl_Z;

import java.util.Stack;

//컨트롤 제트
//숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다.
// 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(String s) {
        // 스택 생성
        Stack stack = new Stack();
        // 문자열을 공백 기준으로 split하여 배열로 저장
        String[] arr = s.split(" ");

        // 배열을 순회하면서 스택에 요소 추가 및 삭제
        for(String item : arr){
            if(!item.equals("Z")){
                // "Z"가 아니면 스택에 추가
                stack.push(item);}
            else{
                // "Z"면 스택에서 마지막 요소 삭제
                stack.pop();
            }
        }

        // 스택에 남은 숫자들의 합 구하기
        int num = stack.size();
        int answer = 0;
        for (int i = 0; i < num; i++) {
            answer += Integer.parseInt((String) stack.pop());
        }

        return answer;
    }
}
