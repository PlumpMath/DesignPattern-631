/**
 * 
 */

/**
 * @author hochnt Proxy đại diện cho lớp User
 */
public class UserProxy implements ReadFile {

	private ReadFile instance;
	private String name;

	public UserProxy(String name) {
		this.name = name;
	}

	@Override
	public String readFile() {
		if (name.equals("ok")) {
			/*nêu tên người dùng là ok thì mới thực hiện
			phương thức của lớp User, không thì báo
			lỗi! if(instance ==null){*/
			instance = new User(name);
			return instance.readFile();
		}
		return "You can't read file";
	}

}
