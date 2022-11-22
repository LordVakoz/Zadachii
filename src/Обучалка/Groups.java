package Обучалка;

import java.sql.SQLOutput;

public class Groups {
    public static void main(String[] args) {
        Groups Person = new Groups();
        Person.determineGroup(17);

    }
    public int determineGroup(int age){
        if (age >= 7 && age <=13){
            System.out.println("Идет в группу - 1");
            return (1);
        }else if (age>=14 && age <=17){
            System.out.println("Идет в группу - 2");
            return (2);
        }else if (age>=18 && age <=60){
            System.out.println("Идет в руппу - 3");
            return (3);
        }else{
            System.out.println("Идет на хуй");
            return (-1);
        }
    }
}
