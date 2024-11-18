// program to print next date of the given date
import java.util.Scanner;
class Assignment6 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Day to print the next Day");
		int day = sc.nextInt();
		System.out.println("Enter the Month");
		int month =  sc.nextInt();
		System.out.println("Enter the Year");
		int year =  sc.nextInt();
	        if(month == 2)
		{
		    if(day >= 1 && day < 28)
		    {
		        day++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else if(day == 28 && (year % 4) == 0)
		    {
		        day++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else  if(day == 28 || day == 29)
		    {
		        day = 1;
		        month++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		     else
		    {
		        System.out.println("you are giving wrong day and month");
		    }
		}
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
		    if(day >= 1 && day < 31)
		    {
		        day++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else if(day == 31 && month != 12)
		    {
		        day = 1 ;
		        month++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else if(month == 12 && day == 31)
		    {
		        day = 1 ;
		        month = 1;
		        year++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else
		    {
		        System.out.println("you are giving wrong day and month");
		    }
		}
		else if(month == 4 || month == 6 || month == 9|| month == 11)
		{
		     if(day >= 1 && day < 31)
		    {
		        day++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		    else if(day == 31)
		    {
		        day = 1 ;
		        month++;
		        System.out.println(day+"-"+month+"-"+year);
		    }
		     else
		    {
		        System.out.println("you are giving wrong day and month");
		    }
		}
	}
}


