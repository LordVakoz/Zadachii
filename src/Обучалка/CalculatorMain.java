package Обучалка;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorMain x = new CalculatorMain();
        x.priceCalculation(50, 18);

    }

        public double priceCalculation ( double price, int count){
            double c = price * count;
            System.out.println(c);
            return c ;
        }
}