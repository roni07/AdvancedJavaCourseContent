package lambdaexpressionbasicexample;

public class LambdaExpressionBasicExample {

    public static void main(String[] args) {

        Greeter hello = new Greeter();

        PrintString helloGreet = new GreetingClass();

        PrintString greetingFunction = () -> System.out.println("hello");

        hello.greet(helloGreet);
        hello.greet(greetingFunction);

    }

}

class Greeter {

    public void greet(PrintString printString) {
        printString.perform();
    }
}
