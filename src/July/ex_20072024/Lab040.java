package July.ex_20072024;

public class Lab040 {
    public static void main(String[] args) {
    //    ✅ Triangle Classifier:
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
        int side1=20;
        int side2=15;
        int side3=30;
        if (side1==side2 && side1==side3){
            System.out.println("all sides are equal");
        } else if (side1==side2 || side1==side3) {
            System.out.println("exactly two sides are equal");

        }else {
            System.out.println("no side are equal");
        }
    }
}
