package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
	
	public static void main(String[] args){
		
		boolean result1;
		boolean result2;
		
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input 1st string: ");
        String str1 = in.nextLine();
        
        System.out.print("Input 2nd string: ");
        String str2 = in.nextLine();
        
        in.close();
        
        result1 = anaHelper(str1, str2);
        result2 = rotHelper(str1, str2);
        
        System.out.print("is this Anagram ? " + result1 +"\n");
        System.out.print("is this Rotation ? " + result2);
    	
	}
	
	public static boolean anaHelper(String str1, String str2){
		
		if (str1.length() != str2.length()) {
			return false;
			}
		
		for(int i = 0; i < str1.length(); i++) {
			
			char c = str1.charAt(i);
			
			long count1 = str1.chars().filter(ch -> ch == c).count();
			long count2 = str2.chars().filter(ch -> ch == c).count();
			
			if (count1 != count2) {
				
				return false;
			}
			
		}
		
		return true;
		
	}
	
	
	
	public static boolean rotHelper(String str1, String str2){
		
		if (str1.length() != str2.length()) {
			return false;
			}
		
		String[] str1Arr = new String[str1.length()];
		String[] str2Arr = new String[str2.length()];
		
		str1Arr =  str1.split("");
		str2Arr =  str2.split("");
		
		String[] str2rot = str2Arr;
		
		String[] temp = new String[str1.length()];
				
		for(int i = 0; i < str1.length(); i++) {
			
			for(int j = 0; j < str1.length() - 1; j++) {
				
				temp[j] = str2rot[j+1];
						
			}			
			
			temp[str1.length()-1] = str2rot[0];
			str2rot = Arrays.copyOf(temp, str1.length());
			
			
			if (Arrays.equals(str1Arr, str2rot)) {				
				
				return true;
			}
	
		}		
		return false;		
	}


}

//https://stackoverflow.com/questions/2451650/how-do-i-apply-the-for-each-loop-to-every-character-in-a-string
//http://www.baeldung.com/java-count-chars

