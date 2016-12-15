public class InsertionSort{
	public static void main(String[] args){
		int size = 10;
		int[] data = new int[size];
		for(int i = 0; i < size; ++i){
			data[i] = (int)(Math.random() * 100);
		}
		System.out.println("Before sorting: ");
		for(int d : data)
			System.out.println(d);
		
		// O(N*N) complexity
		for(int i = 0; i < size; ++i){
			for(int j = i; j > 0; --j){
				//System.out.println("I am j: " + j);
				if(data[j-1] > data[j]){
					int temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			} 
		}
		System.out.println("After sorting: ");
		for(int n : data)
			System.out.println(n);
	}
}