public class Sample4_13 {
    public static void main(String[] args) {
        LastCar car = new LastCar(12345, 10.5);
        car.vShow();
        car.mShow();
    }    
}

interface inVehicle{
    void vShow();
}

interface iMaterial{
    void mShow();
}

class LastCar implements inVehicle, iMaterial{
    private int num;
    private double gas;

    public LastCar(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("LastCar object created with number " + num + " and gas " + gas);
    }

    public void vShow() {
        System.out.println("LastCar number: " + num);
        System.out.println("LastCar gas: " + gas);
    }

    public void mShow() {
        System.out.println("LastCar material is iron.");
    }
}
