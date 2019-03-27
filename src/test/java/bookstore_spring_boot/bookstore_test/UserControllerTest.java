package bookstore_spring_boot.bookstore_test;

import static org.assertj.core.api.Assertions.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bookstore_spring_boot.bookstore_test.web.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	@Autowired
	private UserController controller;

	@Test
	public void contextLoads() throws Exception {
	assertThat(controller).isNotNull();
	}
}
