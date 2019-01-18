
public class FindEkelement {
	public static void main(String[]args) {
		int[] array = {1,2,3,4,5,6};
		int find = 2;
		boolean ans = false;
		for(int n: array) {
			if(n == find) {
				ans = true;
				break;	
			}
		}
			
			if(ans) {
				System.out.println(find + "is found");
				
			}
			else {
				System.out.println(find + "is not found");
			}
		}
		
		
	
}
