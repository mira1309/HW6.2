public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSum = 99000;
        int minSum = 201000;
        for (int i = 0; i < 30; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        for (final int current : arr) {
            if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double averageSum = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

