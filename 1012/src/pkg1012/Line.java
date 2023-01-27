/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1012;

/**
 *
 * @author User
 */
public class Line {
    Point begin, end;  
    
   public Line(int x1, int y1, int x2, int y2) {
      begin = new Point(x1, y1);  
      end   = new Point(x2, y2);
   }

   public Line(Point begin, Point end) {
      this.begin = begin; 
      this.end   = end;
   }
 
   public Point getBegin() {
      return begin;
   }
   public Point getEnd() {
      return end;
   }
   public void setBegin(Point begin) {
      this.begin = begin;
   }
   public void setEnd(Point end) {
      this.end = end;
   }
 
  
}
