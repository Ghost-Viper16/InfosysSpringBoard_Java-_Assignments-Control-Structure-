class Tester {
	public static void main(String[] args) {
		// Implement your code here
		int $1Note = 15;
		int $5Note = 10;
		int purchaseAmount = 23 ;
		int totalAmount = ($5Note*5) + ($1Note*1);
		if(totalAmount >= purchaseAmount)
		{
		    int change$5note = purchaseAmount/5;
		    int change$1note = purchaseAmount%5;
		    System.out.println("$1 notes needed = " + change$1note + "\n $5 notes needed = " + change$5note);
		}
		else
		{
		    System.out.println("-1");
		}
	}
}

