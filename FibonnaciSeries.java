package week1.day1;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0;
		int secondNum=1;
		int sum;
		int range=8;
		System.out.println("First Num::" +firstNum);
		for(int i=1;i<range-1;i++) {
			sum =firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
		}
	}
	

}
