/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementeringform;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author taglu01
 */
public class ImplementeringForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Form> former = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int val;

        do {
            System.out.println("\n--- MENY ---");
            System.out.println("1. Skapa cirkel");
            System.out.println("2. Skapa triangel");
            System.out.println("3. Skapa rektangel");
            System.out.println("4. Skriv ut alla former");
            System.out.println("0. Avsluta");

            val = input.nextInt();

            switch (val) {

                case 1 -> {
                    System.out.print("x: "); 
                    int x = input.nextInt();
                    System.out.print("y: "); 
                    int y = input.nextInt();
                    System.out.print("Radie: "); 
                    int r = input.nextInt();
                    former.add(new Cirkel(x, y, r, true));
                }

                case 2 -> {
                    System.out.print("x: "); 
                    int x = input.nextInt();
                    System.out.print("y: "); 
                    int y = input.nextInt();
                    System.out.print("Bas: "); 
                    int b = input.nextInt();
                    System.out.print("Höjd: "); 
                    int h = input.nextInt();
                    former.add(new Triangel(x, y, b, h, true));
                }

                case 3 -> {
                    System.out.print("x: "); 
                    int x = input.nextInt();
                    System.out.print("y: "); 
                    int y = input.nextInt();
                    System.out.print("Bas: "); 
                    int b = input.nextInt();
                    System.out.print("Höjd: "); 
                    int h = input.nextInt();
                    former.add(new Rektangel(x, y, b, h, true));
                }
         
                case 4 -> {
                    System.out.println("\n--- SPARADE FORMER ---");
                        for (Form f : former) {
                        System.out.printf("%s – Area: %.2f\n",
                            f.whatAmI(),
                            f.getArea());
        }
    }

                case 0 -> System.out.println("Avslutar...");

                default -> System.out.println("Fel val!");
            }

        } while (val != 0);
    }
}
