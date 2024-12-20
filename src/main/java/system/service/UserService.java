package system.service;

import java.util.List;

import system.model.dto.UserDTO;

public interface UserService {
	public void saveUser(UserDTO userDTO);
	 public void updateUser(UserDTO userDTO);
	 public UserDTO getUserById(Integer id);
	 public List<UserDTO> getAllUsers();
	 public void deleteUser(Integer id) ;
}
