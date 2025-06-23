// User function Template for Java

class Solution {
    
    public int TotalPairs(int[] nums, int k) {
        // Code here
        //approach1 set
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        int count = 0;
        
        for(int x : nums) {
            mp.put(x, mp.getOrDefault(x+k, 0)+1);
        }
            
        for(int num : mp.keySet()) {
            if(k > 0 && mp.containsKey(num+k)) count++;
            
            else if(k == 0 && mp.get(num) >1 ) count++;
        }
        
        return count;
        
    }
    
}