public class Taks {
    public static void main(String[] args) {
        int a = 300;
        int b = 300_000_000;
        System.out.print("" + a + b);

        // double 0,025 -> int = 0 1

        int currentYear = 2026;
        int jumpYears = Integer.parseInt(args[0]);

        int destination;
        if (jumpYears > 0) {
            destination = currentYear + jumpYears;
        } else {
            destination = currentYear;
        }

        System.out.println("Вы прибыли в " + destination + " год!");

        int speed = Integer.parseInt(args[1]);
        int lightSpeed = 300000000;
        long energy = speed * lightSpeed;

        System.out.println("Потрачено энергии: " + energy);

        // 800 056
    }
}
