import org.junit.Test;

public class multipleofthreeandfiveFiZZBuzz {

	
	@Test
	public void eg1()
	{
		int s =16;
		FixxBuzz(s);		
	}
	
	public void FixxBuzz(int s) {
			
			for(int i=1;i<=s;i++)
			{
				if(i%3==0&& i%5==0)//first priority 
				{
					System.out.println("FizzBuZZ");
				}

				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				else if(i%3==0)
				{
					System.out.println("Fizz");
				}
				
				else
					System.out.println(i);
			}
}
}
