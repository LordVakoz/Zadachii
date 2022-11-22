package Обучалка;

public class CatDogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.catсhCat();
        dog.sayHello();
        cat.sayHello();
    }
    public static class Dog {
        public void sayHello(){
            System.out.println("Woof");
        }
        public void catсhCat(){
            System.out.println("Кошка поймана");
        }
    }
    public static class Cat {
        public void sayHello(){
            System.out.println("Meow");
        }
    }
}
