package _17_SetFaDu;

import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		
		// Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden 
		// olusan bir liste haline getiren bir program yaziniz. 
		
		int arr[]= {1,2,9,7,10,3,4,4,5,7,3,4,7,8,9,5,7,10,6,9,3,6};
		List<Integer> tekrarsizList = new ArrayList<>();
		Set<Integer> tekrarsizSet = new HashSet<>();
		
		tekrarsizList=remDubMethod1(arr);
		System.out.println("Method1 List ile: "+tekrarsizList);

		tekrarsizSet=remDubMethod2(arr);
		System.out.println("Method2 Set ile : "+tekrarsizSet);

	}

	private static Set<Integer> remDubMethod2(int[] arr) {
		Set<Integer> temp = new HashSet<>();
		for (Integer each:arr
			 ) {
			temp.add(each);
		}
		return temp;
	}

	// method1 : normal liste ve foreach ile
	private static List<Integer> remDubMethod1(int[] arr) {
		List<Integer> temp = new ArrayList<>();
		for (Integer each:arr
			 ) {
			if(!temp.contains(each)) {
				temp.add(each);
			}
		}
		return temp;
	}

}
