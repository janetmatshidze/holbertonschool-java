public class Square {
 public static double area(double side) throws Exception {
  if (side <=0) {
    throw new Exception("Side must have a posetive value");
  }
  return side * side;
  }
}
