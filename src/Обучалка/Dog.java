package Обучалка;

public class Dog{
    int size;
    String name;

    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog();
        Dog three = new Dog();

        one.size = 70;
        one.name = "Scooby";
        two.size = 50;
        two.name = "Bobby";
        three.size = 20;
        three.name = "Bulka";

        one.bark(3);
        two.bark(2);
        three.bark(1);
    }
    void bark(int NmOfBarks){
        if (size>60){
            System.out.println(name + " " + "Gav Gav");
        }else if(size<60 && size>20){
            System.out.println(name + " " + "Woof Woof");
        }else{
            System.out.println(name + " " + "Tyaf Tyaf");
        }
    }
}
