import java.util.Vector;

class Calc {
	private Vector<Person> vector;

	Calc(Vector<Person> vector){
		this.vector = vector;
	}
	
	void calc() {
		for(int i = 0 ; i < this.vector.size() ; i++){
			Person p = this.vector.elementAt(i);
			
			int beforePayment = getBeforePayment(p); // ���޾� ��� �� ����
			int tax = getTax(p); // ���� ��� �� ����
			
			// ���� ���޾� ����
			int afterPayment = beforePayment - tax;
			p.setAfterPayment(afterPayment); 
		}
	}
	
	private int getTax(Person p) {
		int bp = p.getBeforePayment(); // ���޾�
		int tax;
		double rate=0; // ����
		int adjustmentFee=0; // ������
		
		if(bp>=90000) {
			rate =0.012;
			adjustmentFee = 1000;
		}else if(bp<90000 && bp>=80000) {
			rate =0.007;
			adjustmentFee = 500;
		}else if(bp<80000 && bp>=70000) {
			rate =0.005;
			adjustmentFee = 300;
		}else if(bp<70000) {
			rate =0;
			adjustmentFee = 0;
		}
		
		tax = (int)((bp*rate)-adjustmentFee);
		p.setTax(tax);
		return tax;
	}
	
	private int getBeforePayment(Person p){
		
			int bp=0; // ���޾�
			int rankPayment=0; // �޿� ���� �޿�
			int rank=p.getRank(); // ��
			int year=p.getYear(); // ȣ
			
			if(rank == 1) {
				switch(year){
				case 1 : rankPayment = 95000; break;
				case 2 : rankPayment = 92000; break;
				case 3 : rankPayment = 89000; break;
				case 4 : rankPayment = 86000; break;
				case 5 : rankPayment = 83000;
				// default : rankPayment= 0; 
				}
			}else if(rank ==2) {
				switch(year){
				case 1 : rankPayment = 80000; break;
				case 2 : rankPayment = 75000; break;
				case 3 : rankPayment = 70000; break;
				case 4 : rankPayment = 65000; break;
				case 5 : rankPayment = 60000;
				// default : rankPayment= 0; 
				}
			}
			
			bp = rankPayment + p.getBenefit();
			p.setBeforePayment(bp); // ���޾�
			return bp;
	}
	
}
	
	
