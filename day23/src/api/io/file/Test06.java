package api.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		List<File> file = new ArrayList<>();
		List<File> folder = new ArrayList<>();
		File [] arr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("경로를 입력하시오. :");
		String input = sc.nextLine();
		
		File f = new File(input);
		if(f.exists()) {

			if(f.isDirectory()) {
				arr = f.listFiles();
				for(File a : arr) {
					if(a.isDirectory())
						folder.add(a);
					else if(a.isFile())
						file.add(a);
				}
				System.out.println("---------폴더 목록---------");
				System.out.println("파일: ");
				print(file);
				System.out.println("폴더: ");
				print(folder);
			}
			else { //파일일 때
				String name =f.getName();
				long size =f.length();
				Date d =new Date(f.lastModified());
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String time = format.format(d);
				System.out.println("--------파일 정보 출력--------");
				System.out.println("파일 이름: "+name);
				System.out.println("파일 크기: "+size+" byte");
				System.out.println("최종 수정시각 :"+time);
			}
		}
		else {
			System.out.println("파일 혹은 경로가 존재하지 않습니다.");
			System.exit(-1); //프로그램 종료
		}
	}
	public static void print(List<File> file) {
		for(File file1 : file) {
			System.out.println(file1);
		}
	}
}
