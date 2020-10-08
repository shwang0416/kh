package Array;

public class Test09 {
	public static void main(String[] args) {
		/*
		 * [10, 20, 30, 40, 50] 이 저장된 배열을 만들고 다음과 같이 위치를 변경하도록 구현

			배열의 모든 데이터를 뒤집어서 출력(위치를 반대로 변경)
			배열의 데이터 개수가 바뀌어도 뒤집어서 출력이 가능하도록 자동 계산된 길이를 활용하여 반복문 구현
		 */
		int [] arr = new int[] {10, 20, 30, 40, 50};
		int temp = 0; 

		for(int i = 0; i < arr.length/2; i++) {	 //배열원소수만큼 반복하면 원래대로 돌아오므로 /2
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
