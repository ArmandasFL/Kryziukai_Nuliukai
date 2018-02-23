
import java.awt.Color;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arman
 */
public class KryziukuNuliukuPagrindinis extends javax.swing.JFrame {

    private String kienoEile = "X";
    private String judeti = "O";
    private String xZaidejas = "X ";
    private String oZaidejas = "O ";
    private int xSkaiciuotiTaskus = 0;
    private int oSkaiciuotiTaskus = 0;

    
    public KryziukuNuliukuPagrindinis() 
    {
        initComponents();
        setSize(700, 700);
        setLocationRelativeTo(null);
        rodytiTaskus();
    }
    
    
    
    
    
    /**  Cia bandziau atlikti Zaidejas VS Kompiuteris, bet truputi per mazai laiko, logyka kaip ir padariau pagal ka ziuretu Kompiuteris.
         Tiesiog nepadariau, kad jei kampai uzimti, kad imtu random, bet kuri is eiles
         Taip pat nepadariau narmaliu metodu, kuriuos programa suprastu, todel mano atliekami veiksmai yra blogi(nera logikos).
    */
    
    /**
    private void kompiuterisDaroEjima()
    {
        //1 variantas: ziureti ar yra galimybe laimeti
        //2 variantas: blokuoti X, kad nelaimetu
        //3 variantas: eiti i kampu vietas
        //4 variantas: pasirinkti viena vieta
        JButton judeti = null;
        
        if(judeti.equalsIgnoreCase("O");
        {
            judeti = ziureti_laimejimo_galimybe_ar_bloko("X");
            if(judeti == null)
            {
                judeti = ziureti_kampus();
                if(judeti == null)
                {
                    judeti = ziureti_tuscias_vietas();
                }
            }
        }
        judeti.doClick();
    }
    
    private void ziureti_tuscias_vietas()
    {
        
    }
    
    private void ziureti_kampus()
    {
        //Ziurima tuscius kampus pirmiau
        if (jMygtukas_1 == "O")
        {
            if (jMygtukas_3 == "")
            {
                return jMygtukas_3;
            }
            if (jMygtukas_9 == "")
            {
                return jMygtukas_9;
            }
            if(jMygtukas_7 == "")
            {
                return jMygtukas_7;
            }
        }
        if (jMygtukas_3 == "O")
        {
            if(jMygtukas_1 == "")
            {
                return jMygtukas_1;
            }
            if (jMygtukas_9 == "")
            {
                return jMygtukas_9;
            }
            if(jMygtukas_7 == "")
            {
                return jMygtukas_7;
            }
        }
        if (jMygtukas_9 == "O")
        {
            if(jMygtukas_1 == "")
            {
                return jMygtukas_1;
            }
            if (jMygtukas_3 == "")
            {
                return jMygtukas_3;
            }
            if(jMygtukas_7 == "")
            {
                return jMygtukas_7;
            }
        }
        if (jMygtukas_7 == "O")
        {
            if(jMygtukas_1 == "")
            {
                return jMygtukas_1;
            }
            if (jMygtukas_3 == "")
            {
                return jMygtukas_3;
            }
            if(jMygtukas_9 == "")
            {
                return jMygtukas_9;
            }
        }
        
        //Jei bet koks kampas laisvas, imamas tas
        
        if (jMygtukas_1 == "")
        {
            return jMygtukas_1;
        }
        if (jMygtukas_3 == "")
        {
            return jMygtukas_3;
        }
        if (jMygtukas_9 == "")
        {
            return jMygtukas_9;
        }
        if (jMygtukas_7 == "")
        {
            return jMygtukas_7;
        }
        return();
    }
            
    private void ziureti_laimejimo_galimybe_ar_bloko(String zyme)
    {
     
        //Gulscias ziurejimas
        
        if((jMygtukas_1 == zyme) && (jMygtukas_2 == zyme) && (jMygtukas_3 == ""))
        {
            return jMygtukas_3;
        }
        if((jMygtukas_2 == zyme) && (jMygtukas_3 == zyme) && (jMygtukas_1 == ""))
        {
            return jMygtukas_1;
        }
        if((jMygtukas_1 == zyme) && (jMygtukas_3 == zyme) && (jMygtukas_2 == ""))
        {
            return jMygtukas_2;
        }
        
        if((jMygtukas_4 == zyme) && (jMygtukas_5 == zyme) && (jMygtukas_6 == ""))
        {
            return jMygtukas_6;
        }
        if((jMygtukas_5 == zyme) && (jMygtukas_6 == zyme) && (jMygtukas_4 == ""))
        {
            return jMygtukas_4;
        }
        if((jMygtukas_4 == zyme) && (jMygtukas_6 == zyme) && (jMygtukas_5 == ""))
        {
            return jMygtukas_5;
        }
        
        if((jMygtukas_7 == zyme) && (jMygtukas_8 == zyme) && (jMygtukas_9 == ""))
        {
            return jMygtukas_9;
        }
        if((jMygtukas_8 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_7 == ""))
        {
            return jMygtukas_7;
        }
        if((jMygtukas_7 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_8 == ""))
        {
            return jMygtukas_8;
        }
        
        //Stacias ziurejimas
        
        if((jMygtukas_1 == zyme) && (jMygtukas_4 == zyme) && (jMygtukas_7 == ""))
        {
            return jMygtukas_7;
        }
        if((jMygtukas_4 == zyme) && (jMygtukas_7 == zyme) && (jMygtukas_1 == ""))
        {
            return jMygtukas_1;
        }
        if((jMygtukas_1 == zyme) && (jMygtukas_7 == zyme) && (jMygtukas_4 == ""))
        {
            return jMygtukas_4;
        }
        
        if((jMygtukas_2 == zyme) && (jMygtukas_5 == zyme) && (jMygtukas_8 == ""))
        {
            return jMygtukas_8;
        }
        if((jMygtukas_5 == zyme) && (jMygtukas_8 == zyme) && (jMygtukas_2 == ""))
        {
            return jMygtukas_2;
        }
        if((jMygtukas_2 == zyme) && (jMygtukas_8 == zyme) && (jMygtukas_5 == ""))
        {
            return jMygtukas_5;
        }
        
        if((jMygtukas_3 == zyme) && (jMygtukas_6 == zyme) && (jMygtukas_9 == ""))
        {
            return jMygtukas_9;
        }
        if((jMygtukas_6 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_3 == ""))
        {
            return jMygtukas_3;
        }
        if((jMygtukas_3 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_6 == ""))
        {
            return jMygtukas_6;
        }
        
        //Istrizai ziurejimas
        
        if((jMygtukas_1 == zyme) && (jMygtukas_5 == zyme) && (jMygtukas_9 == ""))
        {
            return jMygtukas_9;
        }
        if((jMygtukas_5 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_1 == ""))
        {
            return jMygtukas_1;
        }
        if((jMygtukas_1 == zyme) && (jMygtukas_9 == zyme) && (jMygtukas_5 == ""))
        {
            return jMygtukas_5;
        }
        
        if((jMygtukas_3 == zyme) && (jMygtukas_5 == zyme) && (jMygtukas_7 == ""))
        {
            return jMygtukas_7;
        }
        if((jMygtukas_5 == zyme) && (jMygtukas_7 == zyme) && (jMygtukas_3 == ""))
        {
            return jMygtukas_3;
        }
        if((jMygtukas_3 == zyme) && (jMygtukas_7 == zyme) && (jMygtukas_5 == ""))
        {
            return jMygtukas_5;
        }
        return();
    }
       */     
    
    
    
    
    
    
    private void sutraukta(JButton button)
    {
       
        button.setText(kienoEile);
        if (kienoEile.equalsIgnoreCase("X"))
        {
            button.setBackground(new Color(140, 0, 26));
        }
        else {
            button.setBackground(Color.blue);
        }
        if (kienoEile.equalsIgnoreCase("X"))
        {
            button.setForeground(new Color(125, 5, 82));
        }
        else {
            button.setForeground(new Color(37, 65, 23));
        }
        NusprestiKienoEile();
        ZiuretiLaimejimoGalimybes();
        Lygiosios();
    }
    
    private void Lygiosios()
    {
        String pirmas = jMygtukas_1.getText();
        String antras = jMygtukas_2.getText();
        String trecias = jMygtukas_3.getText();
        String ketvirtas = jMygtukas_4.getText();
        String penktas = jMygtukas_5.getText();
        String sestas = jMygtukas_6.getText();
        String septintas = jMygtukas_7.getText();
        String astuntas = jMygtukas_8.getText();
        String devintas = jMygtukas_9.getText();
        
        if (pirmas != "" && antras != "" && trecias != "" && ketvirtas != "" && penktas != 
                "" && sestas != "" && septintas != "" && astuntas != "" && devintas != "")
        {
            JOptionPane.showMessageDialog(this, "Lygiosios", "Ups", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void rodytiTaskus()
    {
        jTaskai.setText(xZaidejas + "Taskai:" +  String.valueOf(xSkaiciuotiTaskus) + "\t     " + oZaidejas + "Taskai:" +  String.valueOf(oSkaiciuotiTaskus));
    }

    private void NusprestiKienoEile()
    {
        if (kienoEile.equalsIgnoreCase("X"))
        {
            kienoEile = "O";
        } 
        else {
            kienoEile = "X";
        }
    }
    
    private void xLaimi()
    {
        JOptionPane.showMessageDialog(this, "X zaidejas laimejo", "Sveikiname", JOptionPane.INFORMATION_MESSAGE);
        xSkaiciuotiTaskus++;
    }

    private void oLaimi()
    {
        JOptionPane.showMessageDialog(this, "O zaidejas laimejo", "Sveikiname", JOptionPane.INFORMATION_MESSAGE);
        oSkaiciuotiTaskus++;
    }
    
    private void PradetiIsNaujo()
    {
        jMygtukas_1.setText("");
        jMygtukas_2.setText("");
        jMygtukas_3.setText("");
        jMygtukas_4.setText("");
        jMygtukas_5.setText("");
        jMygtukas_6.setText("");
        jMygtukas_7.setText("");
        jMygtukas_8.setText("");
        jMygtukas_9.setText("");
        rodytiTaskus();
        
        jMygtukas_1.setBackground(Color.LIGHT_GRAY);
        jMygtukas_2.setBackground(Color.LIGHT_GRAY);
        jMygtukas_3.setBackground(Color.LIGHT_GRAY);
        jMygtukas_4.setBackground(Color.LIGHT_GRAY);
        jMygtukas_5.setBackground(Color.LIGHT_GRAY);
        jMygtukas_6.setBackground(Color.LIGHT_GRAY);
        jMygtukas_7.setBackground(Color.LIGHT_GRAY);
        jMygtukas_8.setBackground(Color.LIGHT_GRAY);
        jMygtukas_9.setBackground(Color.LIGHT_GRAY);
        
    }
    
    private void ZiuretiLaimejimoGalimybes()
    {
        String pirmas = jMygtukas_1.getText();
        String antras = jMygtukas_2.getText();
        String trecias = jMygtukas_3.getText();
        String ketvirtas = jMygtukas_4.getText();
        String penktas = jMygtukas_5.getText();
        String sestas = jMygtukas_6.getText();
        String septintas = jMygtukas_7.getText();
        String astuntas = jMygtukas_8.getText();
        String devintas = jMygtukas_9.getText();
        
        if (pirmas == "X" && antras == "X" && trecias == "X")
        {
            xLaimi();
        }
           if (ketvirtas == "X" && penktas == "X" && sestas == "X")
           {
               xLaimi();
           }
              if (septintas == "X" && astuntas == "X" && devintas == "X")
              {
                  xLaimi();
              }
                 if (pirmas == "X" && ketvirtas == "X" && septintas == "X")
                 {
                     xLaimi();
                 }
                    if (antras == "X" && penktas == "X" && astuntas == "X")
                    {
                        xLaimi();
                    }
                       if (trecias == "X" && sestas == "X" && devintas == "X")
                       {
                           xLaimi();
                       }
                          if (pirmas == "X" && penktas == "X" && devintas == "X")
                          {
                              xLaimi();
                          }
                             if (trecias == "X" && penktas == "X" && septintas == "X")
                             {
                                 xLaimi();
                             }
                             
           if (pirmas == "O" && antras == "O" && trecias == "O")
           {
               oLaimi();
           }
              if (ketvirtas == "O" && penktas == "O" && sestas == "O")
              {
                  oLaimi();
              }
                 if (septintas == "O" && astuntas == "O" && devintas == "O")
                 {
                     oLaimi();
                 }
                    if (pirmas == "O" && ketvirtas == "O" && septintas == "O")
                    {
                        oLaimi();
                    }
                       if (antras == "O" && penktas == "O" && astuntas == "O")
                       {
                           oLaimi();
                       }
                          if (trecias == "O" && sestas == "O" && devintas == "O")
                          {
                              oLaimi();
                          }
                             if (pirmas == "O" && penktas == "O" && devintas == "O")
                             {
                                 oLaimi();
                             }
                                if (trecias == "O" && penktas == "O" && septintas == "O")
                                {
                                    oLaimi();
                                }       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTaskai = new javax.swing.JLabel();
        jTinklelis = new javax.swing.JPanel();
        jMygtuko_tinklelis_1 = new javax.swing.JPanel();
        jMygtukas_1 = new javax.swing.JButton();
        jMygtuko_tinklelis_2 = new javax.swing.JPanel();
        jMygtukas_2 = new javax.swing.JButton();
        jMygtuko_tinklelis_3 = new javax.swing.JPanel();
        jMygtukas_3 = new javax.swing.JButton();
        jMygtuko_tinklelis_4 = new javax.swing.JPanel();
        jMygtukas_4 = new javax.swing.JButton();
        jMygtuko_tinklelis_5 = new javax.swing.JPanel();
        jMygtukas_5 = new javax.swing.JButton();
        jMygtuko_tinklelis_6 = new javax.swing.JPanel();
        jMygtukas_6 = new javax.swing.JButton();
        jMygtuko_tinklelis_7 = new javax.swing.JPanel();
        jMygtukas_7 = new javax.swing.JButton();
        jMygtuko_tinklelis_8 = new javax.swing.JPanel();
        jMygtukas_8 = new javax.swing.JButton();
        jMygtuko_tinklelis_9 = new javax.swing.JPanel();
        jMygtukas_9 = new javax.swing.JButton();
        jPradetiIsNaujo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kryziukai Nuliukai");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTaskai.setBackground(new java.awt.Color(255, 255, 255));
        jTaskai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTaskai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTaskai.setText("Laimetojas");
        jPanel1.add(jTaskai, java.awt.BorderLayout.PAGE_START);

        jTinklelis.setBackground(new java.awt.Color(204, 204, 204));
        jTinklelis.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jMygtuko_tinklelis_1.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_1.setLayout(new java.awt.BorderLayout());

        jMygtukas_1.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_1ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_1.add(jMygtukas_1, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_1);

        jMygtuko_tinklelis_2.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_2.setLayout(new java.awt.BorderLayout());

        jMygtukas_2.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_2ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_2.add(jMygtukas_2, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_2);

        jMygtuko_tinklelis_3.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_3.setLayout(new java.awt.BorderLayout());

        jMygtukas_3.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_3ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_3.add(jMygtukas_3, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_3);

        jMygtuko_tinklelis_4.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_4.setLayout(new java.awt.BorderLayout());

        jMygtukas_4.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_4ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_4.add(jMygtukas_4, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_4);

        jMygtuko_tinklelis_5.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_5.setLayout(new java.awt.BorderLayout());

        jMygtukas_5.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_5ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_5.add(jMygtukas_5, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_5);

        jMygtuko_tinklelis_6.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_6.setLayout(new java.awt.BorderLayout());

        jMygtukas_6.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_6ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_6.add(jMygtukas_6, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_6);

        jMygtuko_tinklelis_7.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_7.setLayout(new java.awt.BorderLayout());

        jMygtukas_7.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_7ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_7.add(jMygtukas_7, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_7);

        jMygtuko_tinklelis_8.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_8.setLayout(new java.awt.BorderLayout());

        jMygtukas_8.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_8ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_8.add(jMygtukas_8, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_8);

        jMygtuko_tinklelis_9.setBackground(new java.awt.Color(255, 255, 255));
        jMygtuko_tinklelis_9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMygtuko_tinklelis_9.setLayout(new java.awt.BorderLayout());

        jMygtukas_9.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jMygtukas_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMygtukas_9ActionPerformed(evt);
            }
        });
        jMygtuko_tinklelis_9.add(jMygtukas_9, java.awt.BorderLayout.CENTER);

        jTinklelis.add(jMygtuko_tinklelis_9);

        jPanel1.add(jTinklelis, java.awt.BorderLayout.CENTER);

        jPradetiIsNaujo.setText("Pradeti Is Naujo");
        jPradetiIsNaujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPradetiIsNaujoActionPerformed(evt);
            }
        });
        jPanel1.add(jPradetiIsNaujo, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMygtukas_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_1ActionPerformed
        sutraukta(jMygtukas_1);
    }//GEN-LAST:event_jMygtukas_1ActionPerformed

    private void jMygtukas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_2ActionPerformed
        sutraukta(jMygtukas_2);
    }//GEN-LAST:event_jMygtukas_2ActionPerformed

    private void jMygtukas_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_3ActionPerformed
         sutraukta(jMygtukas_3);
    }//GEN-LAST:event_jMygtukas_3ActionPerformed

    private void jMygtukas_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_4ActionPerformed
        sutraukta(jMygtukas_4);
    }//GEN-LAST:event_jMygtukas_4ActionPerformed

    private void jMygtukas_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_5ActionPerformed
        sutraukta(jMygtukas_5);
    }//GEN-LAST:event_jMygtukas_5ActionPerformed

    private void jMygtukas_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_6ActionPerformed
        sutraukta(jMygtukas_6);
    }//GEN-LAST:event_jMygtukas_6ActionPerformed

    private void jMygtukas_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_7ActionPerformed
        sutraukta(jMygtukas_7);
    }//GEN-LAST:event_jMygtukas_7ActionPerformed

    private void jMygtukas_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_8ActionPerformed
        sutraukta(jMygtukas_8);
    }//GEN-LAST:event_jMygtukas_8ActionPerformed

    private void jMygtukas_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMygtukas_9ActionPerformed
        sutraukta(jMygtukas_9);
    }//GEN-LAST:event_jMygtukas_9ActionPerformed

    private void jPradetiIsNaujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPradetiIsNaujoActionPerformed
        PradetiIsNaujo();
    }//GEN-LAST:event_jPradetiIsNaujoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KryziukuNuliukuPagrindinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KryziukuNuliukuPagrindinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KryziukuNuliukuPagrindinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KryziukuNuliukuPagrindinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KryziukuNuliukuPagrindinis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jMygtukas_1;
    private javax.swing.JButton jMygtukas_2;
    private javax.swing.JButton jMygtukas_3;
    private javax.swing.JButton jMygtukas_4;
    private javax.swing.JButton jMygtukas_5;
    private javax.swing.JButton jMygtukas_6;
    private javax.swing.JButton jMygtukas_7;
    private javax.swing.JButton jMygtukas_8;
    private javax.swing.JButton jMygtukas_9;
    private javax.swing.JPanel jMygtuko_tinklelis_1;
    private javax.swing.JPanel jMygtuko_tinklelis_2;
    private javax.swing.JPanel jMygtuko_tinklelis_3;
    private javax.swing.JPanel jMygtuko_tinklelis_4;
    private javax.swing.JPanel jMygtuko_tinklelis_5;
    private javax.swing.JPanel jMygtuko_tinklelis_6;
    private javax.swing.JPanel jMygtuko_tinklelis_7;
    private javax.swing.JPanel jMygtuko_tinklelis_8;
    private javax.swing.JPanel jMygtuko_tinklelis_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPradetiIsNaujo;
    private javax.swing.JLabel jTaskai;
    private javax.swing.JPanel jTinklelis;
    // End of variables declaration//GEN-END:variables
}
