class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int rev=0;
        int compare = x;
        if(x<0){
            return false;
        }    
        while(x!=0){
            rem = x%10;
            rev= rev*10 + rem;
            x=x/10;
        }
        
        if(compare==rev){
            return true;
        }else{
            return false;
        }
        
    }
    
}