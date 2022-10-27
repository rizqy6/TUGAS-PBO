package TUGAS3;

import TUGASNEW3.AccessLanjut;
import TUGASNEW3.AccessPub;

public class Main {
    public static void main (String[] args){
        Access a = new Access();
        a.printAccess();
        System.out.println("--------------------------------");
        Access2 b = new Access2();
        b.printAccess();
        System.out.println("--------------------------------");
        AccessLanjut c = new AccessLanjut();
        c.printAccess();
        System.out.println("--------------------------------");
        AccessPub d = new AccessPub();
        d.printAccess();
    }
}
