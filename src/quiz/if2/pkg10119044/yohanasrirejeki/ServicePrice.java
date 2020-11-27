/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119044.yohanasrirejeki;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    @Override
    public void displayService(){
        Scanner input = new Scanner(System.in);
        System.out.println("#*******************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*******************#");
        System.out.print("Choose (1/2/3)");
        input.next();
    }
    
    @Override
    public float getPrice(int serviceItem){
        switch (serviceItem){
            case 1:
                priceService = 45;
                break;
            case 2:
                priceService = 55;
                break;
            default: 
                priceService = 15;
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("yes") ||(statusMember.equals("YES"))){
            return true;
        }
        if(statusMember.equals("no") ||(statusMember.equals("NO"))){
            return false;
        }
        return false;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember == true){
            return discount = (float) (parServicePrice * 0.10);
        }
        return discount = 0;
    }
    
    public float getTotal(float priceService, float discount){
        return priceService-discount;
    }  
}
