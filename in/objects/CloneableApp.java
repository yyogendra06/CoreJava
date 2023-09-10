package in.objects;

class CloneableClass implements Cloneable {
	int i;
	String s;

	public CloneableClass(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class NonCloneableClass {
	int i;
	String s;

	public NonCloneableClass(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneableApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneableClass a = new CloneableClass(1, "Object A Original");

		CloneableClass b = (CloneableClass) a.clone();

		System.out.println(b.i);
		System.out.println(b.s);
		
		NonCloneableClass c = new NonCloneableClass(2, "Object c Not Cloanealbe");
		NonCloneableClass d = (NonCloneableClass) c.clone();
		
		System.out.println(d.i);
		System.out.println(d.s);
	}
}
