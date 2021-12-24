public class Exercise_02 {
    private static String str = "You only live once, but if you do it right, once is enough";

    private static void countWords() {
        String[] arr = str.split(" ");
        System.out.println("1. Số từ trong chuỗi : " + arr.length);
    }

    private static void countAndPrintPositionCharacter(char ch) {
        System.out.println("2. Đếm và in ra index của các ký tự " + ch);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int comp = Character.compare(str.charAt(i), ch);
            if (comp == 0) {
                count++;
                System.out.println("Ký tự " + ch + " xuất hiện tại vị trí : " + i);
            }
        }

        System.out.println("Ký tự " + ch + " xuất hiện " + count + " lần trong chuỗi");
    }

    public static void run() {
        countWords();
        countAndPrintPositionCharacter('o');
    }
}
