class Assignment7 {
	public static void main(String[] args) {
		// Implement your code here 
		int n =12;
		if(n%3==0 && n%5==0)
		{
		    System.out.println("Zoom");
		}
		else if(n%3==0)
		{
		    System.out.println("Zip");
		}
		else if(n%5==0)
		{
		    System.out.println("Zap");
		}
		else
		{
		    System.out.println("Invalid");
		}
	}
}

