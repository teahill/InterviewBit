package com.interviewbit.jyang;

public class IB003_PascalTriangle {

    public int[][] solve(int A) {
        
        if (A==0) {
            return null;
        }
        
        if (A==1) {
            return new int[][]{{1}};
        }
        
        int[][] res = new int[A][A];
        
        int count = 2;
        int size = 2;
        
        res[0] = new int[]{1};
        res[1] = new int[]{1,1};
        
        while (count < A) {
            size++;
            count++;
            
            int[] prev = res[count-2];
            int[] next = new int[size];
            
            for (int i=0; i<size; i++){
                if (i==0) {
                    next[i]=prev[i];
                }
                else if (i==size-1){
                    next[i]=prev[i-1];
                }
                else {
                    next[i]=prev[i-1]+prev[i];
                }
            }
            
            res[count-1] = next;
        }
        
        return res;
    }
 
}
