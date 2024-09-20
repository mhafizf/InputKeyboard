import java.util.Scanner;

public class InputKeyboard01 {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        String nama;

        // input -- begin
        System.out.println("Tulis nama:");
        /*
         contoh method dari objek input keyboard 
         netxline() untuk membaca inputan dari keyboard tipe data string
         */

        nama = inputKeyboard.nextLine();
        // input -- end

        // output
        System.out.println("Nama adalah " + nama );




    }
}
