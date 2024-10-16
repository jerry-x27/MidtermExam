/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edi tor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 * @modifiedBy vedivyan
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code");
        System.out.println("0 for rejected");
        System.out.println("1 for Pending");
        System.out.println("2 for Processing");
        System.out.println("3 for Approved");
        System.out.print("Enter Here: ");
        try {
            int code = in.nextInt();  
            StatusUserENUM status = StatusUserENUM.getStatusByCode(code);  
            StausUser statusUser = new StausUser();
            statusUser.statusDetail(status);  
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer value.");
        }
    }
    
}
