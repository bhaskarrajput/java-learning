import java.util.Scanner;
class Days{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number 0 to 6");
	int a=sc.nextInt();
	int day=a;
	switch(day){
	case 0:
	System.out.println("SUNDAY");
	break;
	case 1:
	System.out.println("MONDAY");
	break;
	case 2:
	System.out.println("TUESDAY");
	break;
	case 3:
	System.out.println("WEDNESDAY");
	break;
	case 4:
	System.out.println("THURSDAY");
	break;
	case 5:
	System.out.println("FRIDAY");
	break;
	case 6:
	System.out.println("SATURDAY");
}

}
}
