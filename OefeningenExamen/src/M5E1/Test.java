package M5E1;

public class Test {
    public static void main(String[] args) {
        for(Status stat: Status.values()) {
            stat.run();
        }
    }
}
