
public class Array2 {
	private int arr[]=null;
	private int n;
	public Array2(int[] arr, int n) {
		this.n = n;
		this.arr=new int[n];
		for(int i=0;i<n;i++) {
			this.arr[i]=arr[i];
		}
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setArrdata(int i,int n) {
		this.arr[i]=n;
	}

}
