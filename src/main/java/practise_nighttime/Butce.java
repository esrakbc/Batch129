package practise_nighttime;

public class Butce {
    //tum aile uyelerinin birikiminin bulunduğu ortak ihtiyaclar için
    //kullanıldığı bir butce ile kişisel harcamaların yapıldıgı harclık
    //ların olduğu basit bir ev butcesi kodu yazınız.
    //ev butcesi herkesi etkiler o yüzden static variable oluştrlr
    //harclık instance object olacak ,kişiyi etkilyor

    public static int butce ;
    public int harclık ;


    public void harclıkAl(int alınanHarclık){
        butce -=alınanHarclık;// ortak hesaptan harcanıyor
        harclık+=alınanHarclık;
    }
    public void ButcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
    }
    public void harclıkHarca(int harclıkHarcaması){
        harclık -=harclıkHarcaması;
    }
    public void maasAl(int alınanMaaş){
        butce+=alınanMaaş;
    }



}
