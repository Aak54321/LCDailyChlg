import java.util.*;

public class june06 {
  public static boolean isNStraightHand(int[] hand, int groupSize) {
    int handSize = hand.length;

    if (handSize % groupSize != 0)
      return false;

    // create a treemap to maintain the sorted order of the keys in import

    Map<Integer, Integer> map = new TreeMap<>();

    for (int i = 0; i < handSize; i++)
      map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);

    // process the cards until the map is empty
    while (map.size() > 0) {
      // getting the current lowest value in the treemap and it get's updated using
      // the iterator and it's next method

      int current_value = map.entrySet().iterator().next().getKey();
      for (int i = 0; i < groupSize; i++) {
        // if the next elements are not there in map return false
        if (!map.containsKey(current_value + i))
          return false;

        // if not decrement their count by one
        map.put(current_value + i, map.get(current_value + i) - 1);

        // by decrementing if their count is zero remove them
        if (map.get(current_value + i) == 0)
          map.remove(current_value + i);
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isNStraightHand(new int[] { 1, 2, 3, 6, 2, 3, 4, 7, 8 }, 3));
  }
}
