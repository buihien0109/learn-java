Teacher : Lục Thanh Ngọc - Rất tấu hài 😁

## Đề bài

### Câu 1

Viết chương trình thực hiện:

1. In ra màn hình hình vuông 

```
*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *
```

2. In ra màn hình hình tam giác

```
*
*  *
*  *  *
*  *  *  *
```

Hoặc

```
      *
    *   *
  *   *   *
*   *   *   *
```

### Câu 2
Cho chuỗi sau : **You only live once, but if you do it right, once is enough**

Thực hiện:

- Đếm số từ trong chuỗi
- Đếm và in ra index của các ký tự **o**

### Câu 3
Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.

Phương thức kiểm tra số nguyên tố:

```java
public static boolean isPrimeNumber(int n) {
    if (n < 2) {
        return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

### Câu 4

Viết chương trình thực hiện:

- Liệt kê 10 số nguyên tố đầu tiên
- Liệt kê các số nguyên tố nhỏ hơn 10

### Câu 5

Viết chương trình thực hiện:

- Nhập chuỗi là tên của bạn, tiến hành chuẩn hóa chuỗi đó
- Nhập vào chuỗi bất kỳ, kiểm tra xem chuỗi đó có là chuỗi palindrome không

### Câu 6

Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.

Thực hiện:

- Nhập các phần tử mảng
- In thông tin mảng ra màn hình
- Liệt kê các phần tử nằm trên đường chéo chính