package test.next.step;


import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class JdbcTests {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"nextstep",
				"nextstep")) {
			
			System.out.println(con);
			System.out.println("con: " + con);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testConnection1() {
		try (Connection con = dataSource.getConnection()) {
			
			System.out.println(con);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCoding() {
		try (SqlSession session = sqlSessionFactory.openSession();
				Connection con = session.getConnection();) {
			
			System.out.println(session);
			System.out.println(con);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	
}
