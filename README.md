# Lab10-Simple Counter

Đây là một ứng dụng Android cơ bản được phát triển bằng Java, minh họa cách thực hiện các tác vụ nền (background tasks) mà không làm đơ giao diện người dùng (UI).

## Tính năng chính

1.  **Giao diện đơn giản**: Gồm một `TextView` hiển thị số đếm và một `Button`.
2.  **Xử lý nền**: Khi nhấn nút "Start Counting", một luồng phụ (background thread) được kích hoạt để thực hiện việc đếm từ 1 đến 10.
3.  **Đồng bộ hóa UI**: Số đếm được cập nhật trên `TextView` trong UI Thread mỗi giây bằng cách sử dụng `runOnUiThread()`.
4.  **Thông báo hoàn thành**: Sau khi đếm xong (đến 10), một thông báo `Toast` sẽ được hiển thị.

## Cấu trúc tệp chính

*   **`app/src/main/java/com/example/lab10_simplecounter/MainActivity.java`**: Chứa logic đếm nền và cập nhật UI.
*   **`app/src/main/res/layout/activity_main.xml`**: Định nghĩa bố cục giao diện người dùng.

## Hướng dẫn chạy

1.  Mở dự án trong Android Studio.
2.  Đảm bảo đã có thiết bị/emulator đang chạy.
3.  Chạy tác vụ `app:assembleDebug` (hoặc nhấn nút Run).

## Lưu ý

Ứng dụng sử dụng `Thread.sleep(1000)` để mô phỏng độ trễ 1 giây giữa các lần tăng số.
