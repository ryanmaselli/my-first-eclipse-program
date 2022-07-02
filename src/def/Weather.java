package def;
	
public class Weather {
	public static void main(String[] args) {
		int temperature = 29;
		if (temperature > 27) {
			System.out.println("It's pleasant. Wear shorts and t-shirt.");

	}
		else if (temperature > 10) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}

}
}