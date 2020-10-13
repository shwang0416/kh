package Array2d;

public class test04 {
//크기가 가변적인 2차원배열 채우기
	
	public static void main(String[] args) {
		int col = 5;	//행
		int raw = 3;	//열
		
		int [][] data = new int[raw][col];
		//int number = 1;
		int x = 0, y = 0;	//좌표변수. 반복문의 i, j로 만들어도 되지만 계산이 귀찮아진다.
		
		for(int j = 0; j < raw ; j++) {		
			for(int i = 0; i < col ; i++) {
				data[j][i] = 1+col*x + y++;	
				//data[j][i] = number++;
				System.out.print(data[j][i]+"	");
				
				if(y == col) {	//다음 열로 넘어감
					y = 0;
					x++;
				}
			}
			System.out.println();
		}
	}

}
