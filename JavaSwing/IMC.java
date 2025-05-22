package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class IMC extends JFrame{

    private JTextField txtPeso;
    private JTextField txtAltura;
    private JTextField txtIMC;

    private JLabel lbPeso;
    private JLabel lbAltura;
    private JLabel lbIMC;

    private JButton btnCalcular;

    private static  IMC frame;

    public IMC(){
        inicilizarComponentes();
        definirEventos();
    }

    private void inicilizarComponentes() {
        setTitle("IMC");
        setBounds(0,0,250,260);
        setLayout(null);

        lbPeso = new JLabel("Peso");
        lbPeso.setBounds(30,30,80,25);
        add(lbPeso);

        lbAltura  = new JLabel("Altura");
        lbAltura.setBounds(30,70,80,25);
        add(lbAltura);

        btnCalcular = new JButton("Calcular IMC");
        btnCalcular.setBounds(0,120,240,30);
        add(btnCalcular);

        lbIMC = new JLabel("IMC");
        lbIMC.setBounds(30,165,80,25);
        add(lbIMC);

        txtPeso = new JTextField();
        txtPeso.setBounds(90,30,80,25);
        add(txtPeso);

        txtAltura = new JTextField();
        txtAltura.setBounds(90,75,80,25);
        add(txtAltura);


        txtIMC = new JTextField();
        txtIMC.setBounds(90,165,80,25);
        add(txtIMC);

    }

    private void definirEventos() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new IMC();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width)/2,
                        (tela.height - frame.getSize().height)/2);
                frame.setVisible(true);
            }
        });



        }
    }
