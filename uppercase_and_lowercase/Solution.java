package uppercase_and_lowercase;
//대문자와 소문자
//문자열 my_string 이 매개변수로 주어질 때,
//대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            //만약 char 이 대문자 -> 소문자
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
            //아니라 소문자 -> 대문자
            else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }
}
