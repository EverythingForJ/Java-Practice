import java.util.Collections;
import java.util.Vector;

public class Sort {
   private Vector<Employee> vector;
   
   public Sort(Vector<Employee> vector) {
      this.vector = vector;
   }
   
   public void sort() {
      Collections.sort(vector, (e1, e2) -> {
         return (e1.getEmpno().equals(e2.getEmpno()) ? 1 :
            (e1.getEmpno().equals(e2.getEmpno()) ? -1 : 0));
      });
   }
}