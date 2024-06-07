import java.util.*;
public class june07 {
  public static String replaceWords(List<String> dictionary, String sentences) {
    HashSet<String> set = new HashSet<>();

    for(String str: dictionary) 
    set.add(str);
    String[] wordArr = sentences.split(" ");
    for(int i=0;i<wordArr.length;i++) {
      wordArr[i] = shortestRoot(set,wordArr[i]);
    }
    String ans = "";
    int j=0;
    for(j=0;j<wordArr.length-1;j++) {
      ans += wordArr[j];
      ans += " ";
    }
    ans += wordArr[j];
    return ans;
  }
  public static String shortestRoot(HashSet<String> set, String word) {

    for(int i=0;i<word.length();i++)
      if(set.contains(word.substring(0,i)))
         return word.substring(0,i);
    return word;
  }
  public static void main(String[] args) {
    List<String> dictionary = new ArrayList<>();
    dictionary.add("cat");
    dictionary.add("bat");
    dictionary.add("rat");
    System.out.println(replaceWords(dictionary,"the cattle was rattled by the battery"));
  }
 

}
