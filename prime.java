
public class prime {
private int number;
prime(){}

prime(int number)
{
	this.number=number;
}
String isprime()
{
  int counter;
  if(number==1)
	  return "1 is neither prime nor composite";
  if(number==2)
	  return "Yes,the given number is prime";
  for(counter=2;counter<=Math.sqrt(number);counter++)
  {
	  if((number%counter)==0)
		  return "No,the given number isn't prime";
  }
  return "Yes,the given number is prime";
	
}
}
