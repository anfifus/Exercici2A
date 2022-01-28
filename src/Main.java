import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int[] numbers = writeNumbers();//Write the numbers
        changeOrder(numbers);
    }

    private static void changeOrder(int[] numbers) {
        int[] numbersINV = new int[numbers.length];
        for (int cont = 0,contINV = 1; cont < numbers.length; cont++,contINV++)
        {
            numbersINV[cont] = numbers[numbers.length - contINV];
        }
        System.out.println("This is the invers order");
        for (int num:numbersINV) {
            System.out.println(num);
        }

    }

    private static int[] writeNumbers() {
        System.out.println("Write the max numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[scan.nextInt()];
        System.out.println("Write the"+numbers.length+"numbers");
        for (int cont = 0; cont < numbers.length;cont++)
        {
            numbers[cont] = scan.nextInt();
        }
        return numbers;
    }
}
