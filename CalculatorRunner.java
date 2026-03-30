public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(5));
        System.out.println(calc.add(10));

        System.out.println(calc.add(2,3));
        System.out.println(calc.add(4,6));

        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(3,4,5));

        System.out.println(calc.add(1,2,3,4));
        System.out.println(calc.add(2,3,4,5));

        System.out.println(calc.add(1,2,3,4,5));
        System.out.println(calc.add(5,4,3,2,1));

        System.out.println(calc.add(1,2,3,4,5,6));
        System.out.println(calc.add(6,5,4,3,2,1));

        System.out.println(calc.add(1,2,3,4,5,6,7));
        System.out.println(calc.add(7,6,5,4,3,2,1));

        System.out.println(calc.add(1,2,3,4,5,6,7,8));
        System.out.println(calc.add(8,7,6,5,4,3,2,1));

        System.out.println(calc.add(1,2,3,4,5,6,7,8,9));
        System.out.println(calc.add(9,8,7,6,5,4,3,2,1));

        System.out.println(calc.add(1,2,3,4,5,6,7,8,9,10));
        System.out.println(calc.add(10,9,8,7,6,5,4,3,2,1));

        
        System.out.println(calc.sub(10,5));
        System.out.println(calc.sub(20,10));

        System.out.println(calc.sub(20,5,3));
        System.out.println(calc.sub(30,10,5));

        
        System.out.println(calc.mul(2,3));
        System.out.println(calc.mul(4,5));

        System.out.println(calc.mul(2,3,4));
        System.out.println(calc.mul(3,4,5));
    }
}