package Easy;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> PSolution=new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if(PSolution.containsKey(complement)){
                return new int[]{PSolution.get(complement),i};
            }

                PSolution.put(nums[i],i);

        }
        return new int[]{0,0};
    }

}
