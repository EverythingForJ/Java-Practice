import java.util.Scanner;
import java.util.Vector;

public class Input {
	   private Vector<Employee> vector;
	   private Scanner scan;
	   
	   public Input(Vector<Employee> vector) {
	      this.vector = vector;
	      this.scan = new Scanner(System.in);
	   }
	   
		void input() {
		   String y_n =null;
		   int count=0;
		   String name=null;
		   int bp = 0;
		   int nt = 0;
		   int fn = 0;
		   
		   String num=null;
		   
		   do {
				System.out.print("사원 이름 : ");
				name=this.scan.next();
				   
				char[] array;
				loop : do {
					while(true) {
						System.out.print("사원번호 (문자1자리와 숫자3자리를 입력해주세요.) : ");
						num=this.scan.next();
						array = num.toCharArray();
						if(array.length != 4) {
							System.out.println("사원번호는 4자리여야합니다. 다시 입력해주세요.");
						}else {
					    	break;
					   }
					}
			
					int a = array[1] - '0';
					if(a>7 || a<1) {
						System.out.println("2번째자리의 숫자는 1~7만 들어갈 수 있습니다. 다시 입력해주세요.");
					}
					
//					if(array[0]!='A' || array[0]!='B' || array[0]!='C' || array[0]!='D' || array[0]!='E' || array[0]!='F' || array[0]!='G') {
//						System.out.println("1번째자리의 문자는 A~G만 들어갈 수 있습니다. 다시 입력해주세요.");
//					}
					
					if(vector.size()>1) {
						for(int i=0; i<vector.size()-1; i++) {
							if(vector.get(i).getEmpno().equals(vector.get(i+1).getEmpno())) {
								System.out.println("동일한 사원 번호가 있습니다. 다시 입력해주세요");
							}else {
								break loop;
							}
						} 
					}else{
						break;
					}
					
				}while(true);
					   
				
				
				
				while(true) {
						System.out.print("기본급 (1~4 중에 한자리만 입력해주세요.) :	");
							   bp = this.scan.nextInt();
							   if(bp<1 || bp>4) {
							    	  System.out.println("다시 입력해주세요. 1~4 중에 한자리만 입력 가능합니다.");
							   }else {
							    	  break;
							   }
				  }
					   
				  while(true) {
						   System.out.print("야간시간 (1~4 중에 한자리만 입력해주세요.) : ");
						   nt = this.scan.nextInt();
						   if(nt<1 || nt>4) {
						    	  System.out.println("다시 입력해주세요. 1~4 중에 한자리만 입력 가능합니다.");
						   }else {
						    	  break;
						   }
				  }
					 
				  while(true) {
						   System.out.print("가족수 (1~5 중에 한자리만 입력해주세요.) : ");
						   fn = this.scan.nextInt();
						   if(fn<1 || fn>5) {
						    	  System.out.println("다시 입력해주세요. 1~5 중에 한자리만 입력 가능합니다.");
						   }else {
						    	  break;
						   }
				  }
					   
				  Employee p =new Employee(name, num, bp, nt, fn);
				  this.vector.addElement(p);
					
				  System.out.print("입력 / 출력 (I/O) ? :");
			      y_n = this.scan.next().trim();
				  
		   }while(y_n.toUpperCase().equals("I"));
				      
		}
}
