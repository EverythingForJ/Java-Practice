import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ภิทยวุ : ");
		String str = scan.next();
		char[] array = new char[4];
		array = str.toCharArray();
		
		for(int i=0; i<4; i++) {
			System.out.println(array[i]);
		}
		
		int a = array[0]-'0';
		System.out.println(a);
		
	}
}
