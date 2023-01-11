package practise_nighttime;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba =new Butce();
        System.out.println("Maas öncesi butce :"+Butce.butce);
        baba.maasAl(3000);
        System.out.println("Maas sonrası buce: "+Butce.butce);
        baba.harclıkAl(100);
        baba.harclıkHarca(20);
        baba.ButcedenHarca(500);
        System.out.println(baba.harclık);
        System.out.println(Butce.butce);

        Butce anne =new Butce();
        anne.maasAl(5000);
        anne.harclıkAl(500);
        anne.harclıkHarca(450);
        System.out.println(Butce.butce);
        System.out.println(anne.harclık);

        Butce oglan =new Butce();
        oglan.harclıkAl(100);
        oglan.harclıkHarca(30);
        System.out.println(Butce.butce);
        System.out.println(oglan.harclık);
    }
}
