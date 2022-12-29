/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1007_hwk3_408630209_01;

class Staff { // 員工
    int ID; String name ;
    Staff() { this.ID=-1; this.name="XXX"; }
    Staff(int id, String n) { ID=id; name=n;}
}
class Fulltimes extends Staff { // 全職員工
    double baseSalary; int lenOfService ; // 底薪與年資
    // DIY: 自行加入合適的建構式與toString() 
    Fulltimes(){
        this.ID=-1;
        this.baseSalary=-1;
        this.lenOfService=-1;
        this.name="XXX";
    }
Fulltimes(int a,String b,int c,int d){
     this.ID=a;
     this.baseSalary=c;
     this.lenOfService=d;
     this.name=b;
}
}
public class MI3B_1007_HWK3_408630209_03 {
     public static void main(String[] args){
         Fulltimes f1 = new Fulltimes() ; // -1, XXX, -1, -1
         Fulltimes f2 = new Fulltimes(1001,"Peter",32000,5) ;
         System.out.println(f1+"\n"+f2) ;
    }
}
