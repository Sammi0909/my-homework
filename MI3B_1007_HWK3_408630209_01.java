/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1007_hwk3_408630209_01;

class Employee { //公司員工
    int ID ;	String name ;  
    void set(int id, String n) {
        this.ID = id; this.name = n ;
    }
} 
class Fulltime extends  Employee{ // 全職人員
    // int ID ;	String name ; 
    double baseSalary; int lenOfService ;
    void set(int a,String n,int s,int l){
        super.set(a, n);
        this.baseSalary=s;
        this.lenOfService=l;
    }
    public String toString(){
        return String.format("(%d,%s,%.0f,%d)",ID,name,baseSalary,lenOfService);
}
    double calSalary(Fulltime f){
        double a=1+0.05;
        for (int i = 0; i < f.lenOfService-1; i++) {
            a=a*a;
            if (a>2) {
                a=a/1.05;
                break;
            }
        }
       double ans= f.baseSalary*a;
       
        return ans ;
    }
}
public class MI3B_1007_HWK3_408630209_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Fulltime f = new Fulltime() ;
        f.set(1002,"Peter"); // OK ?
        f.baseSalary = 37300 ; // 比照碩士生基本薪資
        f.lenOfService = 5 ; // 年資5年
        System.out.println(f) ; 
        System.out.println(f.calSalary(f));
    }
    
}
