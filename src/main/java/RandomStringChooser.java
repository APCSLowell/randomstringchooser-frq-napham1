import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;
  public RandomStringChooser(String [] temp){
    words = new ArrayList<String>();
    for(int i = 0; i < temp.length; i++){
      words.add(temp[i]);
    }
  }
  public String getNext(){
    if(words.size() == 0){
      return "NONE";
    }
    else{
      int temp =  (int)(Math.random() * words.size());
      return words.remove(temp);
    }
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
