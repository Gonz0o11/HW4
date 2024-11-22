public class Sample4_10 {
    public static void main(String[] args) {
        Carrier[] carriers = new Carrier[2];

        carriers[0] = new Bike(1234, 20);
        carriers[0].setSpeed(60);

        carriers[1] = new Airplane(232);
        carriers[1].setSpeed(500);

        for (int i = 0; i < carriers.length; i++) {
            carriers[i].show();
        }
    }    
}

abstract class Carrier{
    protected int speed;
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("Carrier speed set to " + speed);
    }   
    
    abstract void show();
}

class Bike extends Carrier{
    private int num;
    private int gas;
    
    public Bike(int num, int gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Bike object set with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Bike number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Speed: " + speed);
    }
}

class Airplane extends Carrier{
    private int flight;

    public Airplane(int flight){
        this.flight = flight;
        System.out.println("Airplane object set with flight number " + flight);
    }

    public void show(){
        System.out.println("Flight number: " + flight);
        System.out.println("Speed: " + speed);
    }
}
