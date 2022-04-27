class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int arrLength = nums.length;
        int[] result = new int[arrLength];
        int start = 0;
        int end = arrLength - 1;

        for (int i = arrLength - 1; i >= 0; i--)
        {
           if (Math.abs(nums[start]) > Math.abs(nums[end]))
           {
               result[i] = nums[start]; 
                start++;
           } else
           {
               result[i] = nums[end];
               end--;
           }
            result[i] = result[i] * result[i];
        }
        return result;
    }
}
