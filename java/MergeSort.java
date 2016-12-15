public class MergeSort{
	

	public static void mergeSort(int[] arr, int low, int high){
		System.out.println("in mergeSort");
		int size = arr.length;
		if(low < high){
			
			int middle = (low+high)/2;
			System.out.println("in mergeSort if: low::" + low + " middle::"+middle+" high::"+high);
			mergeSort(arr,low,middle);
			mergeSort(arr,middle+1,high);
			merge(arr,low,middle,high);
		}
	}
	public static void merge(int[] arr, int low, int middle, int high){
		System.out.println("in merge if: low::" + low + " middle::"+middle+" high::"+high);
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; ++i)
			temp[i] = arr[i];
		
		int i = low; // the beginning index of the array
		int m = middle+1; // the middle plus one index of the array
		int k = low; // the beginning index of the array for populating the sorting elements
		
		while(i <= middle && m <= high){ 	// this is to ensure the index i(low) is not more than the middle index 
						 	//and the middle index not more that the high index
			System.out.println("in first while: i::" + i + " middle::"+middle+" high::"+high);
			if(temp[i] < temp[m]){          // this is check if the element in the i(low) is smaller than 
							// the element in the m(middle) index
			System.out.println("in first while:if i::" + i + " middle::"+middle+" k::"+k);
				arr[k] = temp[i];	// the k index in the original array is update according to the appropriate element
				++i;
			}else{
				System.out.println("in first while:else i::" + i + " middle::"+middle+" high::"+high);
				arr[k] = temp[m];	// the k index in the original array is update according to the appropriate element
				++m;
			}
			++k;
		}
		
		while(i <= middle) {
		System.out.println("in second while: i::" + i + " middle::"+middle+" k::"+k);
			arr[k] = temp[i];
			System.out.println("in second while: arr[k]::" + arr[k] + " temp[i]::"+temp[i]);
			++i;
			++k;
		}
		
	}
	public static void main(String[] args){
		int size = 10;
		int[] data = new int[]{3,8,9,2,4,6,7,1,0,10};
		int low = 0;
		int high = 9;
		System.out.println("Before sorting: ");
		for(int d : data)
			System.out.println(d);
		mergeSort(data,low,high);
		System.out.println("After sorting: ");
		for(int d : data)
			System.out.println(d);
		
	}
}