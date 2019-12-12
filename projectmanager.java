/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developer;

/**
 *
 * @author Ezz Atef
 */
public class projectmanager {
    public void show_performance(){
        Bugs b=new Bugs();
        if(b.status==false){
            b.status="True";
        }
        else{
            b.status="false";
        }
    }
}
