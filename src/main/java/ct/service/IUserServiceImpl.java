package ct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ct.bean.User;
import ct.dao.mybatis.IUserMapper;


@Service
public class IUserServiceImpl implements IUserService {
	@Autowired(required = true)
	private IUserMapper mapper;

	@Override
	public int saveUser(User user) {
		return mapper.createUser(user);
	}


	@Override
	public List<User> queryAllUsers() {
		return mapper.findAll();
	}

	@Override
	public int getUserCount() {
		return mapper.findAll().size();
	}

	@Override
	public int deleteByUserId(int userId) {
		return mapper.delete(userId);
	}
}
