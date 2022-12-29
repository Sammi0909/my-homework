/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi3b_1014_hwk4_408630209_01;

class Shapee {
    int a,b ; 
    Shapee() { }	
    double area() { return 0.0; } // 需被子類別覆蓋(override)
} 
class Rect extends Shapee {
    Rect(int w, int h) { a = w; b=h;}
    double area() { return a*b;} 
}
class Circle extends Shapee {
    int r ; 
    Circle(int w, int h, int r) { a = w; b=h; this.r = r ;}
    double area() { return Math.PI*r*r ; }
}
public class MI3B_1014_HWK4_408630209_05 {
    public static void main(String[] args) {
	Shapee[] ss = new Shapee[10] ;
	int cnt = 0 ; 
	ss[cnt++] = new Circle(5,5,3) ;
	ss[cnt++] = new Rect(4,7) ;
	ss[cnt++] = new Rect(5,12) ;
        ss[cnt++] = new Circle(2,3,9) ;
	 System.out.println("total area="+calTotalArea(ss)) ;
    }
    // DIY: 完成以下函數
     public static double calTotalArea(Shapee a[]) {
         double b=0;
         for (int i = 0; i < a.length; i++) { 
             if (a[i]==null) {
               break;  
             }
                 System.out.println(a[i].area());
             
                 b+=a[i].area();             
         }
         return b;
     } 
}
