package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//객체의 입력
		File target = new File("file/object.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream object = new ObjectInputStream(buffer);
					
		//객체의 출력
		// [프로그램] <- object <- buffer <- File <- [object.text]
		// 읽는 명령도 1개 : readObject()
		
//	ClassNotFoundException
//	try&catch 를 쓰지 않았을 때 나오는 오류
//	캐스팅한 클래스 이름을 java가 모를 경우엔 어떡할까?란 뜻이다.
	
		
							//업 캐스팅(Date -> Object)
							//다운 캐스팅(:원래 형태로 변환)
		try {		
			Date d = (Date) object.readObject();
			SimpleDateFormat f = new SimpleDateFormat("hh시mm분ss초");
			System.out.println(f.format(d));
			
		}
		catch (Exception e){
			//끗

		}
		object.close();
		
		
	}

}
