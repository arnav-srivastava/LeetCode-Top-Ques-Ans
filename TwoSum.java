import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store this number with its index
            map.put(nums[i], i);
        }
        
        // If no solution is found (as per problem, it always exists)
        return new int[] {};
    }
}
