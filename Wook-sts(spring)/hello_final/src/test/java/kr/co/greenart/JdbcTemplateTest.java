package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.config.RootConfig;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
public class JdbcTemplateTest {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		int result = jdbcTemplate.queryForObject("SELECT 1", int.class);
		// queryForObject : 결과 값이 하나인 query문을 쓸 수 있음
				
		assertEquals(1, result);
	}

	
	@Test
	public void update() {
		int result = jdbcTemplate.update("UPDATE users SET name=?, age=? WHERE id=?"
				, "새이름"
				, 22
				, 1);
		
		assertNotEquals(0, result);
	}
	
//	@Test
//	public void delete() {
//		int result = jdbcTemplate.update("DELETE FROM users WHERE id=?", 3);
//		
//		assertEquals(1, result);
//	}
	@Test
	public void queryForList() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM users");
		
		assertNotEquals(2, list.size());
		assertNotEquals("새이름", list.get(0).get("name"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
