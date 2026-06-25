import java.util.Scanner;

class vehicle{
    public String name;
    public String model;
    public int NoOfTyres;

    public vehicle(){
        this.name = "";
        this.model = "";
        this.NoOfTyres = 0;
    }

    vehicle(String name, String model, int NoOfTyres){
        this.name = name;
        this.model = model;
        this.NoOfTyres = NoOfTyres;
    }

    void startengine(){
        System.out.printf("Engine is Starting of %s : %s", name, model);
        System.out.println("");
    }

    void stopengine(){
        System.out.printf("Engine is Stopping of %s : %s", name, model);
        System.out.println("");
    }
}    

    class car extends vehicle{
    public int NoOfDoors;
    public String transmissionType;

    car(String name, String model, int NoOfTyres, int NoOfDoors, String transmissionType){
        super(name, model, NoOfTyres);
        this.NoOfDoors = NoOfDoors;
        this.transmissionType = transmissionType;
    }

    public void Acstart(){
        System.out.printf("AC is Starting of %s : %s", name, model);
        System.out.println("");
    }
}
    
class bike extends vehicle{
    public int handalBarStyle;
    public String sunspesiontype;

    bike(String name, String model, int NoOfTyres, int handalBarStyle, String sunspesiontype){
        super(name, model, NoOfTyres);
        this.handalBarStyle = handalBarStyle;
        this.sunspesiontype = sunspesiontype;
        // super.startengine();
    }

    public void kickstart(){
        System.out.printf("Kickstart is Starting of %s : %s", name, model);
        System.out.println("");
    }
}
public class inheritance_vehicle {
    public static void main(String[] args) {
        car c = new car("BMW", "X5", 4, 5, "Automatic");
        bike b = new bike("Yamaha", "R15", 2, 1, "Telescopic");

        c.startengine();
        c.Acstart();
        c.stopengine();

        System.out.println("");

        b.startengine();
        b.kickstart();
        b.stopengine();
    }
}
