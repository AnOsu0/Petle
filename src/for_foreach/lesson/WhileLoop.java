package for_foreach.lesson;

public class WhileLoop {
    public static void main(String[] args) {
        int i =0;
//        while (i<5) {
//            i++;
//            System.out.println(i);
//        }

        do {
            System.out.println("Ciało pętli");
            i++;
        } while (i<5);
        System.out.println("Koniec programu");
    }
}
