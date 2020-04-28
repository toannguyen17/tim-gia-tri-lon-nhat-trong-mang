package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        do{
            size = scanner.nextInt();
            if(size < 1 && size > 20){
                System.out.print("Độ dài mảng từ 1 đến 20: ");
            }
        } while(size < 1 && size > 20);

        int[] arrays = new int[size];
        for(int i = 0; i < size; i++){
            arrays[i] = scanner.nextInt();
        }

        int max   = arrays[0];
        int index = 1;
        
        // print
        System.out.print("Property list: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\t");
            if(max < arrays[i]){
                max   = arrays[i];
                index = i+1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " , at position " + index);
    }
}
