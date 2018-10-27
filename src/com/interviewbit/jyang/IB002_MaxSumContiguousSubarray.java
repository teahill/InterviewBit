package com.interviewbit.jyang;

import java.util.List;

/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example:
 *
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 *
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * For this problem, return the maximum sum. 
 * 
 */


public class IB002_MaxSumContiguousSubarray {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int maxSubArray(final List<Integer> A) {
	        
	    if (A==null || A.size()==0){
	        return 0;
	    }
	        
	    int sum = 0;
	    int maxSum = Integer.MIN_VALUE;
	        
	    for (int i=0; i<A.size(); i++){
	            
	        sum += A.get(i);
	        maxSum = Math.max(maxSum, sum);
	            
	        if (sum<0){
	            sum = 0;
	        }
	    }
	        
	    return maxSum;
	}
}
