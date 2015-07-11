package tony.java.exe2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class TestDAO {
	public static void main(String[] args) {
		DAO<User> dao = new DAO<User>();
		
		dao.map = new LinkedHashMap<String, User>();
		
		dao.save("1001", new User(1, 32, "DD"));
		dao.save("1002", new User(2, 53, "TT"));
		dao.save("1003", new User(3, 21, "AA"));
		dao.save("1004", new User(4, 75, "UU"));
		
		
		System.out.println(dao.list());
		System.out.println("-----------------------------------------");
		
		User u1 = dao.get("1003");
		System.out.println(u1);
		dao.update("1002", new User(5, 18, "PP"));
		List<User> list = dao.list();
		System.out.println(list);
		dao.delete("1002");
		List<User> list2 = dao.list();
		System.out.println(list2);
		
	}
}
