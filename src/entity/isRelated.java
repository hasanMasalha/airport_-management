package entity;

public class isRelated {
	private int personID1;
	private int personID2;
	private RelationType relation;
	
	public isRelated(int personID1, int personID2, String relation) {
		super();
		this.personID1 = personID1;
		this.personID2 = personID2;
		this.relation = RelationType.valueOf(relation);
	}
	
	public int getPersonID1() {
		return personID1;
	}
	public void setPersonID1(int personID1) {
		this.personID1 = personID1;
	}
	public int getPersonID2() {
		return personID2;
	}
	public void setPersonID2(int personID2) {
		this.personID2 = personID2;
	}
	public RelationType getRelation() {
		return relation;
	}
	public void setRelation(RelationType relation) {
		this.relation = relation;
	}
	
	

}
