import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main extends JFrame implements ActionListener {


    private JButton btDiviser = new JButton("Diviser par 2");
    private JButton btModulo = new JButton("Modulo");
    private JButton btQuitter = new JButton("Fermer");
    private JButton btResultat = new JButton("Accueil");

    private JTextField txtMT = new JTextField();
    private JLabel lbTitre = new JLabel("Saisir le nombre à calculer ! ");

    //Menu
    public main()
    {
        this.setTitle("Calcule d'un nombre division + reste !");
        this.setBounds(200, 200, 400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.orange);
        this.setLayout(null);// 
        							
        this.lbTitre.setBounds(115, 50, 200, 15); 
        this.add(this.lbTitre);

        this.btDiviser.setBounds(10, 100, 130, 20);
        this.add(this.btDiviser);

        this.txtMT.setBounds(145, 100, 100, 20);
        this.add(this.txtMT);

        this.btResultat.setBounds(70, 150, 100, 20);
        this.add(this.btResultat);

        this.btModulo.setBounds(250, 100, 130, 20);
        this.add(this.btModulo);

        this.btQuitter.setBounds(220, 150, 100, 20);
        this.add(this.btQuitter);

        this.setVisible (true);

        this.btDiviser.addActionListener(this);
        this.btModulo.addActionListener(this);
        this.btResultat.addActionListener(this);
        this.btQuitter.addActionListener(this);
        
    }
    // 
    public static void main (String args[])
    {
        new main();
    }
    
    // Import 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.btQuitter)
        {
            this.dispose();
        }
        else if (e.getSource() == this.btResultat)
        {
            this.txtMT.setText("Saisir un nombre");
        }
        else if (e.getSource() == this.btDiviser)
        {
            float mt = 0;
            mt = Float.parseFloat(this.txtMT.getText());
            mt = mt / 2 ;
            this.txtMT.setText(" "+ mt);
        }
        else if (e.getSource() == this.btModulo)
        {
            float mt1 = 0;
            mt1 = Float.parseFloat(this.txtMT.getText());
            mt1 = mt1 % 2 ;
            this.txtMT.setText(" "+ mt1);
        }
    }
}