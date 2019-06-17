public class Alarm {
    public static void main(String[] args) {
boolean employed = true;
boolean vacation = false;
        setAlarm(employed,vacation);

        employed = false;
       vacation = false;
        setAlarm(employed,vacation);
    }

    public static void setAlarm(boolean employed, boolean vacation) {
        boolean setAlarm;
        if (employed == true && vacation == false) {
            setAlarm = true;
        } else {
            setAlarm = false;
        }
        System.out.println(setAlarm);
    }
}
