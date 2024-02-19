class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i,j=1;
        int size=nums.length;
        for(i=1;i<size;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                
                nums[j]=nums[i];
                j++;
            }

        }
    return j;
    }
}