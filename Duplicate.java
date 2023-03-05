
public class Duplicate {
	public static int remove(int a [], int n){
		int [] temp = new int[n];
		int j = 0;
		for (int i =0; i < n-1; i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
			}
		}
		temp[j++]= a[n-1];
		for(int i =0; i < j; i++){
			a[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {11,32,44,9,44,22,1,22,66,4,33};
		int length = a.length;
		length = remove(a,length);
		for (int i = 0; i < length; i++){
			System.out.print(a[i]+" ");
		}

	}

}
