import java.util.Arrays;

public class ArraysLesson {

    int numberLesson = 10;

    public ArraysLesson() {

    }

    public static void main(String[] args) {
        int[] array;
        int examValue;

//        ArraysLesson arraysLesson = new ArraysLesson();
//        int val = arraysLesson.numberLesson;
        ArraysLesson.funcNotReturn(10);
//
        ArraysLesson[] leesson = new ArraysLesson[10];

        examValue = 20;

        array = new int[Integer.parseInt(args[0])]; // length = 10

        int[] array1 = new int[Integer.parseInt(args[0])]; // length = 10
        int index = 0;
        while (index < array.length) {
            System.out.println("array[index]:" + array[index++]);
//index++; // index (чтение здесь)  -> index = index + 1 -> index
//++index; // index -> index = index + 1 -> index (чтение здесь)
//            System.out.println("index++: " + index++); // 0
//            System.out.println("++index: " + ++index); // 2
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array1);

        printSpace();

        printArrayInTerminal(array);

//        ArraysLesson.funcNotReturn(10);

        Arrays.sort(array);

        printArrayInTerminal(array);

        printSpace();

        int valEx = 10;

        System.out.println("funcReturn: " + funcReturn(valEx, "Hello", 20));

        printSpace();

        int[] array2 = array1;

        printArrayInTerminal(array1);
        printArrayInTerminal(array2);

        Arrays.fill(array2, 7);

        printArrayInTerminal(array1);
        printArrayInTerminal(array2, true);
        printArrayInTerminal(Arrays.copyOf(array, array.length - 5), true);

        array2 = Arrays.copyOf(array, array.length);

        printArrayInTerminal(array);
        printArrayInTerminal(array2, true);
                                               // до copyOf | после
        System.out.println(array1 == array2); // true       | false
        System.out.println(array == array1); //  false      | false

        printSpace();
                                                         //  до copyOf | после
        System.out.println(array.equals(array2));        // false        false
        System.out.println(Arrays.equals(array, array2));// false        true

        System.out.println(array1.equals(array2));        // true        false
        System.out.println(Arrays.equals(array1, array2));// true        false

        System.out.println(array.equals(array1));         // false       false
        System.out.println(Arrays.equals(array, array1)); // false       false

    }

    public static void funcNotReturn(int value1) {
        int examVal = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + (--value1));
            if (examVal == value1) {
                return;
            }
        }
    }

    public static void printSpace() {
        System.out.println("-------------------------------------------");
    }

    public static void printArrayInTerminal(int[] array) {
        printArrayInTerminal(array, false);
    }

    public static void printArrayInTerminal(int[] array, boolean printSpace) {
        System.out.println(Arrays.toString(array));
        if (printSpace) {
            printSpace();
        }
    }

    public static int funcReturn(int value1, String value2, int value3) {
        int examVal = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + (--value1));
            if (examVal == value1) {
                return examVal;
            }
        }
        return 0;
    }

    public static int funcReturn(String value1, int value2, int value3) {
        if (value1.length() == value2) {
            return value3;
        }
        return value2;
    }
}
// private    public    default   protected
/*
[модификаторы] [тип_возвращаемого_значения] [имя_метода]([параметры]) {
    // тело метода
    return [значение]; // если тип не void
}
 */
