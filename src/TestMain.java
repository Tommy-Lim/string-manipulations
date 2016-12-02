import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.*;

public class TestMain {

	public static void main(String[] args) throws FileNotFoundException {
		wordsAddAllToArray("message.txt");
	}
	
	public static ArrayList<String> wordsAddUniqueToArray(String filename) throws FileNotFoundException{
		File f = new File(filename);
		Scanner sc = new Scanner(f);
		ArrayList<String> words = new ArrayList<String>();
		String word="";
		while(sc.hasNext()){
			word=sc.next();
			System.out.println(word);
			if(!words.contains(word)){	
			words.add(word);	
			}
		}
		System.out.print(words);
		return words;
		
	}
	
	public static ArrayList<String> wordsAddAllToArray(String filename) throws FileNotFoundException{
		File f = new File(filename);
		Scanner sc = new Scanner(f);
		ArrayList<String> words = new ArrayList<String>();
		String word="";
		while(sc.hasNext()){
			word=sc.next();
			System.out.println(word);
			words.add(word);
		}
		System.out.print(words);
		return words;
		
	}

}
