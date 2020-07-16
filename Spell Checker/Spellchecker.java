import java.io.*;
import java.util.*;

public class Spellchecker {

  public static void main(String[] args)throws Exception {

  	ArrayList<String> arr = new ArrayList<String>();
  //locates the location of the dictionary txt file so that it can be used
  File file = new File("dictionary.txt"); 
  
  //this is used to read the text in the text file
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String txt; 
  Scanner scan = new Scanner(System.in);
  String word = scan.nextLine();
  //prints out all of the text in the text file until there is no longer anymore text to print
  while ((txt = br.readLine()) != null){
  	arr.add(txt);
    // System.out.println(txt);
  } 
  System.out.println("sgsg");
	System.out.println(arr.toString());


  while(!word.isEmpty()){
  	if(!arr.contains(word)){
  		System.out.println("Wrong word");
  	}
  }
} 
}