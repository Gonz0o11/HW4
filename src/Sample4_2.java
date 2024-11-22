public class Sample4_2 {
    public static void main(String[] args) throws Exception {
        RacingMotoCycle moto = new RacingMotoCycle(1234, 20.5, 5);
    }
}

class MotoCycle{
    private int num;
    private double gas;

    public MotoCycle(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("MotoCycle object created.");
    }

    public MotoCycle(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("MotoCycle object set with number " + num + " and gas " + gas);
    }

    public void setCar(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("MotoCycle object updated with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Car Number: " + num);
        System.out.println("Gas Level: " + gas);
    }
}

class RacingMotoCycle extends MotoCycle{
    private int course;

    public RacingMotoCycle(){
        this.course = 0;
        System.out.println("RacingMotoCycle object created.");
    }

    public RacingMotoCycle(int num, double gas, int course){
        super(num, gas);
        this.course = course;
        System.out.println("RacingMotoCycle object set with course " + course);
    }

    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingMotoCycle course updated to " + course);
    }
}
