package two_sum;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		int [] nums = {2, 7, 11, 15};
		int target = 18;
		int [] ans = {1,2};
		assertArrayEquals(twoSum.solution(nums,target),ans);
	}
	
	@Test 
	public void testForRepeatNums(){
		int [] nums = {2,2, 7, 7,2, 15};int target = 9;
	    List<int []> res = twoSum.solution2(nums,target);
	    List<int []> ans = Arrays.asList(new int[][]{{0,2},{1,2},{0,3},{1,3},{2,4},{3,4}});
	    assertEquals(res.size(),ans.size());
	    for(int i=0;i<res.size();i++){
	    	assertArrayEquals(res.get(i),ans.get(i));
	    }
	}

}
