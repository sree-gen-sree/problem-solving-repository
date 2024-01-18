class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            
        }
        return count;
    }
}

/*time complexity = O(n^2) --> till outer loop n times, inner loop will run or (n-1) for 1st time, (n-2) for 2nd, till 1. Therefore, sum is (n*(n-1))/2 = n^2
/*Space complexity = The only variables used are count and n, which do not depend on the input size. Therefore, the space complexity is O(1).