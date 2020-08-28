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
				System.out.print("��� �̸� : ");
				name=this.scan.next();
				   
				char[] array;
				loop : do {
					while(true) {
						System.out.print("�����ȣ (����1�ڸ��� ����3�ڸ��� �Է����ּ���.) : ");
						num=this.scan.next();
						array = num.toCharArray();
						if(array.length != 4) {
							System.out.println("�����ȣ�� 4�ڸ������մϴ�. �ٽ� �Է����ּ���.");
						}else {
					    	break;
					   }
					}
			
					int a = array[1] - '0';
					if(a>7 || a<1) {
						System.out.println("2��°�ڸ��� ���ڴ� 1~7�� �� �� �ֽ��ϴ�. �ٽ� �Է����ּ���.");
					}
					
//					if(array[0]!='A' || array[0]!='B' || array[0]!='C' || array[0]!='D' || array[0]!='E' || array[0]!='F' || array[0]!='G') {
//						System.out.println("1��°�ڸ��� ���ڴ� A~G�� �� �� �ֽ��ϴ�. �ٽ� �Է����ּ���.");
//					}
					
					if(vector.size()>1) {
						for(int i=0; i<vector.size()-1; i++) {
							if(vector.get(i).getEmpno().equals(vector.get(i+1).getEmpno())) {
								System.out.println("������ ��� ��ȣ�� �ֽ��ϴ�. �ٽ� �Է����ּ���");
							}else {
								break loop;
							}
						} 
					}else{
						break;
					}
					
				}while(true);
					   
				
				
				
				while(true) {
						System.out.print("�⺻�� (1~4 �߿� ���ڸ��� �Է����ּ���.) :	");
							   bp = this.scan.nextInt();
							   if(bp<1 || bp>4) {
							    	  System.out.println("�ٽ� �Է����ּ���. 1~4 �߿� ���ڸ��� �Է� �����մϴ�.");
							   }else {
							    	  break;
							   }
				  }
					   
				  while(true) {
						   System.out.print("�߰��ð� (1~4 �߿� ���ڸ��� �Է����ּ���.) : ");
						   nt = this.scan.nextInt();
						   if(nt<1 || nt>4) {
						    	  System.out.println("�ٽ� �Է����ּ���. 1~4 �߿� ���ڸ��� �Է� �����մϴ�.");
						   }else {
						    	  break;
						   }
				  }
					 
				  while(true) {
						   System.out.print("������ (1~5 �߿� ���ڸ��� �Է����ּ���.) : ");
						   fn = this.scan.nextInt();
						   if(fn<1 || fn>5) {
						    	  System.out.println("�ٽ� �Է����ּ���. 1~5 �߿� ���ڸ��� �Է� �����մϴ�.");
						   }else {
						    	  break;
						   }
				  }
					   
				  Employee p =new Employee(name, num, bp, nt, fn);
				  this.vector.addElement(p);
					
				  System.out.print("�Է� / ��� (I/O) ? :");
			      y_n = this.scan.next().trim();
				  
		   }while(y_n.toUpperCase().equals("I"));
				      
		}
}
