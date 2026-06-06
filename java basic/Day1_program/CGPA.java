package Day1_program;

public class CGPA {

    // Calculate the mark on three subject and CGPA
    public static void main(String[] args) {
        double subject_A = 95.50;
        double subject_B = 85;
        double subject_C = 87.50;

        double parsentage = ((subject_A + subject_B + subject_C) / 300) * 100;
        System.out.println(parsentage);

        double CGPA = parsentage / 9.5;
        System.out.println(CGPA);


    }
}
