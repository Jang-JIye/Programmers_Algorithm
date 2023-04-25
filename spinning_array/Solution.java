package spinning_array;
//배열 회전시키기
//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
// 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            if(direction.equals("right")){
                if(i < numbers.length-1){
                    answer[i+1] = numbers[i];
                }else{
                    answer[0] = numbers[i];
                }
            }else{
                if(i == 0){
                    answer[numbers.length-1] = numbers[0];
                }else{
                    answer[i-1] = numbers[i];
                }
            }
        }
        return answer;
    }
}