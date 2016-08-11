/*
Factory Method là một mẫu khác thuộc nhóm các mẫu thiết kế phục vụ mục đích khởi tạo 
(kỳ trước chúng ta có mẫu Abstract Factory cũng nằm trong nhóm này). 
Điểm khác biệt cơ bản của 2 mẫu này đó là Abstract Factory dược dùng để tạo ra nhiều loại đối tượng thuộc cùng một nhóm, 
còn Factory Method nhằm mục đích thay đổi việc khởi tạo đổi tượng một cách linh hoạt. 

Mình có một ví dụ đơn giản cho trường hợp này: Nhà bạn chỉ có một con thú cưng (giống cái nhé), 
và nó đang mang bầu, tới khi nó đẻ con, bạn chạy sang nhà hàng xóm khoe, nhưng người hàng xóm này chỉ mới chuyển tới thôi, 
và họ không biết con thú cưng của bạn là thuộc loài nào, 
nên họ chỉ có thể biết được ngay lúc bạn giới thiệu rằng: “Con thú cưng nhà nó đã đẻ con rồi đó”. 
Và một bà cụ nhà kế bên, khi nghe thấy bạn khoe sẽ nghĩ ngay rằng: "Thế là con mèo lúc trước mình cho nó đã đẻ ra mấy chú mèo con rồi!".
 * */

public class Main {
    public static void main(String[] args) {
        System.out.println("once upon a time !!!");
        Me me = new MeWithACat();
        me.introduceMyPet();
  
        System.out.println();
        System.out.println("At present");
        me = new MeWithADog();
        me.introduceMyPet();
    }
}
