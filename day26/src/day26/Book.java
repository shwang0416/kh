package day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Book implements Serializable{
		
	@Override
	public String toString() {
		return "\""+title+"\", "+price;
	}
		private String title;
		private int price;
		
		public Book() {
			
		}
		
		public Book(String title, int price) {
			this.title = title;
			this.price= price;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}


}
