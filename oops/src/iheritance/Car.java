package iheritance;

public class Car {

    public void vachicleType(){
        System.out.println("vachicleType:Car");
    }
}
class Tata extends Car{
    public  void Brand(){
        System.out.println("car Barnd:Tata");
    }

}
class TataNexon extends Tata{

    public void extrafeatures(){
        System.out.println("it has some extra features");
    }
}