class Solution {
    public boolean isHappy(int n) {
        boolean res=false;
        Set<Integer> set =new HashSet<>();
        while(!set.contains(n) && n!=1){
            set.add(n);
            int newnu=0;
            while(n>0){
                int mod=n%10;
                int sq=mod*mod;
                newnu+=sq;
                n=n/10;
            }
            n=newnu;
        }
        if(n==1){
            res=true;
        }
        return res;
    }
}