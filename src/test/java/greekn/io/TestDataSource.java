package greekn.io;

import com.zaxxer.hikari.HikariDataSource;
import greekn.io.config.web.WebMvcConfig;
import greekn.io.system.user.UserEntity;
import greekn.io.system.user.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-08 15:26
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestDataSource extends TestApplicationBase {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test4() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void test() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test2() throws Exception {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://101.37.83.15:49700/todo");
        dataSource.setUsername("basic");
        dataSource.setPassword("Basic$0827.&");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test3() throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebMvcConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test5(){
        UserEntity entity = userRepository.findByName("test1").get();
        System.out.println(entity);
    }

}
