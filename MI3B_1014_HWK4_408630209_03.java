/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1014_hwk4_408630209_01;

class ID {
    private int id ; 
    ID(int a) { this.id = a; }
    void reset()  {id=-1;}
    public String toString() {return id+""; }
}
class Scoree extends ID{ 
    private float gpa ;  
    Scoree(int a, float b) { super(a); this.gpa=b; }
    void reset() { 
        // DIY here 
        super.reset();
        this.gpa=-1;
    } 
    public String toString() { // id,gpa
       return super.toString()+String.format(",gpa=%.1f",gpa);   // DIY
    } 
}
class Recordd extends Scoree { 
    private String comment ;  
    Recordd(int a,float b, String s) { 
        super(a,b); this.comment= s; 
    }
    void reset() {       
        // DIY here
        super.reset();
        this.comment="XXX";
    } 
    public String toString() {
        return super.toString()+String.format(",commont=%s",comment); // DIY 
    }
}
public class MI3B_1014_HWK4_408630209_03 {
    public static void main(String[] args) {
        Recordd r = new Recordd(1001, 4.3f, "GOOD") ; 
        System.out.println("Record="+r) ; // 印出(1001, 4.3, GOOD)
        r.reset() ; // id=-1,  gpa=-1,  comment="XXX"
        System.out.println("Record="+r) ; // 印出(-1, -1, XXX)
    }
}
