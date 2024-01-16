import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.lang.Math; 
class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, String> tally = new HashMap<>();
        int ans = 0;
        for (int i : nums) {
            if(tally.containsKey(i)) {
                tally.replace(i, "two");
            } else {
                tally.put(i, "one");
            }
        }

        for(Map.Entry<Integer, String> entry : tally.entrySet()) {
            if(entry.getValue().equals("one")) {
                ans = entry.getKey();
            }

        }
        return tally.;
    }

    public static void main(String[] args) {
        int[] parameter = new int[] {4, 2, 1, 2, 1};
        int ans = singleNumber(parameter);
        System.out.println(ans);
    }
}