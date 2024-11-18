class Assignment4 {
	public static void main(String[] args) {
		// Implement your code here 
		String accountNumber = "1011";
		int salary = 40000;
		int accountBalance = 250000;
		String loanType= "Car";
		int LoanAmmountAccepted = 300000;
		int emisExpected = 30;
		
		if(accountNumber.length() == 4 && accountNumber.charAt(0) == '1' && accountBalance >= 1000 )
		{
		    if(salary>25000)
		    {
		        System.out.println("eligibleLoanAmount = "+50000);
		        System.out.println("eligibleEmis = "+36);
		    }
		   else if(salary>50000)
		   {
		        System.out.println("eligibleLoanAmount = "+600000);
		        System.out.println("eligibleEmis = "+60);
		   }
		    else if(salary>50000)
		   {
		        System.out.println("eligibleLoanAmount = "+750000);
		        System.out.println("eligibleEmis = "+84);
		   }
		}
		else
		{
		   System.out.println("Your AccountNumber doesnt have 4 digits: " + accountNumber + " OR your AccountNumber does not start with 1 "+ accountNumber + " OR your account dont have minimum amount of $1000 : "+accountBalance);
		}
	}
}

