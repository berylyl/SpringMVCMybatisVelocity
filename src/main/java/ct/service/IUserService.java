package ct.service;


import java.util.List;

import ct.bean.User;


public interface IUserService
{
	
	public int saveUser(User user);

	public List<User> queryAllUsers();
	
	public int getUserCount();
	
	int deleteByUserId(int userId);

}
