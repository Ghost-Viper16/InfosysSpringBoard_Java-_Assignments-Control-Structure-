class Assignment1 {
	public static void main(String[] args) {
		// Implement your code here 
		int a=1, b=4, c=4;
		int dis = (b*b )-(4*a*c);
		if(dis==0)
		{
		    int x = (-b + dis)/2*a;
		    System.out.println("The root is "+x);
		}
		else if(dis>0)
		{
		    int x = (-b + dis)/2*a;
		    int y = (-b - dis)/2*a;
		    System.out.println(x);
		    System.out.println(y);
		}
		else
		{
		    System.out.println("The equation has no real root");
		}
	}
}
//Find the discriminant value using the formula given below.

//discriminant = b2 - 4ac

//If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

//If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

//If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

//Use the formula given below to find the roots of a quadratic equation.

//x = (-b ± discriminant)/2a

 
