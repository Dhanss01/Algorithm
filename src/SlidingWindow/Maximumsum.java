package SlidingWindow;

import org.junit.Test;

/*1) Did I understand the problem? 
 * 
 * 2)What is the input(s)? What is the expected output?
 * 
 * 3)Test data set
 * Positive : Negative:  Edge:
 * 
 * 4) how to solve it?
 * 
 * 5)Alternate approach
 * 
 * 6)pseudocode
 * get the array and traverse through till the target and sum it up and keep that as a currentsum
 * for next window create a another for loop from target to till n.length
 * find the firstfindow sum and keep that as a currentsum
 * to move to the next window decrement the i from the sum and add the next element in the sum
 * 
 */

public class Maximumsum {
	@Test
	public void test1()
	{
		int[] nums= {2,3,1,2,4,3};
		int target =3;
		System.out.println(returnmaximumsum(nums,target));
	}
	@Test
	public void test2()
	{
		int[] nums= {1,4,4};
		int target =2;
		System.out.println(returnmaximumsum(nums,target));
	}
	@Test
	public void test3()
	{
		int[] nums= {1,1,1,1,1,1,1,1};
		int target =6;
		System.out.println(returnmaximumsum(nums,target));
	}
	
	public int returnmaximumsum(int[] nums,int target)
	{
		if(nums.length<target) {
			System.out.println("given target is greater than the array");
		}
		int max=0, currentsum=0;
				for(int i=0; i<target;i++)
				{
					currentsum=currentsum+nums[i];
				}
				max=currentsum;
				for(int i=target; i<nums.length   ;i++) {
					currentsum=currentsum+nums[i]-nums[i-target];
				}
			max=Math.max(currentsum, max);					
					
		return max;
	}

}
