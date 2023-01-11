package day23datetimestringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        Java'da String ,"String Class "kullanılarak veya "StringBuilder Class"kullanılarak oluşturabilir.
        "String Class"kullanarak ürettiğiniz String'ler "Immutable"(değiştirilemez)dır.
        "StringBuilder Class"kullanarak ürettiğiniz String'ler "Mutable"(değiştirilebilir)dir.
         */
        //Immutable
        String s="Java";
        String t=s+"!";
        String W=t+"?";

        //String'i değiştirdikten sonra aynı String assign ederseniz,Java yine yeni bir container oluşturur,
        //değişmiş değeri bu yeni container'ın içine koyar ve eski container'ı gösteren oku yeni container'a yönlendiri
        //dolayısıyla eski container adressiz kalır,ve "Garbage Collector" adressiz olan container'leri siler.
        String a="Money";
        a=a +"More";

     //Mutale
        //StringBuilder kullanarak String üretmenin 1.yolu:
     StringBuilder sb1 =new StringBuilder("Python");
        System.out.println(sb1);
     sb1.append("!").append("?").append(".");
        System.out.println(sb1);

        //StringBuilder kullanrak String üretmenin 2.yolu:
        StringBuilder sb2= new StringBuilder();
        System.out.println(sb2.length());
        //StringBuilder kullandığınızda başlangıc kapasitesi 16 dır.
        //Kapasite aşıldığında varolan kapaite nin iki fazlası kadsr varolan kapasiteye ekleme yapılır
        //16= ==> 16*2+2  34==>34*2+2
        System.out.println(sb2.capacity());

        sb2.append("Java");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//4=16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity()); //34*2+2=70

        //StringBuilder kullanarak String üretmenin 3.yolu;
        StringBuilder sb3= new StringBuilder(20);

        sb3.append("Florida");
        System.out.println(sb3.length());//7
        System.out.println(sb3.capacity());//7

        sb3.insert(2,"XXXXX");
        System.out.println(sb3);
        System.out.println(sb3.length());

        //toString() metodu StringBuilder'ı String e çevirir
        //String Class var olan ama StringBuilder Class var olmayan split() method gibi
        //method'lara ihtiyac duyduğumuzda toString() methodu nu kullanarak String CLass geçer ve o method'ları kullanırız
        sb3.toString().split("l");

        //String i tekrar StringBuilder ' a çevirebilirsiniz.
        StringBuilder sb4 = new StringBuilder(sb3);


        // reverse() metodu String leri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);
        //deleteCharAt(1)  index 1 deki karakteri siler
        sb3.deleteCharAt(1);
        System.out.println(sb3);

        //delete(1,6) index 1deki index 5 deki karakterleri siler(6 dahil değil)
        sb3.delete(1,6);
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6= new StringBuilder("java");
        //sb5.compareTo(sb6) methodu sb5 ile sb6 yi alfabetik olarak karşılaştırır
        //sb5 alfabetik sıralamad önce ise sonuç negative ,sonra ise pozitif olur
        System.out.println(sb5.compareTo(sb6));

        sb6.setCharAt(2,'m');
        System.out.println(sb6);

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);

        //StringBuilder Class da kullanmamıza izin verilen substring() method gibi bazı String Class method ları vardır
        //bu method ları StringBuilder üstunde kullanınca StringBuilder ın orijinal değeridir.
        sb6.substring(1,3);
        System.out.println(sb6);



    }
}
