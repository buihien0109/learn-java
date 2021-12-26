## Đề bài

Viết chương trình quản lý thông tin sản phẩm của một cửa hàng biết thông tin sản phẩm bao gồm: **mã sản phẩm**, **tên**, **mô tả**, **số lượng**, **giá bán**, **loại sản phẩm**. 

Thực hiện :

- Nhập thông tin sản phẩm từ bàn phím
- In thông tin sản phẩm ra màn hình
- Tìm sản phẩm dựa theo tên

Gợi ý: Tìm người theo tên

```java
//Tìm kiếm theo tên
System.out.println("Nhập tên bạn muốn tìm kiếm: ");
String findName = sc.nextLine();
for(int i = 0; i < n; i++){
    if(persons[i].name.contains(findName)){
        System.out.println(persons[i]);
    }
}
```
