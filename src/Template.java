import org.junit.Test;

public class Template {

	
	public void positivenegative(int[] num)
	{

	int j =0;
	for(int i =0; i<num.length;i++) //0,2,4,6,
	{
	if(num[i]>0)
	{
	 num[i]=num[j];
	}
	 j=j+2;
	}
	
	int m =1;
	for(int k=1;k<num.length;k++)  //1,3,5,6
	{								//12-19,-100,15,98,99,-56,-2
	if(num[k]<0)
	{
		num[k]=num[m];
	 	m=m+2;
	}
}
}
/*
 * eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2};
	
			   expected output {12, -90, 15, -100, 98,-56,99,-2}
 */
	
	
}
