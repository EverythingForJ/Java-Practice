import java.util.Scanner;

public class Add {
	private Friend[] array;
	Scanner scan;
	
	public Add(Friend[] array) {
		this.array = array;
		this.scan = new Scanner(System.in);
	}
	
	public void add(int count) {
		if (count >= array.length) {
			System.out.println("전화번호부가 꽉 찼는디유;;");
			return;
		}
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("관계 : ");
		String relationship = scan.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = scan.nextLine();
		
		

		array[count-1] = new Friend(name, relationship, phone);
		
		System.out.println("===================================");
		System.out.println((count)+"번째 주소록 추가 완료 : " + array[count-1]);
		System.out.println("===================================");
	}
}