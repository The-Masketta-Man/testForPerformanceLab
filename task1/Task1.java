public class Task1 {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int step = Integer.parseInt(args[1]) - 1;
        StringBuilder sb = new StringBuilder("1");
        int cur = (step % length) + 1;
        while (cur != 1) {
            sb.append(cur);
            cur = ((cur + step) % length);
            if (cur == 0) {cur = length;}
        }
        System.out.println(sb);
    }
}
