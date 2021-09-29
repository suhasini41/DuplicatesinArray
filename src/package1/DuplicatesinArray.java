package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DuplicatesinArray {

	private int findDuplicate(int[] n)
	{
		int duplicateElement = 0;
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n.length;i++)
		{
			if(list.contains(n[i]))
			{
				duplicateElement = n[i];
				break;
			}
			else
				list.add(n[i]);
		}
		return duplicateElement;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {2,1,3,4,3};
		Assert.assertEquals(findDuplicate(n),3);
	}
	@Test
	public void testCase2()
	{
		int[] n = {2,1,1};
		Assert.assertEquals(findDuplicate(n),1);
	}
	@Test
	public void testCase3()
	{
		int[] n = {1,1};
		Assert.assertEquals(findDuplicate(n),1);
	}
}
