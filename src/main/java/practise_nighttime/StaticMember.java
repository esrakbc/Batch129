package practise_nighttime;

public class StaticMember {
    //ekran çıktısı nedir?
    static int x;
    int y;
    StaticMember(){
        x+=10;
        y++;
    }
    public static int karesiniAl(){
        return x*x;
    }
    public static void main(String[] args) {
    StaticMember sm1= new StaticMember();
        StaticMember sm2= new StaticMember();
        int z =sm1.karesiniAl();
        System.out.println("-x " +z+ " -y"+sm2.y);

    }

}
