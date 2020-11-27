/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119044.yohanasrirejeki;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan 
 */ 

public class QUIZIF210119044YOHANASRIREJEKI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Kasir Rock n Roll Haircut");
        Customer customer = new Customer();
        System.out.print("Customer Name : ");
        customer.setName(input.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(input.next());
        customer.displayService();
        System.out.println("Are you Member (yes/no) : ");
        customer.isMember();
        input.next();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("#*******************#");
        System.out.println("#*******CUSTOMER INVOICE********#");
        
        
    }
    
}
