package Project;

public class App {
    public String getGreeting() {
        return "Voce esta aprendendo Gradle!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
