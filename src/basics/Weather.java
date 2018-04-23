package basics;

public class Weather {
	public static void main (String[]args) {
		// This program will give suggestions of what to wear based on the weather (temperature and sun condition)
		
		int temperature = 26;
		String sunCondition = "Overcast";
		
		if (temperature > 27) {
			System.out.println("Its pleasent. Wear Shorts and t-shirt");
		}
		else if ((temperature > 22) && (sunCondition == "Sunny")) {
			System.out.println("Its a little cooler. Perhaps wear jeans and t-shirt with jacket");
			System.out.println("Wear a cap and shades to block sun");
		}
		else if ((temperature > 19) || (sunCondition == "Overcast")){
			System.out.println("This is a colder day make sure to wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day. Dress warm");
		}
		System.out.println("The program is ending");
	}
}
