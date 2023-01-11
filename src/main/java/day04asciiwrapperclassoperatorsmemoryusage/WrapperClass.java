package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
        int n = 12;
        Integer m = 12;
        byte p = 23;
        Byte r = 43;

        short maxShort =  Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);
        int intMin  = Integer.MIN_VALUE;
        System.out.println(intMin);
       byte byteMax =  Byte.MAX_VALUE;
        System.out.println(byteMax);

        int num = 22;

        Integer wrapperNum = num;
        System.out.println(wrapperNum);
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);
        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);
        Boolean isOld = true;
                boolean isOldPrimitive=isOld;
        System.out.println(isOldPrimitive);
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+ shoes);
       int toplamFiyat =  Integer.valueOf(shirt)+ Integer.valueOf(shoes);
        System.out.println(toplamFiyat);
        String tv = "$11000";
        String radio = "$3000";
        System.out.println(tv + radio);
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);








    }
}
