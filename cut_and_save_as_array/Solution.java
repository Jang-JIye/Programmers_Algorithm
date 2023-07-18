package cut_and_save_as_array;
//문제설명
//잘라서 배열로 저장하기
//문자열 my_str과 n이 매개변수로 주어질 때,
// my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String[] solution(String my_str, int n) {
        //배열 index 계산
        int array = (my_str.length() + n - 1) / n;
        //새 배열 생성
        String[] answer = new String[array];

        //n씩 잘라서 저장
        for (int i = 0; i < array; i++) {
            int start = i * n; //배열에 저장할 부분 문자열의 시작인덱스
            int end = Math.min(start + n, my_str.length()); //부분 문자열의 끝인덱스
            answer[i] = my_str.substring(start, end); //부분 문자열 배열에 저장
        }
        return answer;
    }
}
