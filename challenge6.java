import java.util.*;

public class challenge6 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String output = "";
		char znak = input.charAt(0);
		int st = 1;

		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i) == znak) {
				st++;
			}
			else{
				output += st+"";
				output += znak;
				st = 1;
				znak = input.charAt(i);
			}
			if(i == input.length() -1) {
				output += st+"";
				output += znak;
			}
		}

		System.out.println(output);
	}	

}