public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0 || args[0] == null) {
            args = new String[] {"\sEmpty args"};
        }
        System.out.print("Hello world" + args[0]);
        System.out.print("""
                \tHello world\nЯ прошёл 1 занятие.
                Hello Marsel
                	bay;
                """);
        int val1;
        val1 = 5;
        val1 = 5 + 5;
        val1 = 15;
        val1 = 11;
        System.out.println("\t" + val1);
        int val2 = 45;
        val2 = val1 + val2;
        System.out.println(val2); //мухамадеев
        byte val3;
        val3 = (byte) (val2 + 1 + 10);
        System.out.println(val3);//чеботарёв
    }
}