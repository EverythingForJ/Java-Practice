
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
		
		do {
			
			System.out.print("1. 추가, 2. 검색, 3. 목록 보기 4. 종료 : ");
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
