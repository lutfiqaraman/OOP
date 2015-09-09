/**
 * The main function will calculate the following
 * 1- The weekly salary of the labour
 * 2- The tax that the labour paid
 *
 */

public class payment_tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare an object named labour 
		Labourwage labour = new Labourwage();
		
		//The first and last name of the labour
		
		//The payment rate per hour 
		double paymentRate = 50.00;
		
		// The number of working hours
		double workingHours = 40.00;
		
		//The percentage of tax
		double taxPercentage = 0.05;
		
		// set the first name of the labour
		labour.setFirstName("Lu");
		
		//Set the last name of the labour
		labour.setLastName("Qaraman");

		//Set the payment rate per hour
		labour.setPaymentRate(paymentRate);
		
		//Set the percentage of the salary tax
		labour.setTaxPercentage(taxPercentage);
		
		//Print all details 
		System.out.println(labour.toString());
		System.out.println("Number of working hours = " + workingHours);
		System.out.println("The weekly salary = " + labour.getPayment(workingHours));
		System.out.println("The tax = " + labour.getTax(workingHours));
		
	}

}
