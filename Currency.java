import java.util.Scanner;
class Converter 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
		System.out.println("* Currency Convertor *");
            System.out.println("KNOW YOUR CURRENCY RATE");
            System.out.println();
            System.out.println("Currency 1.USD 2.EUR 3.KWD 4.GBP 5.CAD 6.AUD 7.NZD");
            System.out.print("Enter the amount in INR: ");
		float inr = scanner.nextFloat();
            System.out.print("Enter the currency: "); 
		String curr = scanner.next().toUpperCase();

        switch(curr){

        case "USD" -> {
            float usd = inr/83.8152f;
            System.out.println("INR: "+ inr + "INR = USD: "+ usd + "USD");
                }
		
        case "EUR" -> {
            float eur = inr/93.6494f;
            System.out.println("INR: "+ inr + "INR = EUR: "+ eur + "EUR");
                }
		

        case "KWD" -> {
            float kwd = inr/273.548f;
            System.out.println("INR: "+ inr + "INR = KWD: "+ kwd + "KWD");
                }
		

        case "GBP" -> {
            float gbp = inr/110.711f;
            System.out.println("INR: "+ inr + "INR = GBP: "+ gbp + "GBP");
                }
		
		case "CAD" -> {
                    float cad = inr/62.0442f;
                    System.out.println("INR: "+ inr + "INR = CAD: "+ cad + "CAD");
                }
		
		case "AUD" -> {
                    float aud = inr/56.8975f;
                    System.out.println("INR: "+ inr + "INR = AUD: "+ aud + "AUD");
                }
			  
		case "NZD" -> {
                    float nzd = inr/110.711f;
                    System.out.println("INR: "+ inr + "INR = NZD: "+ nzd + "NZD");
                }
             
            default -> System.out.println("Wrong Currency entered");  
			  
		}
	}
}
