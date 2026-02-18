package Question_Level03;
//2. Smart Thermostat:
//Create a Thermostat class with a private field temperature (in Celsius).
//
//Create a setter for temperature. If the user tries to set the temperature below 16°C, automatically set it to 16°C. If they try to set it above 30°C, cap it at 30°C.
//
//Create a getter getFahrenheitTemperature() that logically converts the hidden Celsius value to Fahrenheit and returns it.
public class Encapsulation_ThermoState {
    private int temperature;

    public void SetTemperature(double celcius){
        if(celcius < 16){
            temperature = 16;
            System.out.println("Minfixed" + temperature);
        } else if (celcius > 30) {
            temperature = 30;
            System.out.println("Maxfixed" + temperature);
        }else{
            System.out.println("it is in range");
        }
    }
    public double getFahrenheitTemperature(){
         return (temperature * 9.0 / 5.0) + 32;

    }

    public static void main(String[] args) {
        Encapsulation_ThermoState degree = new Encapsulation_ThermoState();
        degree.SetTemperature(21);
        System.out.println(degree.getFahrenheitTemperature());
    }
}
