package _array_pratice;

public class OnlyZeroOneCheck {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 0};

        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 || array[i] != 1) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("YES only 0 and 1");

        else
            System.out.println("NO other number found");

    }
}
