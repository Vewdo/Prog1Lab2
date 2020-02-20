import java.util.*;
 public class MinuteConverter {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of seconds you want in minutes: ");
        int seconds = in.nextInt(); 
        
        int sec = seconds % 60;
        int p2 = seconds / 60;
        
        
        System.out.print( p2 + ":" + sec);
        System.out.print("\n");
    }    
 }