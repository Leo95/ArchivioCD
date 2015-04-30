import java.util.Scanner;

public class MyUtils {
    public static String readString(String prompt){
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readInt(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        while (true) {
            String tmp = in.nextLine();
            try {
                return Integer.parseInt(tmp);
            } catch (Exception e) {
                System.out.print(prompt);
            }
        }
    }

    public static String secToString(int seconds){
        int minutes, mod;
        minutes = seconds/60;
        mod = seconds%60;

        return String.format("%d:%d", minutes, mod);
    }
}
