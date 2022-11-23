package Обучалка;

import java.net.SocketTimeoutException;

public class HumanMain {
    public static void main(String[] args) {
        Human Petya = new Human();
        Human Bodya = new Human(28,"Bodyan","Semak","Sex");
        Human Vasya = new Human(20,"Vasya","Pupkin");
        System.out.println("Human one: ");
        System.out.println("Имя - "+ Bodya.name);
        System.out.println("Фамилия - "+ Bodya.secondName);
        System.out.println("Возраст - "+ Bodya.age);
        System.out.println("Любимвый вид спорта - "+ Bodya.favSport);

    }
    public static class Human {
        int age;
        String name;
        String secondName;
        String favSport;

        public Human() {
        }

        public Human(int q, String w, String e, String r) {
            this.age = q;
            this.name = w;
            this.secondName = e;
            this.favSport = r;
        }

        public Human(int q, String w, String e) {
            this.age = q;
            this.name = w;
            this.secondName = e;
        }
    }
}
