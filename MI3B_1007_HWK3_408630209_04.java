/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1007_hwk3_408630209_01;


class Point { 
    int x, y ; 
    void set(int a, int b) { this.x = a; this.y = b; }
}
class Point3D extends Point {
    int z ;
    void set(int a, int b, int c) { 
        set(a,b); this.z = c ;
    } 
}
class Sphere extends Point3D { // 球體
    double r;

    Sphere(int i, int i0, int i1, double d) {
         //To change body of generated methods, choose Tools | Templates.
       this.x=i; this.y=i0; this.z=i1; this.r=d;  
    }

    Sphere() {    
    }
    void set(int a, int b, int c, double r) { 
        set(a,b,c);  this.r = r;
    } 
    public String toString(){
        return String.format("(x,y,z)=(%d,%d,%d),r=%.1f",x,y,z,r);
    }
}
public class MI3B_1007_HWK3_408630209_04 {
    public static void main(String[] args) {
        Sphere cp = new Sphere() ;
        cp.set(5, 3, 9); cp.r = 12.5;
        cp.set(3, 4, 5, 7.3) ;
        
        // 承上，請為上述各類別加入建構式與toString()，印出規定輸出
	 Sphere sp = new Sphere(5, 3, 9, 12.5) ;
	 System.out.println("sp="+sp) ;// 印出(x,y,z)=(5,3,9), r=12.5
        
    }
}
