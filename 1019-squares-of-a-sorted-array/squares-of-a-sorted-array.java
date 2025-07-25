class Solution {
    public int[] sortedSquares(int[] num) {
        int[] ans = new int[num.length];
        int start = 0;
        int end = num.length-1;
        int ptr= num.length-1;

        while(start<=end){
            int ss = num[start] * num[start];
            int es = num[end] * num[end];

            if(ss>es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}