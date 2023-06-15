package Seminar1;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
public class Task1 {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 2, 9, 4, 1};
        {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("МАКСИМУМ: " + max);
            {
                int min = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.println("МИНИМУМ: " + min);
            }
        }
    }
}