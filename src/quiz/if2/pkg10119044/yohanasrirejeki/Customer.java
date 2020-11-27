/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119044.yohanasrirejeki;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ASUS
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean isMember(){
        return member;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    @Override
    public String currentTime(){    
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter memformat = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy HH:mm:ss");
        
        String diformat = waktu.format(memformat);
        System.out.println("Data Transaction: "+diformat);
        return diformat;
    }
}
