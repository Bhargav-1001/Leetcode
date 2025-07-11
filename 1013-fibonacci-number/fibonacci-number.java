class Solution {
    ////synced with github
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

       int firstTerm = 0;
       int secondTerm = 1;

       for(int i = 0; i<n ; i++){
        int thirdTerm = firstTerm + secondTerm;

        firstTerm = secondTerm;
        secondTerm = thirdTerm;

       }

       return firstTerm;

    }
}