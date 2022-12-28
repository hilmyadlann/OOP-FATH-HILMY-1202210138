public class Calculation implements Runnable {
  public double radius, sisi, area;
  public double phi = 3.14;

  public void setSquare(double sisi){
      if(sisi >= 1){
          this.sisi = sisi;
          this.area = sisi*sisi;
      }
      else{
          throw new IllegalArgumentException("Side must be >= 1 !!!");
      }
  }

  public double getSquare(){
      return area;
  }

  public void setCircle(double radius){
      if(radius >= 1){
          this.sisi = radius;
          this.area = phi*radius*radius;
      }
      else{
          throw new IllegalArgumentException("Side must be >= 1 !!!");
      }
  }

  public double getCircle(){
      return area;
  }

  public void setTrapezoid(double a, double b, double t){
      this.sisi = a;
      this.sisi = b;
      this.sisi = t;
      this.area = 0.5*((a+b)*t);
      if(this.sisi < 1){
          throw new IllegalArgumentException("Side must be >= 1 !!!");
      }
  }

  public double getTrapezoid(){
      return area;
  }

  @Override
  public void run(){
      System.out.println();
      System.out.println("====Program will Start in====");
      for(int i = 1; i < 4; i ++){
          System.out.println("Starting with thread in "+ i);
      }
      try {
          Thread.sleep(100);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

}