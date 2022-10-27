package TUGASNEW3;

import TUGAS3.Access;

public class AccessPub extends Access{
    public void printAccess(){
        Access acs = new Access();
        System.out.println("\nPacage Lain Class Lain");
        // System.out.println(acs.privat);
        // System.out.println(acs.defaul);
        // System.out.println(acs.protecte);
        System.out.println(acs.pub);

        System.out.println("Access Modifier Public saja yang dapat diakses");
    }
}
