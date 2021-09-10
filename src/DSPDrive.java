interface IAutomobile {
    void Ignition();
    void Stop();
}

class Jeep implements IAutomobile {

    public void Ignition() {
        System.out.println("Jeep start");
    }

    public void Stop() {
        System.out.println("Jeep stopped.");
    }

}

class SUV implements IAutomobile{
    public void Ignition() {
        System.out.println("SUV start");
    }

    public void Stop() {
        System.out.println("SUV stopped.");
    }
}

class AutomobileController {
    private  IAutomobile m_Automobile;

    public AutomobileController(IAutomobile automobile) {
        this.m_Automobile = automobile;
    }

    public void Ignition() {
        m_Automobile.Ignition();
    }

    public void Stop() {
        m_Automobile.Stop();
    }
}




public class DSPDrive{

    public static void main(String []args){
        IAutomobile automobile = new Jeep();
        IAutomobile automobile1 = new SUV();
        AutomobileController automobileController = new AutomobileController(automobile);
        automobile.Ignition();
        automobile.Stop();
        automobile1.Ignition();
        automobile1.Stop();
    }

}