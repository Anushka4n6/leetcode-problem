public class weeklycontest_189 {
    class Solution {
    public int fun(String s){
        int i= 0;
        int j= s.length()-1;
        int c=0;
        while (i<j){
            if(s.charAt(i) != s.charAt(j)){
                int a1 =s.charAt(i)-'a';
                int a2 =s.charAt(j)-'a';
                int c1 =Math.abs(a1-a2);
                int c2= 26-c1;
                c+=Math.min(c1,c2);
            }
            i++;
            j--;
        }
         return c;
    
    }
    public int minOperations(String s) {
        int n = s.length();
        int m=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cost = fun(s)+i;
            m=Math.min(m,cost);
            s+=s.charAt(0);
            s=s.substring(1);   
        }
        return m;  
    }
}
    
}
   