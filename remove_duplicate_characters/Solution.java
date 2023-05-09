package remove_duplicate_characters;

class Solution {
    public String solution(String my_string) {
        String answer = ""; //문자열 초기화

        //현재 문자의 인덱스와 해당 문자를 indexOf() 메소드를 사용하여 검색한 결과의 인덱스를 비교합니다. 만약 같다면 현재 문자는 중복되지 않은 문자이므로 answer 문자열에 추가합니다
        for(int i=0; i<my_string.length(); i++){
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }
        return answer;
    }
}