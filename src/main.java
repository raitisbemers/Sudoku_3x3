import java.util.Arrays;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        //--------sudoku spēles ievads un noteikumi

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                            SUDOKO SPĒLE 3x3");
        System.out.println("-----------------------------------------------[?] [?] [?]------------------------------------------------");
        System.out.println("-----------------------------------------------[?] [?] [?]------------------------------------------------");
        System.out.println("-----------------------------------------------[?] [?] [?]------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                                Noteikumi");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("1. Ievadam pa vienam skaitlim \"1\",\"2\" vai \"3\" secībā no kreisās uz labo pusi, no augšas uz leju;");
        System.out.println("2. Katrā rindā un kolonā var būt tikai viens skaitlis vienu reizi;");
        System.out.println("3. Spēle beidzas tikai tad, kad ir pareizi savadīti skaitļi pareizā secībā un kārtībā;");
        System.out.println("4. Ja kļūdāties, spēle ir zaudēta un var sākt no jauna!");
        System.out.println();

        // ------ definē 12 pareizus atrisinājumus

        int masivs1[] = {1, 2, 3, 3, 1, 2, 2, 3, 1};
        int masivs2[] = {1, 2, 3, 2, 3, 1, 3, 1, 2};
        int masivs3[] = {1, 3, 2, 3, 2, 1, 2, 1, 3};
        int masivs4[] = {1, 3, 2, 2, 1, 3, 3, 2, 1};
        int masivs5[] = {2, 3, 1, 1, 2, 3, 3, 1, 2};
        int masivs6[] = {2, 1, 3, 3, 2, 1, 1, 3, 2};
        int masivs7[] = {2, 3, 1, 3, 1, 2, 1, 2, 3};
        int masivs8[] = {2, 1, 3, 1, 3, 2, 3, 2, 1};
        int masivs9[] = {3, 1, 2, 1, 2, 3, 2, 3, 1};
        int masivs10[] = {3, 2, 1, 2, 1, 3, 1, 3, 2};
        int masivs11[] = {3, 1, 2, 2, 3, 1, 1, 2, 3};
        int masivs12[] = {3, 2, 1, 1, 3, 2, 2, 1, 3};

        //---------spēlētājs ievada 9 skaitļus

        int[] lietotajaIevade = new int[9];
        for (int a = 1; a < 10; a++) {
            Scanner ievade = new Scanner(System.in);
            System.out.print("Ievadiet skaitli " + a + " : ");
            int skaitlis = ievade.nextInt();
            lietotajaIevade[a - 1] = skaitlis;
        }

        // ---- izprintē ievadītos skaitļus sudoku izskatā

        System.out.println("Jūs ievadījāt šādu sudoku atbildi:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + lietotajaIevade[i] + "] ");
        }
        System.out.println();
        for (int i = 3; i < 6; i++) {
            System.out.print("[" + lietotajaIevade[i] + "] ");
        }
        System.out.println();
        for (int i = 6; i < 9; i++) {
            System.out.print("[" + lietotajaIevade[i] + "] ");
        }
        System.out.println();

// -------- pārbauda un paziņo vai ir pareizs atrisinājums

        if (Arrays.equals(masivs1, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs2, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs3, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs4, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs5, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs6, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs7, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs8, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs9, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs10, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs11, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else if (Arrays.equals(masivs12, lietotajaIevade)) {
            System.out.println("Ievadīti skaitļi ir pareizā secībā un kārtībā! Jūs uzvarējāt!");
        } else {
            System.out.println("Ievadītie skaitļi nav pareizā secībā vai kārtībā! Jūs zaudējāt!");
        }
    }
}


