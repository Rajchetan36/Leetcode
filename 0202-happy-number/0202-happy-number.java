class Solution {
    public int sqHelper(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=sqHelper(slow);
            fast=sqHelper(sqHelper(fast));
            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }
        }
        return true;
    }
}