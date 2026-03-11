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

     static String extrabit(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = s.length(); i < 32; i++){
            sb.append('0');   
        }

        sb.append(s);
        return sb.reverse().toString();
    }

    static int bintodec(String result){
        int dec=0;
        int base=1;
        for(int i=result.length()-1;i>=0;i--){
            char c=result.charAt(i);
            if(c=='1'){
                dec+=base;
            }
            base*=2;
        }
        return dec;
    }
    public int reverseBits(int n) {
        int num=n;
        String res = dectobin(num);
        String rev = extrabit(res);
        int ans = bintodec(rev);
        return ans;
    }
}