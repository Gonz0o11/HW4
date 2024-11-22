public class Sample4_6 {
    public static void main(String[] args) {
        Coupe car[] = new Coupe[2];

        car[0] = new Coupe();
        car[0].setCar(1234, 20.5);

        car[1] = new RacingCoupe();
        car[1].setCar(4567, 30.5);

        for (int i = 0; i < car.length; i++) {
            car[i].show();
        }
    }    
}

class Coupe{
    protected int num;
    protected double gas;

    public Coupe(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("Coupe object created.");
    }

    public void setCar(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("Coupe object set with number " + num + " and gas " + gas);
    }
    
    public void show(){
        System.out.println("Coupe number: " + num);
        System.out.println("Gas level: " + gas);
    }
}

class RacingCoupe extends Coupe{
    private int course;

    public RacingCoupe(){
        this.course = 0;
        System.out.println("RacingCoupe object created.");
    }

    public void setCourse(int course){
        this.course = course;
        System.out.println("RacingCoupe object set with course " + course);
    }

    public void show(){
        System.out.println("RacingCoupe number: " + num);
        System.out.println("Gas level: " + gas);
        System.out.println("Course: " + course);
    }
}
