package Обучалка;

public class Numbers {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,22,11,13,51,23,15};
        pON(arr);


    }

    public static void pON(int[] arr) {

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 0)
                System.out.print(arr[x] + ", ");
            }
        }
    }
