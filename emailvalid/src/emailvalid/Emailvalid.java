package emailvalid;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Emailvalid {
	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<String>();
		emailID.add("varun@gmail.com");
		emailID.add("apesh@gmail.com");
		emailID.add("varunapesh@gmail.com");
		emailID.add("vasapps@gmail.com");
		String emailFind;
		System.out.println("enter the e-mail you want to search: ");
		Scanner sc = new Scanner(System.in);
		emailFind = sc.nextLine();
		String regex = "^(.+)@(.+)$";
		Matcher matcher = Pattern.compile(regex).matcher(emailFind);if (matcher.matches() && emailID.stream().anyMatch(mail ->
		mail.equals(emailFind))) {
		System.out.println(emailFind + " exists");
		}
		else {
		System.out.println("please enter a valid email adress");
		
		}
		}


}



