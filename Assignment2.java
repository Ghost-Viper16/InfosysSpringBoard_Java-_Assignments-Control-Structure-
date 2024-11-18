//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
class Assignment2 {
	public static void main(String[] args) {
		// Implement your code here 
		int a =1 ,b=5, c=3;
		if(a==7)
		{
		    System.out.println(b*c);
		}
		else if(b==7)
		{
		    System.out.println(c);
		}
		else if(c==7)
		{
		    System.out.println("-1");
		}
		else
		{
		    System.out.println(a*b*c);
		}
	}
}

