package colors2;
import java.awt.*;
import java.io.*;
public class Colors2 extends Canvas implements Serializable{
//BUAT WARNA 
    private Color color;
    private boolean rect;
    public Colors2(){
        rect=false; setSize(99,99); //UKURAN CANVAS
        change();}
    public boolean getRect(){
        return rect;}
    public void setRect(boolean flag){
        this.rect=flag; repaint();}
    public void change(){
        color = randomColor();
        repaint();}
    private Color randomColor(){
        int r=(int)(255*Math.random());
        int g =(int)(255*Math.random());
        int b=(int)(255*Math.random());
        return new Color(r,g,b);}
    public void paint(Graphics g){
        Dimension d = getSize();
        int h=d.height;
        int w=d.width;
     
        g.setColor(color);
        if(rect) {
            g.fillPolygon(new int[] {0,99,99}, new int[] {50,99,1}, 3);}
        else{
            g.fillPolygon(new int[] {0,99,99}, new int[] {50,99,1}, 3);}
        
        
    }
}