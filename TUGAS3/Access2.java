package TUGAS3;

public class Access2 {
    public void printAccess(){
        Access acs = new Access();
        System.out.println("\nClass Lain");
        // System.out.println(acs.privat);
        System.out.println(acs.defaul);
        System.out.println(acs.protecte);
        System.out.println(acs.pub);

        System.out.println("Access Modifier Private tidak dapat diakses");
    }
}
