
package calculos;

public class triangulo {
    private float b;
    private float a;
    private float p;
    private float ar;
    
    public triangulo(String base, String altura)
    {
        this.setBase(Float.parseFloat(base));
        this.setAltura(Float.parseFloat(altura));

    }
    
    public void calperimetro()
    {
       float per = this.getBase() * 3;
       this.setPerimetro(per);
    }
    
    public void calarea()
    {
         float are = (this.getBase()* this.getAltura())/2; 
         this.setArea(are);
    }
    
    public float getBase() {
        return b;
    }
    
    public void setBase(float b){
       this.b = b;
    }
    
      public float getAltura() {
        return a;
    }
    
    public void setAltura(float a){
       this.a = a;
    }
    
      public float getPerimetro() {
        return p;
    }
    
    public void setPerimetro(float p){
       this.p = p;
    }
    
      public float getArea() {
        return ar;
    }
    
    public void setArea(float ar){
       this.ar = ar;
    }
    
}
