package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String st = "";
			for(int i=s.length()-1; i>=0; i--) {
				st+=s.charAt(i)+"";
			}
			System.out.println(st);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String st = "";
			for(int i=0; i<s.length(); i++) {
				if (i%2 == 0){
					char c = s.charAt(i);
					c=Character.toUpperCase(c);
					st+=c+"";
				}else {
					char cc = s.charAt(i);
					cc=Character.toLowerCase(cc);
					st+=cc+"";
				}
			}
			System.out.println(st);
		}, "i is edgy");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String st = "";
			for(int i=0; i<s.length()*2; i++) {
				if(i%2==0) {
					st+=".";
				}else {
					st+=s.charAt(i/2);
				}
			}
			System.out.println(st);
		}, "periods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String st = "";
			s=s.toLowerCase();
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
					st+=ch+"";
				}
			}
			System.out.println(st);
		}, "hi this should become: h ths shld bcm:");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
