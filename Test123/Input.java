
import java.util.Scanner;

public class Input {
	Scanner scan;
	Friend[] array;
	
	public Input(Friend[] array) {
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	
	public void input() {
		Add add = new Add(array);
		Search search = new Search(array);
		Show show = new Show();
		
		int count=0;
		
		System.out.println("\t\t\t\t\t\t\t\t<<주소록 관리 프로그램>>\t\t\t\t\t\t\t\t");
		
		do {
			System.out.print("1. 추가  2. 검색  3. 목록 보기  4. 종료 \n");
			System.out.println("선택 : ");
			int no = scan.nextInt();

			switch(no) {
			case 1 : count++; add.add(count); break;
			case 2 :	search.search(count); break;
			case 3 : show.show(array, count); break;
			default : System.exit(-1);
			}
			
		} while( count<=10);
		
	}	
}
