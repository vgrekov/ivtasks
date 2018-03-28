package vgrekov.ivtasks.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> positions = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int augend = nums[i];
			int addend = target - augend;
			if (positions.containsKey(addend)) {
				return new int[] { positions.get(addend), i };
			}
			positions.put(augend, i);
		}
		throw new IllegalArgumentException("Input must have exactly one solution.");
	}

}
