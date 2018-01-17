/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Bonus {
public static void main(String[] args){
    
    Scanner scan=new Scanner(System.in);
    int pel;
    double gaji;
    double bonus;
    
    System.out.print("Masukkan bilangan pelanggan anda: ");
    pel=scan.nextInt();
    
    if (pel <= 10){
        bonus=550;
    }
    else if(pel <= 50){
    bonus=1400;
            }
    else if (pel <= 100){
    bonus=2500;
            }
    else{
    bonus=10500;
            }
    
    gaji=800+bonus;
    
    System.out.println("Gaji anda bulan ini : RM 800 + RM "+bonus+" = RM "+gaji);
}
}