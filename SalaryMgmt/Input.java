import java.util.Scanner;
import java.util.Vector;

public class Input {
   private Vector<Person> vector;
   private Scanner sc;
   
   public Input(Vector<Person> vector) {
      this.vector = vector;
      this.sc = new Scanner(System.in);
   }
   
	void input() {
	   String y_n =null;
	   int count=0;
	   
	   do {
		   int number = 0, rank =0, year=0;
		   
		   while(true) {
			   System.out.print("�����ȣ : ");
			      number=this.sc.nextInt();
			      if(number>=100) {
			    	  System.out.println("�����ȣ 2�ڸ� �̳� ��,ȣ��1�ڸ� �̳��� �Է����ּ���");
			      }else {
			    	  break;
			      }
		   }
			 
		   while(true) {
			      System.out.print("�� : ");
			      rank=this.sc.nextInt();
			      if(rank>=10) {
			    	  System.out.println("�����ȣ 2�ڸ� �̳� ��,ȣ��1�ڸ� �̳��� �Է����ּ���");
			      }else {
			    	  break;
			      }
		   }
			      
		   while(true) { 
			      System.out.print("ȣ : ");
			      year =this.sc.nextInt();
			      if(year>=10) {
			    	  System.out.println("�����ȣ 2�ڸ� �̳� ��,ȣ��1�ڸ� �̳��� �Է����ּ���");
			      }else {
			    	  break;
			      }
		   }
			  
		      System.out.print("���� : ");
		      int benefit =this.sc.nextInt();
		      
		      Person p =new Person(number,rank,year,benefit);
		      this.vector.addElement(p);
		      count ++;
		         
		         if(vector.size()>1) {
			    	  for(int i=0; i<vector.size()-1; i++) {
				    	  if(vector.get(i).getNumber() == vector.get(i+1).getNumber()) {
				    		  System.out.println("������ ��� ��ȣ�� �ֽ��ϴ�. �ٽ� �Է����ּ���");
				    		  this.vector.remove(--count);
				    	  }
				      } 
		      }
		      System.out.print("�Է� / ��� (I/O) ? :");
		      y_n = this.sc.next().trim();
		      
	   }while(y_n.toUpperCase().equals("I")&&count<5);
	   
	}
   
}
