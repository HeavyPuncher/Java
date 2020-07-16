import java.io.*;
import java.util.*;

public class SpellChecker {

  public static void main(String[] args)throws Exception {

  	ArrayList<String> arr = new ArrayList<String>();
  //locates the location of the dictionary txt file so that it can be used
  File file = new File("dictionary.txt"); 
  
  //this is used to read the text in the text file
  BufferedReader br = new BufferedReader(new FileReader(file));
  BufferedWriter bw = 
		    new BufferedWriter(new FileWriter("spellchecked.txt", true));
  
  String txt; 
  String fileName;

  //prints out all of the text in the text file until there is no longer anymore text to print
  while ((txt = br.readLine()) != null){
  	arr.add(txt);
    // System.out.println(txt);
  } 
  System.out.println("sgsg");
	System.out.println(arr.toString());

	  Scanner scan = new Scanner(System.in);
	  String word = scan.nextLine();
  while(!word.isEmpty()){
  	if(!arr.contains(word)){
  		System.out.println("This word is not located in the dictionary, would you like to add the word or enter a replacement?");
  //This is printed if the word is not located in the dictionary array.
  		Scanner s = new Scanner(System.in);
  		String newS = s.nextLine();
  		if (newS.equals("add")) {
  			
  			arr.add(word);
  			System.out.println("Word added");
  			
  			System.out.println(arr.toString());
  			FileWriter writer = new FileWriter("spellchecked.txt");
  			 for(String str:arr) {
  				 writer.write(str + " ");
  			 }
  			 writer.close();
  			 }
  			
  		}
  		break;
  	}
  }
}