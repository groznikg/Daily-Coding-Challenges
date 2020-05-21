import java.util.ArrayList;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num= new ArrayList<Integer>();
        while(sc.hasNextInt()) {
            num.add(sc.nextInt());
        }
        int k = num.get(0);
        num.remove(0);
        boolean rez = fun(num, k);
        if(rez) System.out.println("Juhuhu");
        else System.out.println(":(");
        sc.close();
    }

    private static boolean fun(ArrayList<Integer> num, int k) {
        int i1 = 0;
        int i2 = num.size()-1;
        int vsota;
        while(true) {
            if(i1>=i2) return false;
            vsota = num.get(i1) + num.get(i2);
            if(vsota == k) return true;
            else if(vsota < k){
                i1++;
                continue;
            }
            else i2++;
        }
    }
}