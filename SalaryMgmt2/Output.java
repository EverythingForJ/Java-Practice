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
      System.out.println("�����ȣ\t����̸�\t�μ���\t �⺻��\t ȣ�޼���\t ��������\t �߰�����\t �ѱݾ�\t �Ǽ��ɾ�");
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