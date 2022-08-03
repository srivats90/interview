package random;

public class FinalStuffs {

	public FinalStuffs(){
		
		System.out.println("Const");
		
	}
	public static void main(String[] args) {
		
	//	display("krishna");
		
		FinalStuffs f = new FinalStuffs();

	}

	public void display(final String string) {
		
		System.out.println(string);
		
	}
	
	{
		System.out.println("Hello");
		
	}

}

class child extends FinalStuffs {
	
	@Override
	public
	void display(final String string) {
		
	}
}
