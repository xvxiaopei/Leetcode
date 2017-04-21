package two_sum;
import java.util.*;
public class twoSum {
	public static int [] solution(int [] arr,int target){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(target-arr[i]))
				return new int[]{map.get(target-arr[i]),i};
			if(!map.containsKey(arr[i])) map.put(arr[i], i);
		}
		return null;
	}
	
	public static List<int []> solution2(int [] arr,int target){ //with repeat nums
		List<int[]> res = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(target-arr[i])){
				for(int id:map.get(target-arr[i]))
					res.add(new int[]{id,i});
			}
			if(!map.containsKey(arr[i])) map.put(arr[i], new ArrayList<>());
			map.get(arr[i]).add(i);
		}
		
		return res;
		
	}
}
