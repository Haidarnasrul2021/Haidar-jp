package basics;

public class TestResult {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Add result is : "+cal.add(6,2));
        System.out.println("subtract result is : "+cal.subtract(6,2));
        System.out.println("multiply result is : "+cal.multiply(6,2));
        System.out.println("divide result is : "+cal.divide(6,2));
    }
}
