package org.zerock.ex00.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //spring test시 어떤 설정을 이용할 것인가?
public class DITests {
  
  @Autowired //스프링을 띄운 후 아래 타입에 객체가 필요해(의존성 자동 주입)
  Restaurant restaurant;
  
  @Autowired
  DataSource dataSource;
  
  @Test
  public void testCon() throws Exception {
    
    Connection con = dataSource.getConnection();
    System.out.println(con);
    con.close();
    
  }
  
  @Test
  public void testExist() {
    System.out.println(restaurant);
  }
}
