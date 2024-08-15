package July.ex_27072024;

public class Lab083 {
    public static void main(String[] args) {
        int[][] array_2D = {
                {4,4,5,5},
                {8,9,7,4},
                {11,23,40,5}};
        //row =3 index 0-2
        // C - 4  j -> 0 to 3

        for (int i = 0; i < array_2D.length; i++) {
            for(int j=0;j< array_2D[i].length;j++){
                System.out.print(array_2D[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
