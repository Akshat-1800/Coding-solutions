import java.util.*;

public class BoG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s=sc.next();
        int n=s.length();
        Set<Character> hs = new HashSet<>();
       
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            hs.add(c);
        }
        
            if(hs.size()%2==0){
                System.out.println("CHAT WITH HER!");
                
            }
            else System.out.println("IGNORE HIM!");
        
        
        
        
         
       
        
        
        
        
        
    }
}