import java.util.Scanner;
public class Asgnmt_3_2 {
	
	
public static void main(String[] args)
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a positive whole number");
	num=sc.nextInt();
	sc.close();
	if(num<1)
		System.out.println("Please recheck!");
	else
	{
 prime obj=new prime(num);
 System.out.println(obj.isprime());
	}
}
}