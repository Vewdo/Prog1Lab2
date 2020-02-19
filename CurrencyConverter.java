import java.util.Scanner;
public class CurrencyConverter{

     public static void main(String []args){
        
        Double CAD;      
        Double USD;
        Double EURO;
        
Scanner canadien$= new Scanner(System.in);
        System.out.println("Enter Canadien dollars to be converted: ");
        CAD = canadien$.nextDouble();

        
        
        USD=CAD*0.76;
        
        EURO=CAD*0.68;
        
        System.out.println ("If we have: " + CAD + " Canadien $ then we have: "+ USD + " USA dollars and If converted to Euros we get: " + EURO +" Euros");
     }
}