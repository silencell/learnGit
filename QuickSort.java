import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		 Random r = new Random(); 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = r.nextInt();
		 }
		 QuickSort(arr, 0, arr.length-1);
		 for(int k=0; k<arr.length; k++) {
			 System.out.println(arr[k]);
		 } 
	}
	
	public static void QuickSort(int arr[], int left, int right){
		if(left>=right) {
			return;
		}
		int pivot = left;
		int i = left;
		int j = right;
		while(i<j) {
			//j左移，寻找第一个比arr[pivot]小的数
			while(i<j && arr[j]>=arr[pivot]) {
				j--;
			}
			//i右移，寻找第一个比arr[pivot]大的数
			while(i<j && arr[i]<=arr[pivot]) {
				i++;
			}			
			if(i<j) {
				swap(arr, i, j);
			}
		}
		swap(arr, pivot, i);
		QuickSort(arr, left, i-1);
		QuickSort(arr, i+1, right);
	}

	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
