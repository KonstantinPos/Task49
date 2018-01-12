public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int max = 0;
        int maxindex = 0;
        int[][] arr = new int[7][4];

        for (int i = 0; i < arr.length; i++) {
            a++;
            System.out.print("Строка под номером " + a + " равна");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10) - 5;
                System.out.print(" " + arr[i][j] + " ");
                b = b * Math.abs(arr[i][j]);
            }
            System.out.println(" " + b);
            if (max < b) {
                max = b;
                maxindex = a;

            }
            b = 1;
        }
        System.out.println(max);
        System.out.println("строка под номером " + maxindex + " обладает наибольшим по модулю произведением элементов");


    }
}
