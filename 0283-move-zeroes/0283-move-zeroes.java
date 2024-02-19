class Solution {
    public void moveZeroes(int[] nums) {

        int i,k=0;
        int check[]=new int[100];
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;

            }
        }
        for(i=k;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
    }
}