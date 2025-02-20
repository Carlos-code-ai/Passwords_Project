package password;
import java.lang.Math;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How long do you want your new password?");
		

		String carac="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder resultado = new StringBuilder("");
		
		try {
			int question=Integer.parseInt(sc.nextLine());
			
			if(question<1) {
				System.out.println("Error! the value has to be greater than 0");
			} 
			
			else {
				for(int x = 0; x<question; x++) {
					int rand = (int) (Math.random() *carac.length());
					resultado.append(carac.charAt(rand));
				}
			}
			System.out.println("Your new password has been generated: "+ resultado);
			
		}catch(Exception e) {
			System.out.println("Error! the value has to be valid");
		}
	}

}
