package password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How long do you want your new password?");
		
		int question=Integer.parseInt(sc.nextLine());
		
		String carac="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String resultado="";
		
		if(!question) {
			System.out.println("Error! the value has to be valid");
		}
		if(question<1) {
			System.out.println("Error! the value has to be greater than 0");
		}
		for(int x = 0; x<question; x++) {
			resultado = carac(x);
		}
		System.out.println("Your new password has been generate: "+ resultado);
	}
}
