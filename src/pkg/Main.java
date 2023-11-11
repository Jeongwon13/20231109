package pkg;

class Solution {
    public String solution(String s) {
        
        String[] str = s.split(" ");
        System.out.println(str[0]);
        int min,max;
        
        min=max=Integer.parseInt(str[0]);
        for(int i=0; i<str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if(min > n) min=n;
            if(n > max) max=n;
        }
        
        return min + " " + max;
    }
}