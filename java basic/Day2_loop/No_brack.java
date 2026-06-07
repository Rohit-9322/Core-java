package Day2_loop;

public class No_brack {

    // Fall Through (No Break — Tricky Interview Topic)
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("1 to 3 ");        
                break;
            case 4:
            case 5:
                System.out.println("4 to 5");
                break;

            default:
                System.out.println(" Out ");
                break;
        }
    }
}
