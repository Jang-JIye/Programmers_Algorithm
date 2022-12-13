package OX_Quiz;
/*
덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] calcu = quiz[i].trim().split(" "); //trim() : 공백제거 메소드
            if (calcu[1].equals("+")) {
                if (Integer.parseInt(calcu[0]) + Integer.parseInt(calcu[2]) == Integer.parseInt(calcu[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (calcu[1].equals("-")) {
                if (Integer.parseInt(calcu[0]) - Integer.parseInt(calcu[2]) == Integer.parseInt(calcu[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
                //parseInt() : String타입의 숫자를 int타입으로 변환해준다.

            }
        }
        return answer;
    }
}