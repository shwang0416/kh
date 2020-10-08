package Array;

public class Test08 {

	public static void main(String[] args) {
		/*
		 * 배열의 위치조작
		 * 데이터의 위치를 서로 바꾸는 작업을 수행해본다.
		 */
		
		int [] data = new int[] 
				{1, 3, 5, 7, 9};
		
		System.out.println(data[0]+", "+data[data.length-1]);
		
		int temp = data[0];
		data[0] = data[(data.length-1)];
		data[(data.length-1)] = temp;

		System.out.println(data[0]+", "+data[data.length-1]);
	}

}
