import java.util.Scanner;


public class challenge2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int k = 0;

        while(sc.hasNextInt()) {
            array[k] = sc.nextInt();
            k++;
        }

        int[] rez = new int[k];
        int produkt;

        for(int i=0; i<rez.length; i++) {
            produkt = 0;
            for(int j=0; j<rez.length; j++) {
                if(i != j) {
                    if(produkt == 0) {
                        produkt += array[j];
                    }
                    else {
                        produkt *= array[j];
                    }
                }
            }
            rez[i] = produkt;
        }

        System.out.println("---------");

        for( int i=0; i<rez.length; i++) {
            System.out.println(rez[i]);
        }
    }

}