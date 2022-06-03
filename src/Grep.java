import java.io.FileInputStream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grep {
    public Grep() {
    }

    public static void main(String[] args) {
        Scanner scanner = null;
        File f = null;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            try {
                f = new File("C:\\Users\\paul.taropa\\Desktop\\3. IntelliJ Java\\Pattern_Matcher\\Pattern_Matcher\\src\\TestFile" + i + ".txt");
                scanner = new Scanner(f);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            while (scanner.hasNext()){
                //System.out.println(scanner.nextLine());
                Pattern pattern = Pattern.compile("\\d",Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(scanner.nextLine());
                while(matcher.find()){
                    counter ++;
                }
            }
            System.out.print(f.getName() + " : ");
            System.out.print(counter);
            System.out.println("\n");
        }
    }
}