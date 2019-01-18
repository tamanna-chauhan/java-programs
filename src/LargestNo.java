
public class LargestNo {
	public static void main(String[]args) {
		int[] array = {1,2,3,4,5,6};
		int largest =array[0];
		for(int elements: array) {
			if(largest<elements) {
				largest=elements;
			}
		}
			System.out.println(largest);
		}


}
