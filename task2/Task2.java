import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float center_x = 0;
        float center_y = 0;
        float radius = 0;
        try {
            Scanner sc = new Scanner(new File(args[0]));
            String coords = sc.nextLine();
            Scanner sc2 = new Scanner(coords);
            center_x = sc2.nextFloat();
            center_y = sc2.nextFloat();
            radius = sc.nextFloat();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Scanner sc = new Scanner(new File(args[1]));
            while (sc.hasNextLine()){
                String coords = sc.nextLine();
                Scanner sc2 = new Scanner(coords);
                float point_x = sc2.nextFloat();
                float point_y = sc2.nextFloat();
                float eq = (point_x - center_x)*(point_x - center_x) + (point_y - center_y)*(point_y - center_y);
                if (eq < radius * radius){
                    System.out.println("1");
                }
                else if (eq > radius * radius){
                    System.out.println("2");
                }
                else {
                    System.out.println("0");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
