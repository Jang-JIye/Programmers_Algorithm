package length_of_array_elements;
//배열 원소의 길이
//문자열 배열 strlist가 매개변수로 주어집니다.
// strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(String[] strlist) {
        //결과값을 저장할 배열을 선언, 입력값과 길이가 같게 초기화
        int[] answer = new int[strlist.length];

        //입력값의 각 원소의 길이를 순차적으로 저장
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}