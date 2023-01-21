import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//  https://www.youtube.com/watch?v=b7rC0BENpQw&t=433s ME BASO EN ESTE VIDEO
public class calcu {
    private JTextField pantalla;
    private JButton Boton7;
    private JButton Boton4;
    private JButton Boton8;
    private JButton Boton5;
    private JButton Boton1;
    private JButton Boton2;
    private JButton BotonSumar;
    private JButton BotonMultiplicar;
    private JButton BotonModulo;
    private JButton BotonPotencia;
    private JButton Boton0;
    private JButton Boton3;
    private JButton Boton6;
    private JButton Boton9;
    private JButton BotonRestar;
    private JButton BotonDividir;
    private JButton BotonRaiz;
    private JButton BotonPorcentaje;
    private JButton RESPUESTA;
    private JPanel Panel1;
    private JButton button1;
    private JButton cButton;

    public float primerNum;
    public float segundoNum;
    public String operador;

    public calcu() {
        Boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"0");
            }
        });
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"1");
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"2");
            }
        });
        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"3");
            }
        });
        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"4");
            }
        });
        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"5");
            }
        });
        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"6");
            }
        });
        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"7");
            }
        });
        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"8");
            }
        });
        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText()+"9");
            }
        });


        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                primerNum = 0;
                segundoNum = 0;
            }

        });
        BotonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "+";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        RESPUESTA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("num1: " + primerNum);
                System.out.println("num2: " + segundoNum);
                segundoNum = Float.parseFloat(pantalla.getText());


                switch (operador){
                    case "+":{
                        pantalla.setText( Float.toString(primerNum+ segundoNum) );
                        primerNum=(primerNum+segundoNum);//este numero que es el resultado del anterior, puede usarse para otra suma
                    }
                    break;
                    case "-":{
                        pantalla.setText( Float.toString(primerNum- segundoNum) );
                        primerNum=(primerNum-segundoNum);//est
                    }
                    break;
                    case "*":{
                        pantalla.setText( Float.toString(primerNum* segundoNum) );
                        primerNum=(primerNum*segundoNum);//est
                    }
                    break;
                    case "/":{

                        try{
                            pantalla.setText( Float.toString(primerNum/ segundoNum) );
                            primerNum=(primerNum/segundoNum);//est
                        }catch (ArithmeticException exepcion){
                            JOptionPane.showMessageDialog(null,"No se puede dividir para 0","Error",JOptionPane.ERROR_MESSAGE);
                            System.out.println("ERORRRR");
                        }


                    }
                    break;
                    case "MOD":{
                        pantalla.setText( Float.toString(primerNum% segundoNum) );
                        primerNum=(primerNum%segundoNum);//est
                    }
                    break;

                    case "pow":{
                        pantalla.setText( Float.toString((float)Math.pow(primerNum,segundoNum)) );
                        primerNum=((float)Math.pow(primerNum,segundoNum));//est
                    }
                    break;

                    case "sqrt":{

                        try{
                            pantalla.setText( Float.toString((float)Math.sqrt(primerNum)) );
                            primerNum = (float)Math.sqrt(primerNum);
                        }catch (ArithmeticException exepcion){
                            JOptionPane.showMessageDialog(null,"No existe la raíz cuadrada de números negativos","Error",JOptionPane.ERROR_MESSAGE);
                        }

                    }
                    break;
                }//FIN DEL SWITCH

            }
        });
        BotonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "-";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        BotonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "*";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        BotonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "/";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        BotonModulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "MOD";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        BotonPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador = "pow";
                pantalla.setText("");//recibe el siguiente numero
            }
        });
        BotonRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum = Float.parseFloat(pantalla.getText());
                operador="sqrt";
                pantalla.setText(Float.toString(primerNum));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( !pantalla.getText().contains(".") ){
                    pantalla.setText(pantalla.getText()+".");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane( new calcu().Panel1 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
