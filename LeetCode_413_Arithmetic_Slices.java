//approach - BF
//tc - O(n2), sc - constnt

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int left = 0, right =1, count =0,n = nums.length;
        
        while(left < n-1)
        {
            int diff = nums[left+1]- nums[left];
            
            while(right < n-1)
            {
                if(nums[right+1] - nums[right] == diff)
                {
                    count++;
                    right++;
                }
                else 
                {
                    
                    break;
                }
            }
            left++;
            right = left +1;
        }
        return count;
    }
}

//approoach -2 BF using for loop
//approach - BF
//tc - O(n2), sc - constnt

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int n = nums.length, count =0;
        
        for(int i=0; i< n-1; i++)
        {
            int df = nums[i+1]- nums[i];
            
            for(int j = i+1; j < n-1; j++)
            {
                if(nums[j+1] - nums[j] ==  df)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}


//approach - top- down approach - DP
//tc - O(n), sc - O(n)

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int n = nums.length, count =0;
        int[] dp = new int[n];
        
        
        for(int i=2; i< n; i++)
        {
           if(nums[i]- nums[i-1] == nums[i-1]- nums[i-2])
           {
               dp[i] = dp[i-1]+1;
               count += dp[i];
           }
        }
        return count;
    }
}

//approach -Bottom up approach - DP
//tc - O(n), sc - O(n)

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int n = nums.length, count =0;
        int[] dp = new int[n];
        
        
        for(int i=n-3; i>=0; i--)
        {
           if(nums[i+2]- nums[i+1] == nums[i+1]- nums[i])
           {
               dp[i] = dp[i+1] + 1;
               count += dp[i];
           }
        }
        return count;
    }
}


//OPTIMIZED approach-
//tc -O(n), sc - O(1)
//two var prev and count 
//OPTIMIZED approach-
//tc -O(n), sc - O(1)
//two var prev and count 


class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int n = nums.length, count =0, prev =0;
        
        
        
        for(int i=n-3; i>=0; i--)
        {
           if(nums[i+2]- nums[i+1] == nums[i+1]- nums[i])
           {
               prev = prev+1;
               count += prev;
           }
            else
            {
                prev =0;
            }
        }
        return count;
    }
}

