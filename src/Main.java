import java.util.HashMap;
import java.util.Map;

public class Main {
   public static void main(String[] args) {
      
   }

   public int[] twoSum(int[] nums, int target) {
      int n1 = 0, n2 = 0;
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         map.put(nums[i], i);
      }
      for (int i = 0; i < nums.length; i++) {
         if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) == i) {
            continue;
         }
         if (map.containsKey(target - nums[i])) {
            n1 = i;
            n2 = map.get(target - nums[i]);
            break;
         }
      }
      return new int[] { n1, n2 };
   }
}