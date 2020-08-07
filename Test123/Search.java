import java.util.Scanner;

public class Search {
	private Friend[] array;
	Scanner scan;
	
	public Search(Friend[] array) {
		super();
		this.array = array;
		this.scan = new Scanner(System.in);
	}
	
	public void search(int count) {
		System.out.println("이름을 검색해주세요 : ");
		String name = scan.nextLine();
		
		for(int i=0; i<count; i++) {
			if(name.equals(array[i].getName())) {
				System.out.println("====검색완료====");
				System.out.println(array[i]);
				System.out.println("==================================");
				return;
			}
		}	
		System.out.println("==================================");
		System.out.println("동일한 이름이 없습니다.");
		System.out.println("==================================");
	}
	
}
