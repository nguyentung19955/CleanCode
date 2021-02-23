# CleanCode

## Tự luận

### Phần 1:

2. Trong một công ty X, có ba nhóm phần mềm, làm cùng công nghệ, số lượng thành viên cũng như kinh nghiệm tương đương
   nhau. Cả ba đều muốn áp dụng Clean Code vào dự án của mình và có 3 cách tiếp cận khác nhau.
    - Team A: Ưu tiên tiến độ dự án trước, deliver được phiên bản đầu tiên, thì mới cho thành viên tham khảo Clean Code
      rồi áp dụng, refactor code ở phiên bản kế tiếp
    - Team B: Clean Code là cực kỳ quan trọng, do đó dành hẳn 30% thời gian của toàn bộ dự án để đào tạo Clean Code cho
      thành viên sau đó mới bắt đầu lập trình
    - Team C: Áp dụng Clean Code là một quá trình. Quy tắc nào dễ hiểu, dễ nhớ thì áp dụng trước. Những kỹ thuật phức
      tạp sẽ học và áp dụng trong tình huống phù hợp. Cân bằng giữa tiến độ và clean code.

Nếu bạn là team lead bạn sẽ chọn phương án nào? Giải thích tại sao?

=> Nếu là team lead tôi sẽ chọn phương án của Team C
vì như vậy thì code sẽ đảm bảo được clean code ở 1 mức nhất định mà lại không trễ deadline của khách hàng.

3. Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean
   Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào? Nếu thời điểm
   hiện tại không áp dụng Clean Code thì khi 1 người khác maintain hay chính bản thân người code thực hiện refactor code
   sẽ rất khó xử lý và mất rất nhiều thời gian để đọc hiểu lại code đang viết gì.

Việc thực hiện clean code cũng sẽ làm cho việc debug rà soát lỗi nhẹ bớt đi vì ta sẽ tập trung được vào những đoạn code
đã được common và viết dễ hiểu.

4. Đề xuất của Vân
   ```float raise``` là thuộc tính trong ```class Salary``` rồi.

```java

int calculateSalaryAfterYears(int initialSalary,int NthYear);

```

Theo tôi thì đề xuất của Vân là phù hợp với Clean Code vì param không cần quá nhiều, tên biến đặt dễ hiểu và công thức
tính dựa vào 2 param trên cũng sẽ dễ hiểu hơn.

### Phần 3

CREATE TABLE users (
user_id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL
);

CREATE TABLE teachers (
user_id INTEGER PRIMARY KEY, phone VARCHAR(255), experiences INTEGER NOT NULL
);

CREATE TABLE students (
user_id INTEGER PRIMARY KEY, year INTEGER NOT NULL,
);

CREATE TABLE courses (
course_id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, description VARCHAR(1000), location VARCHAR(255), opened
DATETIME NOT NULL, teacher_id INTEGER NOT NULL
);

CREATE TABLE cource_student (
course_id INTEGER NOT NULL, student_id INTEGER NOT NULL
);

## Trắc nghiệm

1. Điều nào không đúng khi nói về Design Pattern?
   ```
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
   ```

---

2. Các OOP Design Pattern được chia làm mấy nhóm?
   ```
   B. 3
   ```

---

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   ```
   B. Cung cấp các cơ chế khởi tạo đối tượng khác nhau, làm tăng tính linh hoạt và tái sử dụng code.
   ```

---

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ
   lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
   ```
   C. Factory Method
   ```

---

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   ```
   A. Có
   ```

---

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông
   thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   ```
   B. Immutable
   ```

---

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   ```
   B. Có
   ```

---

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   ```
   C. Cả A và B
   ```

---

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng
   design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay
   đổi tất cả các thuật toán?
   ```
   A. Strategy
   ```

---

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo
    request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?

   ```
      B. Factory method
   ```

---

11. REST là gì?

   ```
      B. Kiểu kiến trúc phần mềm
   ```

---

12. Đâu không phải là đặc điểm của một hệ thống RESTful?

   ```
      C. Server lưu trữ session và history của client.
   ```

---

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?

   ```
      B. POST
   ```

---

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?

   ```
      D. B và C
   ```

---

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?

   ```
      D. Cả 3 đáp án trên
   ```

---

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?

   ```
      B. Repository
   ```

---

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?

   ```
      C. 3
   ```

---

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?

   ```
      A. Sử dụng @ControllerAdvice và @ExceptionHandler
   ```

---

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?

   ```
      C. ERROR
   ```

---

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử
    dụng log level nào?

   ```
      B. WARN
   ```

---

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?

   ```
      B. Không
   ```

---

22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?

   ```
      C. A và B.
   ```

---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag
    của một article.

   ```
      A. Tạo một bảng trung gian (join table) giữa tag và article.
   ```

---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao
    nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?

   ```
      B. 3
   ```

---

25. Tree model nào không dễ để query child node ngay dưới?

   ```
      C. Nested Set
   ```
