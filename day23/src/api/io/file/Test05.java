package api.io.file;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		//디렉토리 검색
		// - 디렉토리는 크기가 없다. (크기는 안에 있는 파일의 크기만 존재)
		
		File dir = new File("file");
		System.out.println(dir.isDirectory());
		System.out.println(dir.length()); // 0
		
		//Q) file 폴더에 있는 모든 파일을 불러오고 싶어요(목록 출력)
		//		목록이면 Array / List 둘 중 하나
		// listFiles() => 리턴형 Flie[]
		
		File[] files = dir.listFiles();
		for(File f: files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
