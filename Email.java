import java.util.*;
import java.util.regex.*;
public class Email
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Email");
      String mail = sc.nextLine();
      String regex = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]+"; 
      Pattern patrn = Pattern.compile(regex);
      Matcher m = patrn.matcher(mail);
      if(m.matches())
      {
      	System.out.println("Valid Email");
      }
      else
      {
      	System.out.println("Invalid Email");
      }
	}
}