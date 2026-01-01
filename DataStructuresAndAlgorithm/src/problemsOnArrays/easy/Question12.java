package problemsOnArrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Find the number that appear once and other number twice
 */
public class Question12 {

	public static void main(String[] args) {
		int[] arr = {2,2,1};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0 ;i<arr.length;i++) {
			if(map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		Optional<Integer> res =map.entrySet().stream().filter(x -> x.getValue() == 1).map(x->x.getKey()).findFirst();
//		map.forEach((x,y)-> System.out.println(x +"-"+y));
		res.ifPresent(System.out::println);
		
	}

}
