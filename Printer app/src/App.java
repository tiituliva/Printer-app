public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        String tekijä;
        double luku1, luku2;
        luku1 = 5;
        luku2 = 10;
        double tulo;
        tulo = luku1 * luku2;
        double erotus;
        erotus = luku1 - luku2;
        double summa;
        summa = luku1 + luku2;
        double jako;
        jako = luku1 / luku2;
        tekijä = "Tiia Vänttilä";
        System.out.println(tekijä);
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
        System.out.println("Valmis!");

    }
}
