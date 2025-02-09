package Recursion;

public class Search_Element_In_Array 
{
	public static void main(String[] args) {
		int arr[]= {34,56,78,54,32,12};
		int n=search(arr,78);
		if(n==-1)
			System.out.println("Not present");
		else
			System.out.println("Found at "+n);
	}
	static int search(int arr[], int n)
	{
		return search(arr, n, arr.length-1);
	}
	static int search(int arr[], int ele, int index)
	{
		if(index<0)
			return -1;
		if(arr[index]==ele)
			return index;
		return search(arr, ele, index-1);
	}
	
}
