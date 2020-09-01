import java.util.Scanner;
import java.util.Vector;

class Input {
	private Vector<Salary> vector;
	private Scanner scan;
	
	Input(Vector<Salary> vector) { // 생성자를 통해 Salary형의 vector와 scanner를 초기화.
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	
	void input() { // 입력받은 값을 통해 vector형의 Salary를 추가.
//		System.out.print("사원번호 : ");    String sabun = this.scan.next();
//		System.out.print("사원이름 : ");    String name = this.scan.next();
//		System.out.print("기본급 : ");      int defSalary = this.scan.nextInt();
//		System.out.print("야간시간 : ");    int nightHour = this.scan.nextInt();
//		System.out.print("가족수 : ");       int family = this.scan.nextInt();
//		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);
//		this.vector.addElement(sal);
		
// --------------- 동일한 사원번호, 사원코드의 입력 제한이 되어있지않아 기능을 추가하여 코드 작성 -------------------------------		

		String name=null; // 사원 이름 초기화
		String sabun = null; // 사원 번호 초기화
		int defSalary = 0; // 기본급 초기화
		int nightHour = 0; // 야간시간 초기화
		int family = 0; // 가족수 초기화
		
		// 사원 이름 받기
		System.out.print("사원이름 : ");    
		name = this.scan.next(); 
		
		// 사원 번호 받기
		while(true) { 
			System.out.print("사원번호 : ");    
			sabun = this.scan.next();
			
			// 동일한 사원 코드가 있는지 검사
			if(vector.size() > 0){ 
				while(true) {
					int count=0;
					for(int i = 0; i<vector.size(); i++) {
						if(sabun.equals(vector.get(i).getSabun())) {
							count++;
							System.out.println("동일한 사원 번호가 존재합니다. 다시 입력 해주세요.");
							System.out.print("사원번호 : ");    
							sabun = this.scan.next();
						}
					}
					if(count==0) {
						break;
					}
				}
			}
			
			// 받은 사원 번호를 character형 배열에 저장
			char[] array = sabun.toCharArray(); 
			
			// 호흡수당코드인 두번째 자리를 char형에서 int형으로 변환
			int a = 0;
			if(array.length == 4) {
				a = array[1] - '0'; 
			}
						
			
			if(array.length != 4) { // 사원번호는 문자1자리 + 숫자3자리여야하므로 총 4자리가 아닐 경우 다시 입력하도록 반복
				System.out.println("사원번호는 4자리여야합니다. 다시 입력해주세요.");
			}else if(array[0]<'A' || array[0]>'G') { // 사원 번호 첫번째자리인 부서명코드의 범위는 A~G이므로 범위안에 안들어갈 경우 다시 입력하도록 한다. 
				System.out.println("1번째자리의 문자는 A~G만 들어갈 수 있습니다. 다시 입력해주세요.");
			}else if(a>7 || a<1) { // 호흡수당코드는 1~7까지만 들어갈 수 있으므로 1~7이 아닐 경우 다시 입력하도록 한다.
				System.out.println("2번째자리의 숫자는 1~7만 들어갈 수 있습니다. 다시 입력해주세요.");
			}else break; // 모든 조건 통과할 경우 반복문 벗어남.
		}
		
		// 기본급의 범위는 1~4
		while(true) { 
			System.out.print("기본급 (1~4 중에 한자리만 입력해주세요.) :	");
			defSalary = this.scan.nextInt();
				   if(defSalary<1 || defSalary>4) {
				    	  System.out.println("다시 입력해주세요. 1~4 중에 한자리만 입력 가능합니다.");
				   }else {
				    	  break;
				   }
		}
		   
		// 야간 시간은 1~4 사이이다.
		while(true) { 
			   System.out.print("야간시간 (1~4 중에 한자리만 입력해주세요.) : ");
			   nightHour = this.scan.nextInt();
			   if(nightHour<1 || nightHour>4) {
			    	  System.out.println("다시 입력해주세요. 1~4 중에 한자리만 입력 가능합니다.");
			   }else {
			    	  break;
			   }
		}
		 
		// 가족수는 1~5사이이다.
		while(true) { 
			   System.out.print("가족수 (1~5 중에 한자리만 입력해주세요.) : ");
			   family = this.scan.nextInt();
			   if(family<1 || family>5) {
			    	  System.out.println("다시 입력해주세요. 1~5 중에 한자리만 입력 가능합니다.");
			   }else {
			    	  break;
			   }
		}
		
		// 모든 입력을 통과하면 입력된 값으로  Salary를 만든다.
		Salary sal = new Salary(sabun, name, defSalary, nightHour, family);
		this.vector.addElement(sal);
		
	}
}
