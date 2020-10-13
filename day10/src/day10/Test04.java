package day10;

public class Test04 {

	public static void main(String[] args) {
		int [] data = new int []
				{30, 50, 20, 10, 40};
		
		//버블정렬을 이용하여 데이터를 오름차순으로 정렬하세요.
		
		int k = data.length;
		int temp =0;
		int count = 0;
		for(int j = 0; j < k; j++) {
			for(int i = 0; i < data.length -1; i++) {
				if(data[i] > data[i+1]) {
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
				System.out.println(count++ +"번째 정렬함");
			}
			k--;
		}
		for(int i= 0; i<data.length;i++) 
			System.out.println(data[i]);
	}

}
