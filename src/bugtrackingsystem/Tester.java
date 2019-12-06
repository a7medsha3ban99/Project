/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author dell
 */
public class Tester extends Employee {
    public void Define (){
    
    
    
    }
    public void MonitorOpenedAndClosedBugs(){
    
    
    }
        public void CaptureScreen()throws Exception{
    
    try{
        String FileName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your ScreenShot Name: ");
        FileName=sc.next()+".jpg";
        Robot robot=new Robot();
        Rectangle ScreenRect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage ScreenShot=robot.createScreenCapture(ScreenRect);
        ImageIO.write(ScreenShot,"jpg" , new File(FileName));
        
      
    }
    catch(Exception e){
        System.out.println("ScreenShot Is't Captured");
    
    
    
    }
    
   }
}
