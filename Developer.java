/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developer;

import java.util.Scanner;

/**
 *
 * @author Ezz Atef
 */
public class Developer{

    public void changestatusbugs(){
    try{
        Scanner sc=new Scanner(System.in);
    String d = sc.next();
    if( "YES".equals(d)){
        System.out.println("status is solved");
    }
    if( "NO".equals(d)){
        System.out.println("status is not solved");
        }
    }catch(Exception e){
        System.out.println("Wronge entry");
    }
    
public void viewassignedbugs(){
        
    }
    public static void main(String[] args) {
        Developer n=new Developer();
        n.changestatusbugs();
    }
    
}
