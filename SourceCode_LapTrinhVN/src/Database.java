/**
 * 
 */

/**
 * @author hochnt
 *
 */
public class Database {
	private static final Database INSTANCE = new Database();
	
	//constructor, make sure other class can't renew (Use private)
	private Database() {
	}
	
	/*
	private Database INSTANCE;
	
	//static : make method to class method => other class can call getInstance
	public static Database getInstance(){ 
	   if(INSTANCE == null){
	      INSTANCE = new Database();
	   }
	   return INSTANCE;
	}
	*/
	
	/*
	//sychtonized: tranh truong hop phat sinh hai luong chay song song => tao 2 thuc the Database()
	public static synchronized Database getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Database();
		}
		return INSTANCE;
	}
	*/

	public static Database getInstance(){
	     
	    return INSTANCE;
	}
}
