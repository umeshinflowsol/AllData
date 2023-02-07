package iheritance;

public class Andrioddevices {
    String brand;
    int ram;
    float displaySize;
    public void ProvidesServices(){
        System.out.println("provides services to user");

    }
}
class Realme extends Andrioddevices{

    public void SmartphoneType(){
        System.out.println("SmartphoneType:Realme");
    }
}
class RedMi extends  Andrioddevices{
    public void Ram(){
        System.out.println("Ram:2gb");
    }
}