import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {

        // Artık yıl bulma

        int yil;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yili giriniz : ");
        yil = inp.nextInt();

        if ((yil % 4) == 0) {
            if ((yil % 100) == 0 && (yil % 400) != 0){
            System.out.print(yil + " yili artik yil degildir!");
            } else
                System.out.print(yil + " yili artik yildir.");
        } else
            System.out.print(yil + " yili artik yil degildir!");
    }
}