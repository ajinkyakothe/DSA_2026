class Solution {
    public int minElement(int[] nums) {
        
      int minVal = Integer.MAX_VALUE;

      for(int num:nums)
      {
        int currentVal=0;

        while(num > 0)
        {
            currentVal += num % 10;
            num /= 10;

        }

        minVal=Math.min(minVal,currentVal);
      }
    

   return minVal;

    }
}