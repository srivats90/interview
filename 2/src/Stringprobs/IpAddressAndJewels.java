package Stringprobs;

public class IpAddressAndJewels {

	public static String ipAddress(String ip) {
		
		
		String jewels = "aA", stones = "aAAbbbba";
		//String jewels = "z", stones = "ZZ";
		int count = 0;
		for(int i = 0; i<jewels.length(); i++ ) {
			Character a = jewels.charAt(i);
			count += stones.chars().filter( c -> c == a).count();
		}
		System.out.println("Count is " + count);
		return ip.replace(".", "[.]");
	}
	public static void main(String[] args) {
		System.out.println("Ip is " + IpAddressAndJewels.ipAddress("255.100.50.0"));

	}

}
