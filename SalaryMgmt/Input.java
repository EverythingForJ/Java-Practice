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
			   System.out.print("사원번호 : ");
			      number=this.sc.nextInt();
			      if(number>=100) {
			    	  System.out.println("사원번호 2자리 이내 급,호는1자리 이내에 입력해주세요");
			      }else {
			    	  break;
			      }
		   }
			 
		   while(true) {
			      System.out.print("급 : ");
			      rank=this.sc.nextInt();
			      if(rank>=10) {
			    	  System.out.println("사원번호 2자리 이내 급,호는1자리 이내에 입력해주세요");
			      }else {
			    	  break;
			      }
		   }
			      
		   while(true) { 
			      System.out.print("호 : ");
			      year =this.sc.nextInt();
			      if(year>=10) {
			    	  System.out.println("사원번호 2자리 이내 급,호는1자리 이내에 입력해주세요");
			      }else {
			    	  break;
			      }
		   }
			  
		      System.out.print("수당 : ");
		      int benefit =this.sc.nextInt();
		      
		      Person p =new Person(number,rank,year,benefit);
		      this.vector.addElement(p);
		      count ++;
		         
		         if(vector.size()>1) {
			    	  for(int i=0; i<vector.size()-1; i++) {
				    	  if(vector.get(i).getNumber() == vector.get(i+1).getNumber()) {
				    		  System.out.println("동일한 사원 번호가 있습니다. 다시 입력해주세요");
				    		  this.vector.remove(--count);
				    	  }
				      } 
		      }
		      System.out.print("입력 / 출력 (I/O) ? :");
		      y_n = this.sc.next().trim();
		      
	   }while(y_n.toUpperCase().equals("I")&&count<5);
	   
	}
   
}
