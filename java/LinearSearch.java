public class LinearSearch{
	
	public static int findMini(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length-1; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args){
		int[] arr = new int[]{4,8,6,2,3,1,8,6,10,9,7};
		int minimum = findMini(arr);
		System.out.println("Minimum is: "+minimum);
	}
}