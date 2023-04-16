package age_of_exoPlanet;
//외계행성의 나이
//우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
// a는 0, b는 1, c는 2, ..., j는 9입니다.
// 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(int age) {
        String answer = "";

        //나이를 문자열로 변환
        String strAge = Integer.toString(age);

        //알파벳 문자 배열 (9까지)
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        //age를 10으로 나누어 나머지를 구하고 해당 알파벳 문자를 answer에 추가
        while (age > 0) {
            answer = alphabet[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }
}
