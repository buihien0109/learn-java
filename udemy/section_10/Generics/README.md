## Generics trong Java

Generics trong Java cho phép chúng ta tạo ra single class, interface, method và có thể sử dụng với các kiểu dữ liệu khác nhau (Object)

### Java Generics Class

1 class mà có thể sử dụng với bất kỳ kiểu dữ liệu nào thì class đó được gọi clas Generics class

Ví dụ :

```java
class Main {
  public static void main(String[] args) {

    // Khởi tạo generics class với kiểu Interger
    GenericsClass<Integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic Class returns: " + intObj.getData());

    // Khởi tạo generics class với kiểu String
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
    System.out.println("Generic Class returns: " + stringObj.getData());
  }
}

// Tạo generics class
class GenericsClass<T> {

  // variable of T type
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }

  // method that return T type variable
  public T getData() {
    return this.data;
  }
}
```

### Java Generics Method

Giống như generics class, chúng ta có thể tạo method có thể sử dụng với bất kỳ dữ liệu nào

Ví dụ:

```java
class Main {
  public static void main(String[] args) {

    // Khởi tạo class
    DemoClass demo = new DemoClass();

    // generics method làm việc với String
    demo.<String>genericsMethod("Java Programming");

    // generics method làm việc với integer
    demo.<Integer>genericsMethod(25);
  }
}

class DemoClass {

  // Tạo generics method
  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println("Data Passed: " + data);
  }
}
```

### Bounded Types

Thông thường, `type parameter` có thể chấp nhận bất cứ loại dữ liệu nào (ngoại trừ kiểu dữ liệu nguyên thủy) 

Tuy nhiên nếu muốn sử dụng cho một số loại dữ liệu được chỉ định, chúng ta sử dụng `bounded types` (giới hạn)

Cú pháp:

```
<T extends A>
```

Ví dụ:

```java
class GenericsClass <T extends Number> {

  public void display() {
    System.out.println("This is a bounded type generics class.");
  }
}

class Main {
  public static void main(String[] args) {

    // Tạo đối tượng của GenericsClass
    GenericsClass<String> obj = new GenericsClass<>();
  }
}
```

`GenericsClass` ở đây được giới hạn data type. Có nghĩa là GenericsClass có thể làm việc với các loại dữ liệu con của Number như : Interger, Double, ...

Tuy nhiên ở đây chúng ta lại tạo object của `GenericsClass` ở dạng String, nên chương trình sẽ bị lỗi

### Ưu điểm khi sử dụng generics

1. Khả năng tái sử dụng code

Với sự giúp đỡ của generic trong Java, code mà chúng ta viết có thể làm việc với các kiểu dữ liệu khác nhau

```java
public <T> void genericsMethod(T data) {...}
```

Chúng ta tạo generics method, method này được sử dụng với các data như : string data, number data, ...

2. Compile-time Type Checking (Kiểm tra trong quá trình Compile-time)

` type parameter` của generic cung cấp thông tin về loại dữ liệu được sử dụng trong code 

```java
// using Generics
GenericsClass<Integer> list = new GenericsClass<>();
```

`GenericsClass` chỉ làm việc với `Integer`

3. Được sử dụng với Collections

Collections framework sử dụng ý tưởng của generics

```java
// creating a string type ArrayList
ArrayList<String> list1 = new ArrayList<>();

// creating a integer type ArrayList
ArrayList<Integer> list2 = new ArrayList<>();
```

Tương tự như ArrayList, những collection khác như : LinkedList, Queue, Maps cũng là các generics trong Java

