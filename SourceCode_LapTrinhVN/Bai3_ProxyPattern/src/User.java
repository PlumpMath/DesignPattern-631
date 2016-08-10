/**
 * 
 */

/**
 * @author hochnt
 *
 */
public class User implements ReadFile{

	private String name; // Tên của người dùng
	public User(String name)
	{
		this.name = name;
	}
	@Override
	public String readFile() {
		// Phương thức đọc file 
		return name + " readed";
	}
	

}
