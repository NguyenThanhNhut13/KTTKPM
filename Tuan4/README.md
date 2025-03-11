# Kết luận:

## Bài 1:
### Chọn State Pattern để xử lý trạng thái đơn hàng vì:
 + Mỗi trạng thái có hành vi xử lý riêng biệt
 + Cho phép chuyển đổi trạng thái một cách rõ ràng
 + Dễ dàng thêm trạng thái mới (ví dụ: "Đang hoàn trả")

## Bài 2:
### Chọn Strategy Pattern để áp dụng các cách tính thuế khác nhau cho sản phẩm vì:
 + Cho phép định nghĩa các thuật toán tính thuế (thuế VAT, thuế tiêu thụ, thuế xa xỉ) riêng biệt 
 + Ap dụng chúng một cách linh hoạt mà không làm phức tạp hóa lớp sản phẩm.

Nếu cần kết hợp nhiều loại thuế, có thể mở rộng bằng cách sử dụng Decorator, nhưng Strategy là cốt lõi để xử lý tính toán thuế.

## Bài 3:
### Chọn Decorator Pattern cho hệ thống thanh toán trên vì:
 + Cần thêm các tính năng bổ sung (phí xử lý, mã giảm giá) một cách linh hoạt.
 + Không làm thay đổi cấu trúc gốc với các tính năng khác.