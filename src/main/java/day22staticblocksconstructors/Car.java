package day22staticblocksconstructors;
/*
        Constructor nedir?
        Class'dan obje üretmemize yarayan code block'larıdır.
        Class oluşturduğumuzda Java bize otomatik olarak bir constructor verir.
        Ama bu constructor gozle gorülmez,gozle görülmeyen otomatik olarak Java tarafından verilen bu constructor'lara
        "default constructor" denir.
        "default constructor"lar "Car(){}"şeklindedir.
        Siz kendi constructor'unuzu oluşturduğunuzda Java default constructor'u siler.
        Bir Class da farklı parametreler kullanarak istediğiniz kadar constructor oluşturabilirsiniz
        Farklı constructor'lar sayesinde bir class dan farklı farklı object'ler oluşturabiliriz.
        Interview sorusu=Method ile Constructor'ın farkı var mıdır varsa nedir?
        Cevap:Method ile Constructor farklı yapılardır.
              i) Method'larda "return type" vardır ama "constructor"larda "return type"yoktur.
              İi) Method'ların ismi yaptıkları ise göre developer'lar tarafından belirlenir
                   Constructor'lar ismi ise her zaman Class ismi ile aynı olmalıdır.
         */

public class Car {
    String make ="Honda";
    String model= "Accord";
    int year =2023;
    boolean hybrid = true;

   Car(String make, String model, int year, boolean hybrid){
       this.make=make;
       this.model=model;
       this.year=year;
       this.hybrid=hybrid;
   }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
