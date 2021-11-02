package ex31;

public class TargetHeartRate {
    private double age;
    private double restingHr;
    private double intensity;



    public void Heartrate( double age, double restingHr,double intensity)
    {
        this.age=age;
        this.restingHr=restingHr;
        this.intensity=intensity;
    }

    public static double RateCalculator(double age, double restingHR) {
        // find THR

        double THR = 0;
        System.out.println("Intensity |\tRate");
        System.out.println("----------|---------");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
             THR= (((220-age)-restingHR)*intensity/100)+restingHR;
           System.out.println(intensity+"%\t\t  | "+Math.round(THR)+" bpm");
        }

        return Math.round(THR);
    }


}
