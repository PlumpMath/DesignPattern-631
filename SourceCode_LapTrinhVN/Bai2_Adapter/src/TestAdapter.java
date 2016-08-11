import java.util.ArrayList;

/**
 * 
 */

/**
 * Nhóm Structural (nhóm cấu trúc)
 * => kết nối các lớp có Interface không tương thích
 * @author hochnt
 * chuyển đổi một lớp với một giao diện thành giao diện mà ta mong muốn
 * Xây dựng, mở rộng các phương thức của lớp có sẵn phù hợp yêu cầu
 * Tái sử dụng giao diện cũ. Giảm thiểu việ viết lại mã lệnh.
 *
 */
public class TestAdapter {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add(" Teo ");
        array.add(" Ti ");
        array.add(" Ku ");
        IShowListName adapter = new ShowListNameAdapter(new ShowName());
        adapter.showListName(array);
    }
}
