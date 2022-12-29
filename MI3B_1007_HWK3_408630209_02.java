/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1007_hwk3_408630209_01;

import java.awt.Point ;
class Shape { 
    private Point p1 ; //形狀的左上角座標，或多邊形的第一個點
    protected void setP1(Point p) { this.p1 = p ;}
    protected Point getP1() { return p1 ; }
}
class Ellipse extends Shape { // 繼承Shape, 由左上角座標p1, 長寬為d1,d2的矩形所表示
    // DIY: 變數宣告
 double d1,d2;
    // DIY: 函數定義
  public void set(Point p,double d1,double d2) {
      super.setP1(super.getP1());
      this.d1=d1; this.d2=d2;
      
  }
  public double calArea(){
      return d1*d2;
  }
}
class Triangle extends Shape{  // 繼承Shape, p1代表三角形的第一點
    // DIY: 變數宣告
 private Point p2;
 private Point p3;
    // DIY: 函數定義
public void set(Point p[]) {
      super.setP1(p[0]);
      this.p2=p[1]; this.p3=p[2];
      
  }
public double calArea(){
    double a=line(super.getP1(),p2);
    double b=line(super.getP1(),p3);
    double c=line(p2,p2);
    double s=a+b+c;
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
double line(Point p2,Point p1){
    double a=p1.x-p2.x;
     double b=p1.y-p2.y;
     return Math.sqrt(a*a+b*b);
}
}
public class MI3B_1007_HWK3_408630209_02 {
    public static void main(String[] args) {
        Ellipse e = new Ellipse() ; // 橢圓形
        e.set(new Point(10,10), 12, 7) ;
        System.out.println("Ellipse Area="+ e.calArea());
        Triangle t = new Triangle() ; // 橢圓形
        Point[] ps = 
                {new Point(-3,0), new Point(2,0), new Point(1,7)}; 
        t.set(ps) ;
        System.out.println("Triangle Area="+t.calArea());
    }
}
