import java.util.Vector;

public class Output {
   private Vector<Employee> vector;

   Output(Vector<Employee> vector) {
      this.vector = vector;
   }

   public void output() {
      this.printLabel();
      this.print();
   }

   private void printLabel() {
      System.out.println("사원번호\t사원이름\t부서명\t 기본급\t 호급수당\t 가족수당\t 야간수당\t 총금액\t 실수령액");
   }

   private void print() {
      for (int i = 0; i < this.vector.size(); i++) {

         System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t", vector.get(i).getBasicSal(), vector.get(i).getName(),
               vector.get(i).getDept(), vector.get(i).getBasicSal(), vector.get(i).getGradeSal(),
               vector.get(i).getFamilySal(), vector.get(i).getNightSal(), vector.get(i).getTotalSal(),
               vector.get(i).getRealSal());
      }
      
   }

}