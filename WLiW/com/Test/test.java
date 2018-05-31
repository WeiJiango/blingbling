package Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import model.Movie;
import model.MovieCategory;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import tool.GetSessions;

public class test {
	GetSessions getSessions = new GetSessions();
	SqlSession session=null;
	@Test
	public void test1(){
		session = getSessions.getSession().openSession();
		List<MovieCategory> cm = session.selectList("listMovieCategory");
		for(MovieCategory m :cm){
			System.out.println(m.getType());
		}
	}
	@Test
	public void test2()throws Exception{
		  List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("MLGB.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
	@Test
	public void test3(){
		Movie movie =new Movie();
		movie.setId(1);
		session = getSessions.getSession().openSession();
		List<Movie> cm =session.selectList("selectByPrimaryKey", movie);
		for(Movie m :cm){
			System.out.println(m.getName());
		}
	}
}
