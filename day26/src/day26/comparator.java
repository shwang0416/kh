package day26;

import java.awt.print.Book;
import java.util.Comparator;

public class comparator {
	public static void main(String[] args) {
		String title = "title";
		String author = "author";
		Book book =new Book();
		
		Comparator<String> c =new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		};
	}
}
