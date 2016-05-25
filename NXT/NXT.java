import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;

public class NXT
{
    DifferentialPilot pilot;
    UltrasonicSensor distance;
    public NXT(){
        pilot = new DifferentialPilot(5.6,12,Motor.B,Motor.C);
        distance = new UltrasonicSensor(SensorPort.S3);
    }
    
    public void getOutOfBox(){
        while(distance.getDistance()<100){
            pilot.rotate(30);
        }
        pilot.rotate(20);
        pilot.travel(54);
    }
    
    public void travelAroundCircle()
    {
        pilot.rotate(90);
        pilot.steer(22, 360, false);
    }
    
    public static void main(String[] args){
        NXT traveler = new NXT();
        traveler.getOutOfBox();
        traveler.travelAroundCircle();
    }
}