package Finding_the_Median;

/*중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    array의 길이는 홀수입니다.*/

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //오름차순 혹은 내림차순으로 array를 배열한 뒤 array.길이 / 2 번째의 값을 리턴한다.
        Arrays.sort(array);
        //Arrays.sort(); : 오름차순 정렬
        //Arrays.sort(arr, Collections.reverseOrder()); : 내림차순 정렬
        return array[array.length / 2];
    }
}