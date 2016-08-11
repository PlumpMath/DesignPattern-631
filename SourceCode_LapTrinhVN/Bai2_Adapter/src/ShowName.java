

//Lop thuc thi interface
public class ShowName implements IShowName {    
    @Override
    public void showName(String name) {
        System.out.println(this.standardize(name));
    }
 
 
    public String standardize(String name) {
        String resuilt = name.trim();
        return resuilt;
    }
}
