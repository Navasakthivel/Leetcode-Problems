class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int start=0;
        int end=0;
        String res=null;
        for(int i=0;i<s.length();i++){
            int l1=substring(s,i,i);
            int l2=substring(s,i,i+1);
            int len=Math.max(l1,l2);

            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
            res=s.substring(start,end+1);
        }
        return res;
    }
    public int substring(String s,int left,int right){
        int l=left,r=right;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}