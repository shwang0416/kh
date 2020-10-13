package day10;

public class Test04_3 {

	public static void main(String[] args) {
		/*삽입정렬 구현
			삽입정렬은 맞교환을 하지 않아서 성능이 좋음
			
		 */
//		int[] data = new int[] {30, 50, 20, 10, 40};
		int[] data = new int[] {3,7,2,5,1,4};
		int temp;
		/*
		 * backup : 위치를 바꿔줄 대상값
		 * point : 비교값
		 */
		
		for(int save = 1; save <data.length; save++) {
			int backup = data[save];
			
			for(int point = save - 1; point >= 0; point--) {
				if(backup < data[point]) {
					data[point+1] = data[point];
				}
				else {
					break;
				}
				data[point] = backup;
			}
			//출력
			for(int k = 0; k < data.length; k++) {
				System.out.print(data[k]+" ");
			}
				System.out.println();
			}	
			
		}
}
	

