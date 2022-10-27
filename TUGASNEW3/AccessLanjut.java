package TUGASNEW3;

import TUGAS3.Access;

public class AccessLanjut extends Access{
    public void printAccess(){
        System.out.println("\nPacage Berbeda");
        // System.out.println(privat);
        // System.out.println(defaul);
        System.out.println(protecte);
        System.out.println(pub);

        System.out.println("Access Modifier Private & Default tidak dapat diakses");
    }
}
