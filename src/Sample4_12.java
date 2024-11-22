public class Sample4_12 {
    public static void main(String[] args) {
        iVehicle[] vehicles = new iVehicle[2];
        
        vehicles[0] = new TheCar(1234, 20.5);
        vehicles[1] = new ThePlane(232);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].show();
        }
    }       
}

interface iVehicle{
    int weight = 1000;
    void show();
}

class TheCar implements iVehicle{
    private int num;
    private double gas;

    public TheCar(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("TheCar object created with number " + num + " and gas " + gas);
    }

    public void show() {
        System.out.println("TheCar number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class ThePlane implements iVehicle{
    private int flight;

    public ThePlane(int flight) {
        this.flight = flight;
        System.out.println("ThePlane object created with flight number " + flight);
    }

    public void show() {
        System.out.println("Flight number: " + flight);
    }
}
