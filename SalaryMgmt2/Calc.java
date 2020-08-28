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
             char deptCode = array[0]; // �μ��� �ڵ�
             int gradeSal = array[1]-'0' ; // ȣ������ڵ�
             
         String dep =this.getdept(deptCode);
            s.setDept(dep);
         
         int ho =this.getgradeSal(gradeSal); //ȣ��
         s.setGradeSal(ho);
         
         int fa = this.family(s.getFamily()); //��������
         s.setFamilySal(fa);
         
         int night = this.getnightSal(s.getNightTime()); //�߰�����
         s.setNightSal(night);
         
         int basic =this.getbasicsal(s.getBasicSal());//�⺻����
         s.setBasicSal(basic);
         
         int total =ho +fa+night +basic; //�ѱݾ�
         
         int tax =(int)(ho*0.1); //����
         
         int real_total =total - tax; //���� �ѱݾ�
         s.setRealSal(real_total);
      }
   }
   private int family(int su){ //�Ϸ��Կ���
      return su*7000;
   }
   
   private String getdept(char code){ //�����μ� �˾ƿ���
      String department = null;
      switch(code){
         case 'A': department = "������"; break;
         case 'B': department = "������"; break;
         case 'C': department = "ȫ����"; break;
         case 'D': department = "�λ��"; break;
         case 'E': department = "�渮��"; break;
         case 'F': department = "���˺�"; break;
         case 'G': department = "�ѹ���"; break;
      }
      return department;
   } 
   
   private int getgradeSal(int su){  //������ �˾ƿ���
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
   
   private int getnightSal(int su){  //������ �˾ƿ���
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
   
   private int getbasicsal(int su){  //������ �˾ƿ���
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