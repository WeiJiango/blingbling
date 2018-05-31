package Service;

import java.util.List;

public interface BaseService<T> {
	public void Add(T t);
	public void delete(T t);
	public void update(T t);
	public List<T> check(T t);
}
