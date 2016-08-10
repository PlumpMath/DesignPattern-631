/**
 * 
 */

/**
 * @author hochnt
 *
 */
public class Database {
	private static final Database INSTANCE = new Database();
	
	private Database() {
	}
	
	public static synchronized Database getInstance(){
		   return INSTANCE;
		}
}
