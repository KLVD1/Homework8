import java.util.Arrays;

public class Main {
    static void main(){

        System.out.println("\n\tЗадание#1\n");

    int[] weight =new int [3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
    double [] box ={ 1.57, 7.654, 9.986};
    int[] numbers ={-15,0,4};

        System.out.println("\n\tЗадание#2\n");

        // Вывод первого массива
        for (int i = 0; i < weight.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(weight[i]);
        }
        System.out.println(); // Для переноса строки

              // Вывод второго массива
        for (int i = 0; i < box.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(box[i]);
        }
        System.out.println(); // Для переноса строки
             // Вывод третьего массива
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }

        System.out.println("\n\tЗадание#3\n");

// Вывод первого массива
        for (int i = weight.length-1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Для переноса строки

// Вывод второго массива
        for (int i = box.length-1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Для переноса строки

// Вывод третьего массива
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\tЗадание#4\n");
        for (int i=0; i<weight.length; i++){
            if(weight[i] % 2 !=0){
                weight[i]+=1;
            }
        }
        for (int i =0; i<weight.length; i++) {
            System.out.print(weight[i]);
            if (i <weight.length-1) {
                System.out.print(", ");
            }
        }









    }
}