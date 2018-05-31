package tool;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.naming.resources.Resource;

public class GetSessions {
	String xml="mybatis-config.xml";
	public SqlSessionFactory getSession(){
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(xml);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
}
