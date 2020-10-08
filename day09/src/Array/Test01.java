package Array;

public class Test01 {

	public static void main(String[] args) {
		int [] hundreds = new int[3];
		//int [] a = new int[] {10, 20, 30};
		double [] nums = new double[3];
		//double [] nums = new double {1.5, 2.5, 3.5};
		//이렇게 쓸때는 .length로 배열 길이를 확인하는 것이 중요함.(배열길이가 자동계산됨)
		for(int i = 0; i < hundreds.length; i++) {
			hundreds[i] = 100+i*100;
			System.out.println(hundreds[i]);
		}
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 1.5+i*1;
			System.out.println(nums[i]);
		}
	}

}