package Обучалка;

public class Monitors {
    public static void main(String[] args) {
        Monitors x = new Monitors();
        x.drawisMonitorsCounter(100,55);
    }
    public int drawisMonitorsCounter(int monitors,int programmers){
        int ostatok = monitors - programmers;
        System.out.println("Лишние мониторы - " + ostatok);
        return ostatok;
    }
}
