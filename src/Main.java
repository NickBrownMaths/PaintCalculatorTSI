public class Main {
    public static void main(String[] args) {
        int walls = 4;
        double wall_sa = 10;
        double window_sa = 5;
        double ceiling_sa = 12;

        System.out.println((walls * wall_sa + ceiling_sa - window_sa) + " litres of paint");
    }
}