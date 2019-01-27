// Author Name: Azizul Hakim       
// Date: 1273/2019
// Program Name: SpellCheck

import java.io.File;     
import java.io.FileNotFoundException;
import java.util.*;

public class Hakim_SpellCheck 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		
		File file = new File("C:\\Users\\Azizul Hakim\\Desktop\\SpellCheck\\dictionary.txt");
		File file2 = new File("C:\\Users\\Azizul Hakim\\Desktop\\SpellCheck\\teststates.txt");
		Scanner fileScanner = new Scanner(file);
		Scanner fileScanner2 = new Scanner(file2);
		ArrayList<String> filecheck = new ArrayList<String>();
		
		try {
			fileScanner = new Scanner(new File ("words.txt"));
			fileScanner = new Scanner(new File ("dictionary.txt"));
		}
		
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		
		while(fileScanner.hasNext() && fileScanner2.hasNext())
		{
			String line = fileScanner.nextLine();
			String[] words = line.split("\n");
			
			dictionary.get(words);
			
			for(int i = 0; i < dictionary.size(); i++)
			{
				if(dictionary.containsKey(file))
					System.out.println(words);
				
				else
					System.out.println("Not in dictionary");
			}
		}
		
	}

}
