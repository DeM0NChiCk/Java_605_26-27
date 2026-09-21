import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] array;

        array = new int[Integer.parseInt(args[0])];

        int[] array1 = new int[Integer.parseInt(args[0])];
        int index = 0;
        while (index < array.length) {
            System.out.println("array[index]:" + array[index++]);
//index++; // index (чтение здесь)  -> index = index + 1 -> index
//++index; // index -> index = index + 1 -> index (чтение здесь)
//            System.out.println("index++: " + index++); // 0
//            System.out.println("++index: " + ++index); // 2
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array1);
    }
}
