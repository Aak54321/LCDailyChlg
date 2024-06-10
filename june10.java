public class june10 {
  public static int heightChecker(int[] heights) {
    int[] bucket = new int[101];

    for(int height: heights)
      bucket[height]++;

    int index=0,count=0;

    for(int i=1;i<=100;i++)
      while(bucket[i] > 0) {
        if(i != height[index++]) count++;
       bucket[i]--;
    }
  }
  return count;
}
