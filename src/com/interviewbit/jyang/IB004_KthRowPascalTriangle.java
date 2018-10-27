package com.interviewbit.jyang;

public class IB004_KthRowPascalTriangle {

    public int[] getRow(int A) {
        
        if (A==0) {
            return new int[]{1};
        }
        
        if (A==1) {
            return new int[]{1,1};
        }
        
        // start from A=2
        int[] prev = new int[]{1,1};
        int[] curr = prev;
        
        for (int i=1; i<A; i++){
            curr = new int[prev.length+1];
            
            for (int j=0; j<prev.length+1; j++) {
                if (j==0) {
                    curr[j]=prev[j];
                }
                else if (j==prev.length){
                    curr[j]=prev[j-1];
                }
                else {
                    curr[j]=prev[j-1]+prev[j];
                }
            }
        }
        
        return curr;
    }
	
}
