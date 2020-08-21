import java.io.PrintStream;
import java.util.Vector;

public class Output {
	private Vector<Person> vector;
	private PrintStream ps;
	
	Output(Vector<Person> vector) {
		this.vector = vector;
		this.ps = ps;
	}
	void output() {
		this.printTitle();
		this.printDash();
		this.printLabel();
		this.printDash();
//		for(int i =0; i < this.vector.size(); i++) {
//			Person p = this.vector.elementAt(i);
//			this.ps.printf("%2d\t%d\t%d\t%5d\t%8d\t%5d\t%10d\t",
//					           p.getNumber(), p.getRank(), p.getYear(), p.getBenefit(), p.getBeforePayment(), p.getTax(), p.getAfterPayment());
//		}
		
		for(Person p : this.vector) System.out.println(p);
		this.printDash();
	}
	
	private void printDash() {
		for(int i=0; i< 60; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	private void printTitle() {
		System.out.println("		<<�޿� ���� ���α׷�>>");
	}
	private void printLabel() {
		System.out.println("���\t�޼�\tȣ\t����\t\t���޾�\t\t����\t�������޾�");
	}
	
	private void printLabel1() {
		System.out.println("�Է� ������ ���");
	}
}
