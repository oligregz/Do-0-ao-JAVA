import java. util.Locale;

public class data_input_and_output {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 23;
		int	code = 074;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products");
		System.out.printf("%s, witch price is %.2f%n", product1, price1);
		System.out.printf("%s, witch price is %.2f%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code , gender);
		
		System.out.printf("Measue, with decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
	}

}
