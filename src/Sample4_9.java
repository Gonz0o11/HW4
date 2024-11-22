public class Sample4_9 {
    public static void main(String[] args) {
        Bus[] buses = new Bus[2];

        buses[0] = new Bus();
        buses[1] = new ElectricBus();

        for (int i = 0; i < buses.length; i++) {
            Class cl = buses[i].getClass();
            System.out.println("The class of object " + (i+1) + " is: " + cl);
        }
    }    
}

class Bus{
    protected int num;
    protected double gas;

    public Bus(){
        num = 0;
        gas = 0.0;
        System.out.println("Bus object created.");
    }
}

class ElectricBus extends Bus{
    public ElectricBus(){
        System.out.println("ElectricBus object created.");
    }
}
