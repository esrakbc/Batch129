package practise_nighttime;

public class HacimRunner {
    public static void main(String[] args) {
        //kup kare prizma ve dikdörtgen prizmanın
        //hacmnş hesaplayan method oluştur
        Hacım hacim= new Hacım();
        int kup= hacim.hacimHesapla(5,4);
        int karePrizma=hacim.hacimHesapla(5,6);
        int dikdörtgenPrizma=hacim.hacimHesapla(5,6,7);

        System.out.println("kup = "+kup);
        System.out.println("karePrizma = "+karePrizma);
        System.out.println("dikdörtgenPrizma = "+dikdörtgenPrizma);
    }
}
