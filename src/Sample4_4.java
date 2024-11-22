public class Sample4_4 {
    public static void main(String[] args) {
        RacingAutomobile auto = new RacingAutomobile();

        auto.setAutomobile(1234, 20.5);
        auto.setCourse(5);

        auto.show();
    }    
}

class Automobile{
    protected int num;
    protected double gas;

    public Automobile(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("Automobile object created.");
    }

    public void setAutomobile(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Automobile object set with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Automobile number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class RacingAutomobile extends Automobile{
    private int course;

    public RacingAutomobile(){
        course = 0;
        System.out.println("RacingAutomobile object created.");
    }

    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingAutomobile object set with course " + course);
    }

    public void show(){
        System.out.println("Automobile number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Course: " + course);
    }  
}