public class Sample4_1 {
    public static void main(String[] args) throws Exception {
        RacingCar car;
        car = new RacingCar();

        car.setCar(1234, 20.5);
        
        car.setCourse(5);
    }
}

class Car{
    private int num;
    private double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("Car object created.");
    }

    public void setCar(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Car object set with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Car number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class RacingCar extends Car{
    private int course;

    public RacingCar(){
        course = 0;
        System.out.println("RacingCar object created.");
    }

    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingCar object set with course " + course);
    }
}
