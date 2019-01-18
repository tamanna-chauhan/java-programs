
public class Average {
	public static void main(String[]args) {
		int[] array = {1,2,3,4,5,6};
		int sum =0;
		for(int elements: array) {
			sum+=elements;
		}
			System.out.println("the sum of array is: "+sum);
			float average = sum/array.length;
			System.out.println("the average of array is: "+average);
			
		}


}
