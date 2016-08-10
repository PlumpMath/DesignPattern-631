import java.util.List;

/**
 * 
 */

/**
 * @author hochnt
 *
 */
public class ShowListNameAdapter implements IShowListName {

	private ShowName shownName;
	 
	 
    public ShowListNameAdapter(ShowName shownName) {
        this.shownName = shownName;
    }
 
 
    @Override
    public void showListName(List<String> listName) {
        for (String name : listName) {
            shownName.showName(name);
        }
    }
}
