package com.interviewbit.jyang;

public class IB005_AddOneToNumber {
	
    public int[] plusOne(int[] A) {
        
        if (A.length==0) return null;
        
        int p = A.length-1;
        
        boolean hasCarry = false;
        while (p>=0) {
            
            if (p==A.length-1 || hasCarry){
                A[p] = A[p]+1;
            }
            
            if (A[p]>=10) {
                A[p] = 0;
                hasCarry = true;
            }
            else {
                hasCarry = false;
                break;
            }
            
            p--;
        }
        
        if (hasCarry) {
            int[] newA = new int[A.length+1];
        
            newA[0]=1;
            for (int i=0; i<A.length; i++){
                newA[i+1]=A[i];
            }
            
            return newA;
        }
        else {
            int z = 0;
            while (z<A.length){
                if (A[z]!=0){
                    break;
                }
                
                z++;
            }
            
            if (z==0){
                return A;
            }
            else {
                int[] newA = new int[A.length-z];
                for (int i=0; i<newA.length; i++){
                    newA[i]=A[i+z];
                }
                return newA;
            }
        }
    }
}
