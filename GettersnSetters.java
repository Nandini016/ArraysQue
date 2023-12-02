public class GettersnSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("purple");
        System.out.println(p1.getColors());
        p1.setTip(5);
        System.out.println(p1.getTips());


    }
}
class Pen{
     private String color;
   private int tip;

    String getColors(){
        return this.color;

    }
     int getTips(){
        return this.tip;

    }

    void setColor(String NewColor){
        this.color = NewColor;
    }
    void setTip(int Newtip){
        this.tip=Newtip;
    }
}

