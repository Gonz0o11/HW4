public class Sample4_8 {
    public static void main(String[] args) {
        Taxi car1 = new Taxi();
        Taxi car2 = new Taxi();
        Taxi car3;
        car3 = car1;

        System.out.println("car1 is same as car2: " + car1.equals(car2));
        System.out.println("car1 is same as car3: " + car1.equals(car3));
    }    
}

class Taxi{
    protected int num;
    protected double gas;

    public Taxi(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("Taxi object created.");
    }
}
