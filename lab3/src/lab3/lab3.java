//author Xin Bian
//partner Yanhao Ding

package lab3;
import java.util.ArrayList;

public class lab3 {
	
	public static void main(String[] args) {
		int[][] arr =  {{10, 15, 30, 40},{15, 5, 8, 2},
				{20, 2, 4, 2},{1, 4, 5, 0}};
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(15);
		arr1.add(30);
		arr1.add(40);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(15);
		arr2.add(5);
		arr2.add(8);
		arr2.add(2);
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(20);
		arr3.add(2);
		arr3.add(4);
		arr3.add(2);
		ArrayList<Integer> arr4 = new ArrayList<Integer>();
		arr4.add(1);
		arr4.add(4);
		arr4.add(5);
		arr4.add(0);
		
		ArrayList<ArrayList<Integer>> arrL = new ArrayList<ArrayList<Integer>>();
		arrL.add(arr1);
		arrL.add(arr2);
		arrL.add(arr3);
		arrL.add(arr4);
		
		System.out.print("print2DArray");
		System.out.print('\n');
		print2Darray(arr);
		System.out.print("runningSum2DArray");
		System.out.print('\n');
		runningSum2DArray(arr, 4);
		System.out.print("print2Dlist");
		System.out.print('\n');
		print2DList(arrL);
		System.out.print("runningSum2DArrayList");
		System.out.print('\n');
		runningSum2DArrayList(arrL, 4);
	}
	

	
	//ref to https://stackoverflow.com/questions/12845208/how-to-print-two-dimensional-array-like-table/12845292
	public static void print2Darray(int[][] arr){
		for (int[] row : arr ) {
			print2Drow(row);
		}
	}
	
	public static void print2Drow(int[] row) {
		for (int element : row) {
			System.out.print(element);
            System.out.print("\t");
		}
		System.out.print('\n');
	}
	
	public static void print2DList(ArrayList<ArrayList<Integer>> arrL) {
		for (int i = 0; i < arrL.size(); i ++) {
			for (int j = 0; j < arrL.get(i).size(); j++) {
				System.out.print(arrL.get(i).get(j));
				System.out.print("\t");
			}
			System.out.print('\n');
		}
	}
	
	public static void runningSum2DArrayList(ArrayList<ArrayList<Integer>> arrL, int dir) {
		switch (dir) {
		case 1: 
			for(int i = 0; i < arrL.size(); i ++) {
				for(int j = arrL.get(i).size() - 1; j > 0; j--) {
					arrL.get(i).set(j-1, arrL.get(i).get(j)
							+ arrL.get(i).get(j-1));
				}
			}
			break;
		case 2:
			for(int i = 0; i < arrL.size(); i ++) {
				for(int j = 1; j < arrL.get(i).size(); j++) {
					arrL.get(i).set(j, arrL.get(i).get(j)
							+ arrL.get(i).get(j-1));
				}
			}
			break;
		case 3:
			for(int i = arrL.size() - 1; i > 0 ; i--) {
				for(int j = 0; j < arrL.get(i).size(); j ++) {
					arrL.get(i-1).set(j, arrL.get(i-1).get(j)
							+ arrL.get(i).get(j));
				}
			}
			break;
		case 4:
			for(int i = 1; i < arrL.size(); i++) {
				for(int j = 0; j < arrL.get(i).size(); j ++) {
					arrL.get(i).set(j, arrL.get(i-1).get(j)
							+ arrL.get(i).get(j));
				}
			}
			break;
		
		}
		print2DList(arrL);
	}
	
	public static void runningSum2DArray(int[][] arr, int dir) {
		switch (dir) {
		case 1: 
			for(int i = 0; i < arr[0].length; i ++) {
				for(int j = arr[1].length - 1; j > 0; j--) {
					arr[i][j-1] += arr[i][j];
				}
			}
			break;
		case 2:
			for(int i = 0; i < arr[0].length; i ++) {
				for(int j = 1; j < arr[1].length; j++) {
					arr[i][j] += arr[i][j-1];
				}
			}
			break;
		case 3:
			for(int j = 0; j < arr[1].length; j ++) {
				for(int i = arr[0].length - 1; i > 0 ; i--) {
					arr[i-1][j] += arr[i][j];
				}
			}
			break;
		case 4:
			for(int j = 0; j < arr[1].length; j ++) {
				for(int i = 1; i < arr[0].length; i++) {
					arr[i][j] += arr[i-1][j];
				}
			}
			break;
		
		}
		print2Darray(arr);
	}
	
	
	
}
