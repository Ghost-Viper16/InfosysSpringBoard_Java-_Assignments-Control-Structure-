class Assignment3 {
	public static void main(String[] args) {
		// Implement your code here 
		char f_type  = 'N';
	int 	quantity = 2;
		int distance = 3;
		if(f_type!='N' && f_type!='V' || quantity==0 || distance==0)
		{
		    System.out.println("-1");
		}
		else
		if(distance>=0 && distance<=3)
		{
		    System.out.println(quantity*15);
		}
		else if(distance>3 && distance<=6)
		{
		    System.out.println((quantity*15)+1);
		}
		else {
		    System.out.println((quantity*15)+2);
		}
		
	}
}