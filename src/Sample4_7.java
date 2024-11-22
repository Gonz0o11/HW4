public class Sample4_7 {
    public static void main(String[] args) {
        SUV car = new SUV();

        car.setCar(1234, 20.5);
        System.out.println(car);
    }   
}

class SUV{
    protected int num;
    protected double gas;

    public SUV(){
        this.num = 0;
        this.gas = 0.0;
        System.out.println("SUV object created.");
    }

    public void setCar(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("SUV object set with number " + num + " and gas " + gas);
    }

    public String toString(){
        String str = "SUV number:" + num + " Gas level:" + gas;
        return str;
    }
}
