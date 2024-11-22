public class Sample4_11 {
    public static void main(String[] args) {
        Transport[] transports = new Transport[2];
        
        transports[0] = new AnotherCar(1234, 20.5);
        transports[1] = new Plane(2320);

        for (int i = 0; i < transports.length; i++) {
            if(transports[i] instanceof AnotherCar)
                System.out.println("The object " + (i+1) + " is an instance of AnotherCar.");
            else
                System.out.println("The object " + (i+1) + " is not an instance of AnotherCar.");  
        }
    }
}

abstract class Transport{
    protected int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed set to: " + speed);
    }

    abstract void show();
}

class AnotherCar extends Transport{
    private int num;
    private double gas;

    public AnotherCar(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("AnotherCar object created with number " + num + " and gas " + gas);
    }

    public void show() {
        System.out.println("AnotherCar number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Speed: " + speed);
    }
}

class Plane extends Transport{
    private int flight;

    public Plane(int flight) {
        this.flight = flight;
        System.out.println("Plane object created with flight number " + flight);
    }

    public void show() {
        System.out.println("Flight number: " + flight);
        System.out.println("Speed: " + speed);
    }
}
