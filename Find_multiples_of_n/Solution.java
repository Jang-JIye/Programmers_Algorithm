package Find_multiples_of_n;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}