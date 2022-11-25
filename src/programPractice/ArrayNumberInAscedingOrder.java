package programPractice;

public class ArrayNumberInAscedingOrder {
	
	public static void main(String[] args) {
		
		int temp;
		int array[]= {30,20,10,50,25};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
			if(array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
			System.out.println(array[i]);
		}
		System.out.println("===================");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
			if(array[i]<array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
			System.out.println(array[i]);
		}
		
	}

}
