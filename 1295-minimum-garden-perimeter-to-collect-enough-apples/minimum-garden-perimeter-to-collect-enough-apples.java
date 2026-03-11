class Solution {
    public long minimumPerimeter(long neededApples) {
        long n=0;
        long totalapple=0;
        while(totalapple<neededApples){
            n+=1;
            totalapple+=12*n*n;
        }      
        return 8*n;
    }
}