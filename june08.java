import java.util.*;
public class june08 { 
  public static boolean checkSubArraySum(int[] nums, int k) {
    int prefixMod = 0;

    HashMap<Integer,Integer> map = new HashMap<>();

    map.put(0,-1);

    for(int i=0;i<nums.length;i++) {
      prefixMod = (prefixMod + nums[i]) % k;
      
      if(map.contains(prefixMod))
        if(i - map.get(prefixMod) > 1)
            return true;
      else 
        map.put(prefixMod,i);
    }
    return false;
  }
}
