 public class Rectangle extends GeometricShape {

 private double width;
 private double height;

 // Getters
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  // Setters
  public void setWidth(double width) throws UnsupportedOperationException {
     this.width = width;
      if(width <= 0) {
        throw new UnsupportedOperationException("Width must be greater than or equal to 0");
      }
      return;

  }

  public void setHeight(double height) throws UnsupportedOperationException {
    this.height = height;

    if(height <= 0) {
        throw new UnsupportedOperationException("Height must be greater than or equal to 0");
    }
    return;

  }
}