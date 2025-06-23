// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        Map<Integer, Integer> mp = new HashMap<>();
        
        int count = 0;
        
        for(int x : arr) {
            int val = target - x;
            
            count += mp.getOrDefault(val, 0);
            
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        
        return count;
        
    }
}
