package system.model.mapper;

import system.model.dto.UserDTO;
import system.model.entity.User;

public class UserMapper {
	public User toEntity(UserDTO dto) {
		User entity = new User();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		return entity;
	}
	
	public UserDTO toDTO(User entity) {
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setEmail(entity.getEmail());
		dto.setName(entity.getName());
		dto.setPassword(entity.getPassword());
		dto.setStatus(entity.getStatus().name());
		dto.setCreateDate(entity.getCreateDate());
		dto.setUpdateDate(entity.getUpdateDate());
		return dto;
	}

}
