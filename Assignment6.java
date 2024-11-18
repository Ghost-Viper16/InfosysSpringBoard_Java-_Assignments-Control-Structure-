// program to print next date of the given date
import java.util.Scanner;
class Assignment6 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Date to print the next Date");
		int date = sc.nextInt();
		System.out.println("Enter the Month");
		int month =  sc.nextInt();
		System.out.println("Enter the Year");
		int year =  sc.nextInt();
		if(month==2)
		{
		    if(date>=1 && date <28)
		    {
		        date ++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else if(date==28 && (year %4) ==0)
		    {
		        date++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else  if(date==28 || date ==29)
		    {
		        date=1;
		        month++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		     else
		    {
		        System.out.println("you are giving wrong date and month");
		    }
		}
		else if(month == 1 || month == 3 || month ==5 || month ==7 || month == 8 || month == 10 || month ==12)
		{
		    if(date>=1 && date<31)
		    {
		        date++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else if(date==31 && month!=12)
		    {
		        date =1 ;
		        month++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else if(month == 12 && date==31)
		    {
		        date =1 ;
		        month = 1;
		        year++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else
		    {
		        System.out.println("you are giving wrong date and month");
		    }
		}
		else if(month== 4 || month== 6 || month== 9|| month == 11)
		{
		     if(date>=1 && date<31)
		    {
		        date++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		    else if(date==31)
		    {
		        date =1 ;
		        month++;
		        System.out.println(date+"-"+month+"-"+year);
		    }
		     else
		    {
		        System.out.println("you are giving wrong date and month");
		    }
		}
	}
}

