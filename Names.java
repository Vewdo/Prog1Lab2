import java.util.*;
public class Names{

     public static void main(String []args){


     		Scanner first = new Scanner(System.in);
     		System.out.println("Enter your first name: ");
     		String firstname = first.next();

     		Scanner last = new Scanner(System.in);
     		System.out.println("Enter your last name: ");
     		String lastname = last.next();

				String firname = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
     			String secname = lastname.substring (0,1).toUpperCase() + lastname.substring(1);

     		System.out.println("Your name is :"+ firname +" "+ secname);


			



     }


}