public class QuickSort{
	public static void quickSort(int[] arr, int left, int right){
		int i = left; // initially, i is the first index of the array arr
		int j = right; // initially j is the last index of the array arr
		int temp;
		int pivot = arr[(left+right)/2];
		while(i <= j){
			System.out.println("left::"+i+" right::"+j+" pivot::"+pivot);
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i<=j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if(left<j)
			quickSort(arr,left,j);
		if(i<right)
			quickSort(arr,i,right);
	}
	public static void display(int[] arr){
		for(int a : arr)
			System.out.println(a);
	}

	public static void main(String[] args){
		int[] data = new int[]{8,7,9,2,1,3,5,6,4,10};
		int left = 0;
		int right = data.length-1;
		System.out.println("Unsorted:");
		display(data);
		quickSort(data,left,right);
		System.out.println("Sorted:");
		display(data);
	}
}