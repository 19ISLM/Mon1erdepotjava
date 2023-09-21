public class Demo { 
    public static void main(String[] args) {
    //    System.out.println(" salut tout le monde");
    Test t1=new Test();
    int resultat = t1.add(5, 20);
    System.out.println("reslutat:"+resultat);

     Test t2=new Test();
    int resultat1 = t2.soustraction(5, 20);
    System.out.println("reslutat1:"+resultat1);

     Test t3=new Test();
    int resultat3 = t3.multiplication(5, 20);
    System.out.println("reslutat3:"+resultat3);
    }
}
