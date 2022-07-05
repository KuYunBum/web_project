package com.spring.dao;

import java.util.List;

import com.spring.dto.UserDTO;

public interface UserDAO {

	public void userJoin(UserDTO dto) throws Exception;
	
	public UserDTO userLogin(UserDTO dto) throws Exception;
	
	public UserDTO idCheck(String userID) throws Exception;
	
	public List<UserDTO> memberList() throws Exception;
}
