package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
	DataResult<List<User>> getAll();
	
	Result add(User user);
	
	DataResult<User> getByEmail(String email);
}
