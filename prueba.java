import javax.swing.JOptionPane;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double val1 = 7;
        double val2 = 0;
        double resp = 0;

        try{
            if(val2 == 0){
                throw new ArithmeticException("No se divide para 0");
            }
            resp = val1/val2;
            System.out.println(val1 + "/" + val2 + "="+(resp) );
        }catch (Exception e){
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "no se divide para 0", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
}
