import java.util.Vector;

class Calc {
   private Vector<Employee> vector;

   Calc(Vector<Employee> vector){
      this.vector = vector;
   }

   void calc(){

      for(int i = 0 ; i < this.vector.size() ; i++){
         Employee s = this.vector.elementAt(i);
         
          char [] array = s.getEmpno().toCharArray();
             char deptCode = array[0]; // 부서명 코드
             int gradeSal = array[1]-'0' ; // 호흡수당코드
             
         String dep =this.getdept(deptCode);
            s.setDept(dep);
         
         int ho =this.getgradeSal(gradeSal); //호급
         s.setGradeSal(ho);
         
         int fa = this.family(s.getFamily()); //가족수당
         s.setFamilySal(fa);
         
         int night = this.getnightSal(s.getNightTime()); //야간수당
         s.setNightSal(night);
         
         int basic =this.getbasicsal(s.getBasicSal());//기본수당
         s.setBasicSal(basic);
         
         int total =ho +fa+night +basic; //총금액
         
         int tax =(int)(ho*0.1); //세금
         
         int real_total =total - tax; //실제 총금액
         s.setRealSal(real_total);
      }
   }
   private int family(int su){ //하루입원비
      return su*7000;
   }
   
   private String getdept(char code){ //진찰부서 알아오기
      String department = null;
      switch(code){
         case 'A': department = "영업부"; break;
         case 'B': department = "업무부"; break;
         case 'C': department = "홍보부"; break;
         case 'D': department = "인사부"; break;
         case 'E': department = "경리부"; break;
         case 'F': department = "찬촉부"; break;
         case 'G': department = "총무부"; break;
      }
      return department;
   } 
   
   private int getgradeSal(int su){  //진찰비 알아오기
      int fee = 0;
      switch(su){
         case 1 : fee = 900000; break;
         case 2 : fee = 400000; break;
         case 3 : fee = 600000; break;
         case 4 : fee = 800000; break;
         case 5 : fee = 300000; break;
         case 6 : fee = 800000; break;
         case 7 : fee = 800000; break;
         default : fee = 0; 
      }
      return fee;
   }
   
   private int getnightSal(int su){  //진찰비 알아오기
      int fee = 0;
      switch(su){
         case 1 : fee = 1500; break;
         case 2 : fee = 2500; break;
         case 3 : fee = 3500; break;
         case 4 : fee = 4500; break;
         default : fee = 0; 
      }
      return fee;
   }
   
   private int getbasicsal(int su){  //진찰비 알아오기
      int fee = 0;
      switch(su){
         case 1 : fee = 15000; break;
         case 2 : fee = 25000; break;
         case 3 : fee = 35000; break;
         case 4 : fee = 45000; break;
         default : fee = 0; 
      }
      return fee;
   }
}   