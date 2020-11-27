package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonDao;
import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//이전에 만든 insert 구문을 살펴보고 모듈화(jdbc insert test02)
		//insert = 등록
		
//		데이터 준비
		String person_name = "가나다";
		int javascore = 66;
		int dbscore = 88;
		String gender = "남자";
		
//		등록 구문
		PersonDao dao = new PersonDao();
		dao.insert(person_name, javascore, dbscore, gender);
	}
}
