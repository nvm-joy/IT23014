public class Ch1Ex10 {
    public static void main(String[] args) {
         
        // converting the total speed into speed of 1 minute in Kms
        double speed_per_min = 14/45.5 ;
        // multipying by 60 to make speed per hour and dividing by 1.6 to convert it into miles
        double avg_speed = (speed_per_min*60)/1.6;

        System.out.printf("Average speed in miles per hour is : %.2f " , avg_speed);
    }
    
}

