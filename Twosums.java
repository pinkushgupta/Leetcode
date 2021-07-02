class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,check=0;
        int a[]=new int[2];
        int l=nums.length;
        for(i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    a[0]=i;
                    a[1]=j;
                    check=1;
                 break;      
                }
            }
            if(check==1)
            {
                break;
            }
        }
         return a; 
    }
}
