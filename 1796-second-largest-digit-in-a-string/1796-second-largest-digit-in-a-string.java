import java.util.*;

class Solution {
    public int secondHighest(String s) {
	    int max=-1;
        int smax =-1;
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int bowl = Character.getNumericValue(c);
                if(bowl > max){
                    smax=max;
                    max=bowl;
                }else if(bowl> smax && bowl != max){
                    smax=bowl;
                }
            }
                
        }
      
        
        return smax;
    }
    
    
    
}


