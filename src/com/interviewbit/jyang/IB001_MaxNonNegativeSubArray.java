package com.interviewbit.jyang;

public class IB001_MaxNonNegativeSubArray {

    public int[] maxset(int[] A) {
        
        if (A.length==0) return null;
        
        int p1=-1, p2=-1;
        long saved_sum=Long.MIN_VALUE;
        int ps=0, pe=0;
        long sum=0;
        int len = A.length;
        
        while (ps<=len-1 && pe<=len-1){
            
            if (A[pe]<0){
                if (sum>saved_sum){
                    p1=ps;
                    p2=pe-1;
                    saved_sum = sum;
                }
                else if (sum==saved_sum){
                    
                    if ((pe-ps)>(p2-p1)){
                        p1=ps;
                        p2=pe-1;
                        saved_sum = sum;
                    }
                    else if ((pe-ps)==(p2-p1)){
                        if (ps < p1){
                            p1=ps;
                            p2=pe-1;
                            saved_sum = sum;
                        }
                    }
                }
                
                pe++;
                ps=pe;
                sum=0;
            }
            else {
                sum+=A[pe];
                
                if (sum>saved_sum){
                    p1=ps;
                    p2=pe;
                    saved_sum = sum;
                }
                
                pe++;
            }
        }
        
        if (p1<0 && p2<0){
            return new int[0];
        }
        
        int[] res = new int[p2-p1+1];
        
        for (int i=0; i<p2-p1+1; i++) {
            res[i] = A[i+p1];
        }
        
        return res;
    }

    public static void main(String[] args) {
    	
    	//int[] input = new int[] {756898537, -1973594324, -2038664370, -184803526, 1424268980};
    	//int[] input = new int[] {0, 0, -1, 0};
    	int[] input = new int[] {-1, -1, -1, -1, -1};
    	
    	IB001_MaxNonNegativeSubArray solution = new IB001_MaxNonNegativeSubArray();
    	
    	int[] output = solution.maxset(input);
    	
    	for (int i=0; i<output.length; i++) {
    		System.out.print(output[i] + " ");
    	}
    	
    	System.out.println("Done" + output);
    	
    }
}
