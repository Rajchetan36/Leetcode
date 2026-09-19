class Solution {
    public boolean palHelper(int i,int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char l=s.charAt(i);
            char r=s.charAt(j);
            if(l!=r){
                return palHelper(i+1,j,s) || palHelper(i,j-1,s);

            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}