package week1.day2;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 7, 7, 5, 9 , 2, 3, 12};
		System.out.println("Duplicate Numbers are");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+ " ");
					break;
				}
			}
		}

	}

}
