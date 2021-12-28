import java.util.regex.Pattern;

public class Validate {
    public static boolean validateEmail(String email) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public static boolean validatePhone(String phone) {
        String EMAIL_PATTERN = "(84|0[3|5|7|8|9])+([0-9]{8})";
        return Pattern.matches(EMAIL_PATTERN, phone);
    }

//    public static void main(String[] args) {
//        String email1 = "test1@gmail.com.vn";
//        String email2 = "123test@gmail.com.vn";
//        String email3 = "test2@gmail.com";
//        String email4 = "test3-1@gmail.com";
//        String email5 = "test4@@gmail.com";
//        String email6 = "test5@domain.com";
//        String email7 = "test6@gmail";
//
//        System.out.println(email1 + ": " + validateEmail(email1));
//        System.out.println(email2 + ": " + validateEmail(email2));
//        System.out.println(email3 + ": " + validateEmail(email3));
//        System.out.println(email4 + ": " + validateEmail(email4));
//        System.out.println(email5 + ": " + validateEmail(email5));
//        System.out.println(email6 + ": " + validateEmail(email6));
//        System.out.println(email7 + ": " + validateEmail(email7));
//
//        String phone1 = "0344005816";
//        String phone2 = "1234567890";
//        String phone3 = "03440058167";
//        System.out.println(phone1 + ": " + validatePhone(phone1));
//        System.out.println(phone2 + ": " + validatePhone(phone2));
//        System.out.println(phone3 + ": " + validatePhone(phone3));
//
//    }
}
