//author Xin Bian
//partner Yanhao Ding

package lab2;
import java.util.function.Function;

public class generics {
	
	public static void main(String[] args) {
       
        
        Integer [] intArry = {1, 2, 3, 4, 5 };
        Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
        Character [] charArray = {'H','E','L', 'L', 'O' };
        String [] strArray = {"once", "upon", "a", "time" };
        printArray(intArry);
        printArray(doubArry);
        printArray(charArray);
        printArray(strArray);
        
        
		System.out.println("max Integer is: " + getMax(intArry));
		System.out.println("max Double is: " + getMax(doubArry));
		System.out.println("max Character is: " + getMax(charArray));
		System.out.println("max String is: " + getMax(strArray));

		Function<Character[], Character> findMax = (Character[] arr) -> {
			Character max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].compareTo(max) > 0)	max = arr[i];
			}
			
			return max;			
		};
		
		System.out.println("function interface: " + findMax.apply(charArray));
    }
//	public static void printArray(Object[] anArray) {
//		for(Object context: anArray)
//			System.out.print(context); 
//		
//		System.out.print('\n'); 
//	}
	
	public static void printArray(Integer[] anArray) {
		for(int context: anArray)
			System.out.print(context+" "); 
		System.out.print('\n'); 
	}
	
	public static void printArray(Double[] anArray) {
		for(double context: anArray)
			System.out.print(context+" "); 
		System.out.print('\n'); 
	}
	
	public static void printArray(Character[] anArray) {
		for(char context: anArray)
			System.out.print(context+" "); 
		System.out.print('\n'); 
	}
	public static void printArray(String[] anArray) {
		for(String context: anArray)
			System.out.print(context+" "); 
		System.out.print('\n'); 
	}
	
//	public static <PT> void printArray(PT[] anArray) {
//		for(Object context: anArray)
//			System.out.print(context); 
//		System.out.print('\n'); 
//	}
	
	
//Note: generics.java uses unchecked or unsafe operations.
//Note: Recompile with -Xlint:unchecked for details.
	
//	public static Comparable getMax(Comparable[] anArray){
//		Object max = new Object();
//		max = anArray[0];
//		for (int i = 0; i < anArray.length; i++) {
//			if(anArray[i].compareTo(max) > 0) {
//				max = anArray[i];
//			}
//		}
//		return (Comparable) max;	
//	}
	
	public static <M extends Comparable<M>> M getMax(M[] anArray) {
		M max = anArray[0];
		for (int i = 0; i < anArray.length; i++) {
			if (anArray[i].compareTo(max) > 0) {
				max = anArray[i];
			}
		}
		return max;
	}	
	
}
