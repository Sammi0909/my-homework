/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1014_hwk4_408630209_01;

import java.awt.Point ;
class Shape {
    protected Point p ; // 記錄形狀的左上角座標
    protected double w, h ;
    
    void set(Point upLeft, double w, double h) {
        // DIY here
        this.h=h;
        this.p=upLeft;
        this.w=w;
    }
    double calArea() { return -1 ; } // 不知道是何形狀，所以回傳-1
    public String toString() { return p+","+w+","+h ; }
} 
class Ellipse extends Shape { // 橢圓形
    // DIY here, toString(), calArea()
    Ellipse(Point a,double b,double c){
        super.set(a, b, c);
    }
 
    double calArea(){
        return Math.PI*w*h;
    }
    public String toString(){
    return String.format("center:(%d,%d), r1=%.1f, r2=%.1f",this.p.x,this.p.y,this.w,this.h);
}
}
public class MI3B_1014_HWK4_408630209_02 {
    public static void main(String[] args) {
         Ellipse e = new Ellipse(new Point(5, 10), 4, 7.5) ; // 左上角，長、短邊
         System.out.println("e="+e); // 印出e= center:(5,10), r1=4, r2=7.5
         System.out.println("area of e ="+e.calArea()) ; // 印出面積
    }
}
