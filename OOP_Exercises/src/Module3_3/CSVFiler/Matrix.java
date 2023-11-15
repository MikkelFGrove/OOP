package Module3_3.CSVFiler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Matrix {
    double[][] data;


    public Matrix(String filename) throws FileNotFoundException {
        boolean success = load(filename);
        if (!success){
            System.out.println("Upsi pupsi");
        }
    }

    public Matrix(int x, int y){
        data = new double[x][y];
    }

    public double dataGetter(int x, int y){
        return data[x][y];
    }

    public void dataSetter(double z, int x, int y){
        data[x][y] = z;
    }

    public int getHeight(){
        return data.length;
    }

    public int getWidth(){
        return data[0].length;
    }

    public boolean save(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file);

        for (double[] row : data){
            for (int i = 0; i < row.length; i++) {
                double cell = row[i];
                out.print((i == 0 ? "" : ",")+cell);
            }
            out.println("");
        }
        out.close();
        return true;
    }

    public boolean load(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner in = new Scanner(file);
        return false;
    }


}
