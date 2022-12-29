/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1014_hwk4_408630209_01;

class IntNum {
    private int n ; 
    void set(int x) { n = x; }
    int getN() { return n; }
}
class Score extends IntNum {
    // 把父類別中的整數n做為學生的id之用 
    private float gpa ;  

   
    void set(int x,float a) {
        super.set(x);
        this.gpa=a;
        //To change body of generated methods, choose Tools | Templates.
    }
float getGPA(){
    return gpa;
}
   
    /*DIY, 加入set(id,gpa), getGPA()*/
 }
class Record extends Score { 
    private String comment ;  
    /*DIY, 加入set(id,gpa,comment), getComment(), toString()*/ 
     void set(int x,float a,String s) {
       super.set(x, a);
       this.comment=s;
        //To change body of generated methods, choose Tools | Templates.
    }
     String getComment(){
         return comment;
     }
    public String toString(){
         return String.format("n=%d,gpa=%.2f,comment=%s",super.getN(),super.getGPA(),comment);
     }
}
public class MI3B_1014_HWK4_408630209_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Record r = new Record() ;
         r.set(1001, 3.14f, "Good") ; // 設定r物件之n,gpa,comment變數
         System.out.println(r) ;  // 覆寫toString()函數
    }
    
}
