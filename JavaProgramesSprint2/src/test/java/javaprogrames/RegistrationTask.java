package javaprogrames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationTask {

	public static void main(String[] args) {

		String s = "Your application has been accepted and your registration number is 093467 and your hall\n"
				+ "ticket number is BNG32016";
		Pattern regPattern = Pattern.compile("\\d+");
		Pattern hallTicket = Pattern.compile("[A-Z0-9]{8}");
		System.out.println("ApplicationNumber      HallTicketNumber");
		System.out.println("---------------------------------------");
		Matcher matcher = regPattern.matcher(s);
		if (matcher.find()) {
			System.out.print(matcher.group());
		}
		Matcher matcher1 = hallTicket.matcher(s);
		if (matcher1.find()) {
			System.out.print("               " + matcher1.group());
		}
		System.out.println();

		String s1 = "Application number 9823019348 has been accepted. 0955693 is your hall ticket number";
		Pattern applicationNo = Pattern.compile("\\d+");

		Matcher matcher2 = applicationNo.matcher(s1);

		if (matcher2.find()) {
			System.out.print(matcher2.group());
		}
		String msg = "0955693 is your hall ticket number";
		Pattern hallTicket1 = Pattern.compile("\\d+");
		Matcher matcher3 = hallTicket1.matcher(msg);
		if (matcher3.find()) {
			System.out.print("          " + matcher3.group());
		}
		System.out.println();
		String s2 = "Hall ticket is generated with number 39458 for the application AB123XZ";
		Pattern hallTicket2 = Pattern.compile("\\d+");
		Pattern applicationNo1 = Pattern.compile("[A-Z0-9]{7}");

		Matcher matcher4 = applicationNo1.matcher(s2);
		if (matcher4.find()) {
			System.out.print(matcher4.group());
		}
		Matcher matcher5 = hallTicket2.matcher(s2);
		if (matcher5.find()) {
			System.out.print("              " + matcher5.group());
		}

		System.out.println();
	}
	// TODO Auto-generated method stub

}
