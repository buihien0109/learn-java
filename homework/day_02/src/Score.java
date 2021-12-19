import java.util.Scanner;

public class Score {
    public static void inputScore() {
        Scanner sc = new Scanner(System.in);
        double theoryScore;
        double practiceScore;

        do {
            System.out.print("Nhập điểm lý thuyết: ");
            theoryScore = sc.nextDouble();
        } while (theoryScore < 0 || theoryScore > 10);

        do {
            System.out.print("Nhập điểm thực hành: ");
            practiceScore = sc.nextDouble();
        } while (practiceScore < 0 || practiceScore > 10);

        double avgScore = calculateAvgScore(theoryScore, practiceScore);
        System.out.printf("1 - Điểm trung bình : %.1f\n", avgScore);
        System.out.printf("2 - Bạn đã %s\n", checkScore(avgScore) ? "ĐẠT" : "TRƯỢT");
    }
    public static double calculateAvgScore(double theoryScore, double practiceScore) {
        return (theoryScore + practiceScore) / 2;
    }

    public static boolean checkScore(double score) {
        return score >= 6;
    }
}
