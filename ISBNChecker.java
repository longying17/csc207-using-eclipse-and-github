import java.util.Scanner;


public class ISBNChecker {

	/**
	 * @param args
	 */
	public static boolean isISBN(String isbn){
		int sum = 0;
		for(int i = 0; i < isbn.length()-1; i++){
			sum += (i+1)*Character.getNumericValue(isbn.charAt(i));
		}
		char tenth = isbn.charAt(9);
		int tenthInt;
		if (tenth == 'X')
			tenthInt = 10;
		else
			tenthInt = Character.getNumericValue(tenth);
		return (sum % 11) == tenthInt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ISBN Checker");
		System.out.println("\nISBNs from example:");
		System.out.println("'0205080057' is a valid ISBN? " + isISBN("0205080057"));
		System.out.println("'0136091812' is a valid ISBN? " + isISBN("0136091812"));
		System.out.println("'123456789X' is a valid ISBN? " + isISBN("123456789X"));
		
		System.out.println("\nEnter an ISBN: ");
		Scanner input = new Scanner(System.in);
		System.out.println("" + isISBN(input.nextLine()));
		input.close();
		
		return;		
	}

}
