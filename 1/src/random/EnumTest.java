package random;

public class EnumTest {

	public static void main(String[] args) {
		
		for(Days day :Days.values()) {
			System.out.println(day.dayNumber);
		}
	}

}

enum Days{
	MONDAY(1, 1.0),
	TUESDAY(2, 2.0),
	WEDNESDAY(3, 3.0);
	
	public final int dayNumber;
	public final double dayDouble;
	
	Days(int dayNumber, double dayDouble){
		this.dayNumber = dayNumber;
		this.dayDouble = dayDouble;
	}

}