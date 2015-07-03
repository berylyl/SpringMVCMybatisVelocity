package ct.dao.mybatis;
import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import ct.bean.User;

@MapperScan
public interface IUserMapper {

	int createUser(User user);

	List<User> findAll();

	void update(User user);

	int delete(int id);
}
