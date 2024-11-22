public class Sample4_5 {
    public static void main(String[] args) {
        Sedan sedan = new RacingSedan();
    
        sedan.setSedan(1234, 20.5);

        sedan.show();
    }
}

class Sedan{
    protected int num;
    protected double gas;

    public Sedan(){
        num = 0;
        gas = 0.0;
        System.out.println("Sedan object created.");
    }

    public void setSedan(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Sedan object set with number " + num + " and gas " + gas);
    }

    public void show(){
        System.out.println("Sedan number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class RacingSedan extends Sedan{
    private int course;
    
    public RacingSedan(){
        course = 0;
        System.out.println("RacingSedan object created.");
    }
    
    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingSedan object set with course " + course);
    }

    public void show(){
        System.out.println("RacingSedan number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Course: " + course);
    }
}
