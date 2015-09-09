/**
 * The class is created to do the following
 * creating a labour object with first name and last name
 * calculate the weekly salary of that labour and
 * calculate the tax that the labour has to pay weekly
 */

public class Labourwage {
	private String lastName;
	private String firstName;
	private Double paymentRate;
	private Double taxPercentage;
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the paymentRate
	 */
	public Double getPaymentRate() {
		return paymentRate;
	}
	/**
	 * @param paymentRate the paymentRate to set
	 */
	public void setPaymentRate(Double paymentRate) {
		this.paymentRate = paymentRate;
	}
	
	/* 
	 * The method will print all the details of the labour 
	 */
	
	/**
	 * @return the taxPercentage
	 */
	public Double getTaxPercentage() {
		return taxPercentage;
	}
	/**
	 * @param taxPercentage the taxPercentage to set
	 */
	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public String toString() {
		return "The details of the labour " + "\n" + 
				"Last Name: " + lastName + "\n" + 
				"First Name:  " + firstName + "\n" +
				"Payment per Hour = " + paymentRate + "\n" + 
				"Tax Percentage = " + taxPercentage;
	}
	
	public double getPayment(double hours) {
		double payment;
		payment = this.paymentRate * hours;
		return payment;
	}
	
	public double getTax(double hours) {
		double tax;
		tax = (this.paymentRate * hours) * this.taxPercentage;
		return tax;
	}
	
	
}

