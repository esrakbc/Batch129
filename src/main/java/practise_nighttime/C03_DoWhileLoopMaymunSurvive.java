package practise_nighttime;

public class C03_DoWhileLoopMaymunSurvive {
    public static void main(String[] args) {
        /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        O adada sadece 165 muz var
        Maymunun kaç gün hayatta kalabileceğini hesaplayan kodu yazınız.
         */
        int numberofbananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive= true;
        do {
            System.out.println("***maymunlar yasamak için günde 4 muz yer***");
            numberofbananas-=4;
            System.out.println("kalan muz sayısı"+numberofbananas);
            survivalDays++;
            if (numberofbananas<4) {
                monkeyAlive = false;
                System.out.println("bugün  " + survivalDays + "  .gün yeterli muz kalmadı .Maymun ölür");
                System.out.println("Maymun " + survivalDays + " .gün oldu");
            }else
                System.out.println("bugün "+survivalDays +" .maymun yasıyor");


        }while (monkeyAlive);

    }
    }

