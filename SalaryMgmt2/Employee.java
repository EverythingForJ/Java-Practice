class Employee implements Comparable<Employee> {
      //member
      private String empno; //사원번호
      private String name; // 사원이름
      private String dept; //부서명
      private int basicSal; //기본급
      private int nightTime; //야간시간
      private int family; //가족수
      private int gradeSal; //호급수당
      private int familySal; //가족수당
      private int nightSal; //야간수당
      private int totalSal; //총금액
      private int realSal; //실수령액
      private int total;
      
      
      
      private int thisEmp, otherEmp;
      //Constructor
      public Employee(String name, String empno, int basicSal, int nightTime, int family) {
         this.name = name;
         this.empno = empno;
         this.basicSal = basicSal;
         this.nightTime = nightTime;
         this.family = family;
      }
      //getter setter
      public String getEmpno() {
         return empno;
      }
      public String getName() {
         return name;
      }
      public String getDept() {
         return dept;
      }
      public int getBasicSal() {
         return basicSal;
      }
      public int getNightTime() {
         return nightTime;
      }
      public int getFamily() {
         return family;
      }
      public int getGradeSal() {
         return gradeSal;
      }
      public int getFamilySal() {
         return familySal;
      }
      public int getNightSal() {
         return nightSal;
      }
      public int getRealSal() {
         return realSal;
      }
      public void setEmpno(String empno) {
         this.empno = empno;
      }
      public void setName(String name) {
         this.name = name;
      }
      public void setDept(String dept) {
         this.dept = dept;
      }
      public void setBasicSal(int basicSal) {
         this.basicSal = basicSal;
      }
      public void setNightTime(int nightTime) {
         this.nightTime = nightTime;
      }
      public void setFamily(int family) {
         this.family = family;
      }
      public void setGradeSal(int gradeSal) {
         this.gradeSal = gradeSal;
      }
      public void setFamilySal(int familySal) {
         this.familySal = familySal;
      }
      public void setNightSal(int nightSal) {
         this.nightSal = nightSal;
      }
      public void setRealSal(int realSal) {
         this.realSal = realSal;
      }         
      public int getTotalSal() {
      return totalSal;
   }
   public void setTotalSal(int totalSal) {
      this.totalSal = totalSal;
   }
   @Override
      public String toString() {
         return String.format(
               "%s \t %s \t %s \t %s \t %s \t %s \t %s \t %s \t %s \t %s \t %s",
               empno, name, dept, basicSal, nightTime, family, gradeSal, familySal, nightSal, totalSal,realSal);
      }
   
      @Override
      public int compareTo(Employee o) {
         char thisEmpno = this.empno.charAt(0);
         char otherEmpno = o.empno.charAt(0);
         
         String a = this.empno.substring(1);
         thisEmp = Integer.parseInt(a);
         String b = o.empno.substring(1);
         otherEmp = Integer.parseInt(b);
         
         if(thisEmpno > otherEmpno) return 1;
         else if (thisEmpno < otherEmpno) return -1;
         else return -1;
      }

}
