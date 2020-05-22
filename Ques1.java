//Write a program to initialize an integer array and print the sum and average of the array.
class Ques1Array
{
	public static void main(String[] args) {
		int ar[]={10,20,30,40,50};
		int sum=0;
		for (int i=0;i<ar.length;i++) {
			sum=sum + ar[i];
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+((sum*1.0)/ar.length));
	}

}
