package in.objects.interfaceexamples;

public class MultipleInterfaceSameMethodApp implements Interface1,Interface2{

	@Override
	public void print() {
		System.out.println("Inside Print");
		
	}
	
	public static void main(String[] args) {
		MultipleInterfaceSameMethodApp app = new MultipleInterfaceSameMethodApp();
		app.print();
	}

}
