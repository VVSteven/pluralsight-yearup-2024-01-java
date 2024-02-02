import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] var0){
//        input home:visitor|10:9
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is The Team and Score Information? ");
        String teamScoreInfo = scanner.nextLine();
        scanner.close();

        String[] info = teamScoreInfo.split("\\|", -1);

        for (info name : info)
        System.out.println(info);
    }
}
