public class StringEx {
//    1, Cho chuỗi sau: You only live once, but if you do it right, once is enough.
//    Thực hiện: Đếm số ký tự 'o' và vị trí của ký tự này trong chuỗi
    private static String str = "You only live once, but if you do it right, once is enough";

    public static int countCharacter(char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int comp = Character.compare(str.charAt(i), ch);
            if (comp == 0) {
                count++;
            }
        }

        return count;
    }

    public static void printPosition(char ch) {
        int count = countCharacter(ch);
        if (count == 0) {
            System.out.println("Ký tự " + ch + " không xuất hiện trong chuỗi");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            int comp = Character.compare(str.charAt(i), ch);
            if (comp == 0) {
                System.out.println("Ký tự " + ch + " xuất hiện ở vị trí : " + i);
            }
        }
    }
}
