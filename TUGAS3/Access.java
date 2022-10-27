package TUGAS3;

public class Access {
    private String privat = "Ini variable private";
    String defaul = "Ini variable default";
    protected String protecte = "ini variable protected";
    public String pub = "ini variable public"; 
    
    public void printAccess(){
        System.out.println("\nClass Sendiri");
        System.out.println(privat);
        System.out.println(defaul);
        System.out.println(protecte);
        System.out.println(pub);

        System.out.println("Semua Access Modifier dapat diakses");
    }
}
