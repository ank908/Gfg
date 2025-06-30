// Helper class to find largest number with minimum frequency
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int nums[], int n) {
        // Your code here
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i = 0; i < n; ++i) {
		    mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
		}
		
		int min = Integer.MAX_VALUE, res=0;
		
		for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
		  //  System.out.println(e.getKey() + " " + e.getValue());
		    if(e.getValue() < min){
		        res = e.getKey();
		        min = Math.min(e.getValue(), min);
		    } else if(e.getValue() == min) {
		        res = Math.max(res, e.getKey());
		    }
		}
		
		return res;
        
    }
}