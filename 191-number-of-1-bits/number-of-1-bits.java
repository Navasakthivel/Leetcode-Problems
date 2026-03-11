class Solution {
    static String dectobin(int num){
        String s="";
        while(num>=1){
        int x=num%2;
        num=num/2;
        s=x+s;
        }
        return s;
    }
    static int setbits(String res){
        int count=0;
        for(int i=res.length()-1;i>=0;i--){
            char c=res.charAt(i);
            if(c =='1'){
                count++;
            }
        }
        return count;
    }
    public int hammingWeight(int n) {
        int num=n;
        String res = dectobin(num);
        int ans = setbits(res);
        return ans;
    }
}