import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(args[0]));
            while (sc.hasNextLine()){
                a.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(a);
        int median = a.get(a.size() / 2);
        int moves = 0;
        for (int v: a) {
            moves += Math.abs(v - median);
        }
        System.out.println(moves);
}
}
