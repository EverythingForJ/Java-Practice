

public class Friend {
	private String name, relation, phone;

	public Friend(String name, String relation, String phone) {
		super();
		this.name = name;
		this.relation = relation;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "이름 : "+getName() + ", 전화번호 : " + getPhone() + ", 관계 : " + getRelation();
	}
	
}
