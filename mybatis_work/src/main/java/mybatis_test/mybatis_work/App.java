package mybatis_test.mybatis_work;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        String resource = "conf.xml";
        InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        try {
        	Op op = session.getMapper(Op.class);
        	User user = op.getUser(2);
        	Product product = op.getProduct(3);
        	System.out.println(user.getId() + " | " + user.getUserName() + " | " + user.getProducts());
        	System.out.println(product.getId() + " | " + product.getProductName() + " | " + product.getCatalog());
        } finally {
        	session.close();
        }
    }
}
