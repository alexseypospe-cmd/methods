import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] goOne = {21, 22, 29, 24, 25, 26, 27};
        int[] goTwo = {21, 22, 29, 24, 25, 26, 27};
        for (int i = 0; i < goTwo.length; i++) {
            //System.out.println(goTwo[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = goOne.length == goTwo.length;
        if (arraysAreEqual) {
            for (int i = 0; i < goOne.length; i++) {
                if (goOne[i] != goTwo[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("одинаковые");
        } else {
            System.out.println("разные");
        }
        int maxGoOne = -1;
        for (final int current : goOne) {
            if (current > maxGoOne) {
                maxGoOne = current;

            }
        }
        System.out.println(maxGoOne);
        for (int i = 0; i < goOne.length - 1 && goOne[i + 1] != 0; i++) {
            System.out.println(goOne[i + 1] - goOne[i]);

        }
        // Задание 1
        System.out.println("Задание 1");
        int[] inputArray1 = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int namba : inputArray1) {
            sum += namba;
            if (namba > max) {
                max = namba;
            }
            if (namba < min) {
                min = namba;
            }
        }
        System.out.println(Arrays.toString(inputArray1));
        float average =(float) sum / inputArray1.length;
        //System.out.println(sum);
        //System.out.println(max);
        //System.out.println(min);
        //System.out.println(average);
        float[] outputArray1 = {sum,max,min,average};
        System.out.println(Arrays.toString(outputArray1));

        //Задание 2
        System.out.println("Задание 2");
        float[]inputArray2 = {10,20,30,40,50};
        float[] outputArray2 = new float[inputArray2.length];
        int index = 0;
        for (float value : inputArray2) {
            float tax = value * 0.13f;
            outputArray2[index] = tax;
            index++;
        }
            System.out.println(Arrays.toString(inputArray2));
        for (float tax : outputArray2) {
        }
        System.out.println(Arrays.toString(outputArray2));

        // Задание 3
        System.out.println("Задание 3");
        int[] inputArray3 ={100,20000,30000,40000,50000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int indexBoolean = 0;
        for (int bonus : inputArray3) {
            outputArray3[indexBoolean] = (bonus > 5000); // Записываем true/false
            indexBoolean++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //Задание 4
        System.out.println("Задание 4");
        int[] inputArray4 = {10_000, -4, 30_000, 40_000, 50_000};
        boolean[] outputArray4 = new boolean[inputArray4.length];
        boolean hasNoOverdue = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                hasNoOverdue = false;
                break;
            }
        }
        for (int i = 0; i < inputArray4.length; i++) {
            outputArray4[i] = (inputArray4[i] > 0);
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(hasNoOverdue);
        //System.out.println(Arrays.toString(outputArray4));

        // Задание 5
        System.out.println("Задание 5");
        int[] inputArray5 = {100, -700, 900, 3000, -300};
        int outputArray5 = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }
        for (int profit : inputArray5) {
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(outputArray5);

    }

}
