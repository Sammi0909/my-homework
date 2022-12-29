 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1007_hwk3_408630209_01;

import java.awt.Point ;
class Shapes {
    protected Point p ; // 記錄形狀的左上角座標
    protected double w, h ;
    
    void set(Point upLeft, double w, double h) {
        // DIY here
        this.p=upLeft;
        this.w=w;
        this.h=h;
    }
    double calArea() { return -1 ; } // 不知道是何形狀，所以回傳-1
    public String toString() { return p+","+w+","+h ; }
} 
class Ellipses extends Shapes { // 橢圓形
    // DIY here, toString(), calArea()
    Ellipses(Point a,double b,double c){
        this.p=a;this.w=b;this.h=c;
    }
double calArea(){
    return w*h*Math.PI;
}
 public String toString() { return String.format("center:(%d,%d),r1=%.1f,r2=%.1f",p.x,p.y,w,h) ;}
}
public class MI3B_1007_HWK3_408630209_05 {
    public static void main(String[] args) {
         Ellipses e = new Ellipses(new Point(5, 10), 8, 10) ; // 左上角，長、短邊
         System.out.println("e="+e); // 印出e= center:(5,10), r1=4, r2=7.5
         System.out.println("area of e ="+e.calArea()) ; // 印出面積
    }
}
