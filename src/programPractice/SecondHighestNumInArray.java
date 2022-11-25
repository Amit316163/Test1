package programPractice;

public class SecondHighestNumInArray {
	
	public static void main(String[] args) {
		
		int temp;
		
		int array[]={10, 20, 25, 63, 96, 57};
		int size=array.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		System.out.println((array[array.length-2]));
	}

}
