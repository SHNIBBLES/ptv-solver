import java.util.Scanner;

public class main {
	public static void programRun() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter 'ideal' for an ideal gas law problem or 'avogadro' for an Avogadro's law problem, or enter 'exit' to stop the program.");
		String input = myScanner.nextLine();
		if(input.equalsIgnoreCase("ideal")) {
			float answer = 0; //solving for this
			System.out.println("Formula: (P1*V1)/T1 = (P2*V2)/T2. Enter '' if the variable is constant");
			System.out.println("Enter your value for P1");
			float P1 = myScanner.nextFloat();
			System.out.println("Enter your value for V1");
			float V1 = myScanner.nextFloat();
			System.out.println("Enter your value for T1");
			float T1 = myScanner.nextFloat();
			System.out.println("Enter your value for P2");
			if(Float.isNaN(P1)) {
				
			}
			float P2 = Float.NaN; myScanner.nextFloat();
			System.out.println("Enter your value for V2");
			float V2 = myScanner.nextFloat();
			float T2 = Float.NaN;
			if(P1 != 0 && V1 != 0 && T1 != 0 && P2 != 0 && V2 != 0) {
				System.out.println("Enter your value for T2");
				T2 = myScanner.nextFloat();
			}
			//with these newly acquired inputs we shall SOLVE
			if(P1 == 0) {	
				if(V2 == 0) {
					answer = (V1*T2)/T1;
				}
				else if(T2 == 0) {
					answer = (V2*T1)/V1;
				}
			}
			else if(V1 == 0) {
				if(P2 == 0) {
					answer = (P1*T2)/T1; 
				}
				else if(T2 == 0) {
					answer = (P2*T1)/P1; 
				}
			}
			else if(T1 == 0) {			
				if(P2 == 0) {
					answer = (P1*V1)/V2;
				}
				else if(V2 == 0) {
					answer = (P1*V1)/P2;
				}
			}
			System.out.println("Your answer is: " + answer);
			programRun();
		}
		else if(input.equalsIgnoreCase("avogadro")) {
			
		}
		else if(input.equalsIgnoreCase("exit")) {
			System.out.println("Program Ruthlessly Terminated");
		}
		else {
			System.out.println("Plz enter 'avodagro' or 'ideal'");
		}
	}
	public static void main(String[] args) {
		programRun();
	}
}

