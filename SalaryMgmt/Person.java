

class Person {
	private int number; // 사원 번호
	private int rank; // 급
	private int year; // 호
	private int benefit; // 수당
	private int beforePayment; // 지급액
	private int tax; //세금
	private int afterPayment; // 차인지급액
	
	Person(int number, int rank, int year, int benefit) {
		this.number = number;
		this.rank = rank;
		this.year = year;
		this.benefit = benefit;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getRank() {
		return rank;
	}

	void setRank(int rank) {
		this.rank = rank;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	int getBenefit() {
		return benefit;
	}

	void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	int getBeforePayment() {
		return beforePayment;
	}

	void setBeforePayment(int beforePayment) {
		this.beforePayment = beforePayment;
	}

	int getTax() {
		return tax;
	}

	void setTax(int tax) {
		this.tax = tax;
	}

	int getAfterPayment() {
		return afterPayment;
	}

	void setAfterPayment(int afterPayment) {
		this.afterPayment = afterPayment;
	}
	//toString
		@Override
	public String toString() {
		return String.format("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
				this.number, this.rank, this.year, this.benefit, this.beforePayment, this.tax, this.afterPayment);
	}
	
}
