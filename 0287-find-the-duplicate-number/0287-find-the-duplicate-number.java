import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        
        int a=0;
        int size=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<size;i++)
        {
            
           if(nums[i]==nums[i+1]){
                    a=nums[i];
                    break;
                }
           
               
        }
        return a;
    
    
}
}