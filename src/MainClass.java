import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Sir sir1 = new Sir();
		int varianta;
		Scanner input = new Scanner(System.in);
		System.out.print("Ce doriti sa faceti: 1 - ordonat sirul crescator; 2 - cautat o valuare in sir: ");
		varianta = input.nextInt();
		
		switch (varianta) {
		case 1:

			sir1.sortare();
			sir1.afisare();
			break;
			
		case 2:
			int val;
			Scanner input2 = new Scanner(System.in);
			System.out.print("Introduceti o valuare intreaga: ");

			val = input2.nextInt();
			input2.close();
			sir1.setNumar(val);
			sir1.cautare();
			break;

		}
		input.close();
	}

}
