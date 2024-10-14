package practice.array;

public class ArrayDay1 {

	public static void main(String[] args) {
		//Declaring and initialization of an array
		int []  arr= {10,20,30,40,50};
		
		//Accessing element based on index
		System.out.println(" First element ::"+ arr[0]);
		System.out.println(" Second Element ::"+ arr[2]);
		
		//Modifying an element
		arr[2]= 25;
		System.out.println("Second element after update :: "+ arr[2]);
		
		//Iterating through an array
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements of an array ::"+ arr[i]);
		}
		
		//ArrayIndoexOutOfBoundException when trying to access element with the index which is not available,If we uncomment below line
		
		//System.out.println(" Sixth element ::"+ arr[5]);
	}
}
