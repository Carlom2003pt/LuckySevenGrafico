import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LuckySeven {
    private JLabel labelPremio;
    private JButton luckySevenButton;
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelNum3;
    private JPanel panelLucky;

    public LuckySeven() {
        luckySevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd= new Random();
                int num1 = rnd.nextInt(8);
                int num2 = rnd.nextInt(8);
                int num3 = rnd.nextInt(8);

                labelNum1.setText(String.valueOf(num1));
                labelNum2.setText(String.valueOf(num2));
                labelNum3.setText(String.valueOf(num3));

                String premio = "";
                if(num1==7 && num2==7 && num3==7)
                    premio="Parabens! Ganhou o 1º premio: 5.000.000€";
                else if((num1==7 && num2==7) || (num2==7 && num3==7) || (num3==7 && num1==7))
                    premio="Parabens! Ganhou o 2º premio: 500.000€";
                else if(num1==7 || num2==7 || num3==7)
                    premio="Parabens! Ganhou o 3º premio: 20.000€";
                else if((num1+num2+num3)==7)
                    premio="Parabens! Ganhou o 4º premio: 1.000€";
                else
                    premio="Infelizmente não ganhou nada!";
                labelPremio.setText(premio);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Lucky Seven");
        frame.setContentPane(new LuckySeven().panelLucky);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
