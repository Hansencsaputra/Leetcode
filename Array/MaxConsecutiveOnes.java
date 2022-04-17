class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int oneCount = 0;
        int maxOne = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1)
            {
                oneCount++;
            } else
            {
                maxOne = Math.max(oneCount, maxOne);
                oneCount = 0;
            }
        }
        return Math.max(oneCount, maxOne);
    }
}
