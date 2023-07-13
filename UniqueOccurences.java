import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurences {

  // Problem Statement - Given an array arr of N integers, the task is to check whether the frequency of the elements in the array is unique or not. Or in other words, there are no two distinct numbers in array with equal frequency. If all the frequency is unique then return true, else return false.

  public static boolean isFrequencyUnique(int n, int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    // Calculate the frequency of elements
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }

    Set<Integer> set = new HashSet<>(map.values());

    return map.size() == set.size();
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 5, 5 };

    boolean ans = isFrequencyUnique(5, arr);
    System.out.println(ans);
  }
}
