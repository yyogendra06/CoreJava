package in.model;

public class Father extends Person {

	private int noOfChildren;

	public Father() {
		super();
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	@Override
	public void displayRole() {
		System.out.println("Role as Father");
	}
}
