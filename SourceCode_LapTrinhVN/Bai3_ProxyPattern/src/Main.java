
/**
 * Nhóm Structural (nhóm cấu trúc)
 * Khi bạn muốn bảo vệ quyền truy xuất vào các chức năng (phương thức) của thực thể
 * Bổ sung trước khi thực hiện phương thức của thực thể.
 * Tạo đối tượng với chức năng được nâng cao theo yêu cầu.
 * @author hochnt
 *
 */
public class Main {    
    public static void main(String[] args) {
         
        UserProxy user1 = new UserProxy("ok");
        System.out.println(user1.readFile());
        UserProxy user2 = new UserProxy("hello");
        System.out.println(user2.readFile());
    }
}
