class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean vow=false;
        boolean con=false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(Character.isLetter(c)){
                char ch=Character.toLowerCase(c);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vow=true;
                }
                else{
                    con=true;
                }
            }
        }
        return(vow && con);
    }
}