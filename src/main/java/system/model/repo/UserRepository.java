package system.model.repo;

import java.util.List;

import system.model.entity.User;

public interface UserRepository {
	public void insert(User user);
	public void update(User user);
	 public User findById(Integer id);
	 public List<User> findAll();
	 public void delete(Integer id);

}
