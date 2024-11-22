public class Sample4_3 {
    public static void main(String[] args) {
        RacingVehicle vehicle = new RacingVehicle();
        vehicle.newShow();
    }    
}

class Vehicle{
    protected int num;
    protected double gas;

    public Vehicle(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("Vehicle object created.");
    }

    public void setVehicle(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Vehicle object set with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Vehicle number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class RacingVehicle extends Vehicle{
    private int course;

    public RacingVehicle(){
        course = 0;
        System.out.println("RacingVehicle object created.");
    }

    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingVehicle object set with course " + course);
    }

    public void newShow(){
        System.out.println("Vehicle number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Course: " + course);
    }
}
