/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.util.Scanner;

/**
 *
 * @author Ezz Atef
 */
public class Developer {
     public void changestatusbugs(){
        Scanner sc=new Scanner(System.in);
    String d = sc.next();
    if( "Y".equals(d)){
        System.out.println("status is solved");
    }
    if( "N".equals(d)){
        System.out.println("status is not solved");
        }
    
    
    }
   
}
