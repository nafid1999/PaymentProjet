/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import java.awt.Dimension;

/**
 *
 * @author amine
 */
public class PaymentCardView extends javax.swing.JFrame {

    /**
     * Creates new form PayemntCardView
     */
    public PaymentCardView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p_container = new javax.swing.JPanel();
        p_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p_card = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        card_number = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        ref_facture = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        payer = new javax.swing.JButton();
        
        /*
         * @set the Controller
         **/ 
        PaymentController controller=new PaymentController(this);
        
        payer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(card_number.getText().equals("Numero De Payment De Carte") || cvv.getText().equals("CVV")|| ref_facture.getText().equals("R�f�rence de Facture")
            	   || date.getText().equals("mm-yyyy")) {
        	        card_number.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));
        	        date.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));
        	        cvv.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));
        	        ref_facture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));
            			JOptionPane.showMessageDialog(jPanel1,"You have To fill in all the fields","Error",JOptionPane.ERROR_MESSAGE);
            		}else {
            			try {
							controller.loadNumber(card_number.getText(),cvv.getText(), date.getText(), ref_facture.getText());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
            			
            			
            		}
            		
        	}
        });
        
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_header.setBackground(new java.awt.Color(236, 243, 251));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOUKIPAY");
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\amine\\Desktop\\Webp.net-resizeimage (2).png"));

        javax.swing.GroupLayout p_headerLayout = new javax.swing.GroupLayout(p_header);
        p_headerLayout.setHorizontalGroup(
        	p_headerLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(p_headerLayout.createSequentialGroup()
        			.addGap(363)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(396, Short.MAX_VALUE))
        );
        p_headerLayout.setVerticalGroup(
        	p_headerLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(p_headerLayout.createSequentialGroup()
        			.addGroup(p_headerLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(p_headerLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        				.addComponent(jLabel1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        p_header.setLayout(p_headerLayout);

        p_card.setBackground(new java.awt.Color(236, 243, 251));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Payment Facture Par Carte Bancaire");

        card_number.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        card_number.setForeground(new java.awt.Color(149, 165, 166));
        card_number.setText("Numero De Payment De Carte");
        card_number.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        card_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                card_numberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                card_numberFocusLost(evt);
            }
        });
        card_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_numberMouseClicked(evt);
            }
        });
        card_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_numberActionPerformed(evt);
            }
        });

        cvv.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        cvv.setForeground(new java.awt.Color(149, 165, 166));
        cvv.setText("CVV");
        cvv.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cvv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cvvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cvvFocusLost(evt);
            }
        });
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        ref_facture.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        ref_facture.setForeground(new java.awt.Color(149, 165, 166));
        ref_facture.setText("R�f�rence de Facture");
        ref_facture.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ref_facture.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ref_factureFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ref_factureFocusLost(evt);
            }
        });
        ref_facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_factureActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(149, 165, 166));
        date.setText("mm-yyyy");
        date.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFocusLost(evt);
            }
        });
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        payer.setBackground(new java.awt.Color(41, 128, 185));
        payer.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        payer.setForeground(new java.awt.Color(255, 255, 255));
        payer.setText("Payer");
        payer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\amine\\Desktop\\Webp.net-resizeimage (1).png"));

        javax.swing.GroupLayout p_cardLayout = new javax.swing.GroupLayout(p_card);
        p_cardLayout.setHorizontalGroup(
        	p_cardLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(p_cardLayout.createSequentialGroup()
        			.addGap(375)
        			.addComponent(payer, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(396, Short.MAX_VALUE))
        		.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        		.addGroup(p_cardLayout.createSequentialGroup()
        			.addGap(409)
        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(470, Short.MAX_VALUE))
        		.addGroup(p_cardLayout.createSequentialGroup()
        			.addGap(176)
        			.addGroup(p_cardLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(card_number, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        				.addGroup(p_cardLayout.createSequentialGroup()
        					.addComponent(date, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(cvv, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(ref_facture, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        			.addGap(207))
        );
        p_cardLayout.setVerticalGroup(
        	p_cardLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(p_cardLayout.createSequentialGroup()
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(lblNewLabel_1)
        			.addGap(31)
        			.addComponent(card_number, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        			.addGroup(p_cardLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(date, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cvv, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addGap(44)
        			.addComponent(ref_facture, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        			.addComponent(payer, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(41))
        );
        p_card.setLayout(p_cardLayout);

        javax.swing.GroupLayout p_containerLayout = new javax.swing.GroupLayout(p_container);
        p_containerLayout.setHorizontalGroup(
        	p_containerLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(p_header, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addComponent(p_card, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_containerLayout.setVerticalGroup(
        	p_containerLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(p_containerLayout.createSequentialGroup()
        			.addComponent(p_header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(p_card, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );
        p_container.setLayout(p_containerLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new Dimension(945, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void card_numberFocusGained(java.awt.event.FocusEvent evt) {                                        
       
    }                                       

    private void card_numberFocusLost(java.awt.event.FocusEvent evt) {                                      
        card_number.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        if(card_number.getText().equals("")){
            card_number.setText("Numero De Payment De Carte");
            card_number.setForeground(new java.awt.Color(149,165,166));
        }
        if(!card_number.getText().equals("") && !card_number.getText().equals("Numero De Payment De Carte") )
        {
        	final String  regex = "((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])";
 		     Pattern pattern = Pattern.compile(regex);
 		     Matcher matcher = pattern.matcher(card_number.getText());
            if(!matcher.matches()) {
    	        card_number.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));
    			JOptionPane.showMessageDialog(jPanel1,"Card Number Not Valid","Error",JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }                                     

    private void card_numberActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void cvvFocusGained(java.awt.event.FocusEvent evt) {                                
        if(cvv.getText().equals("CVV")){
            cvv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9,132, 227), 1, true));

            cvv.setText("");
            cvv.setForeground(new java.awt.Color(20, 106, 168));
        }
    }                               

    private void cvvFocusLost(java.awt.event.FocusEvent evt) {                              
        cvv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        if(cvv.getText().equals("")){
            cvv.setText("CVV");
            cvv.setForeground(new java.awt.Color(149,165,166));
        }
        if(!cvv.getText().equals("") && !cvv.getText().equals("CVV") )
        {
        	final String  regex = "[0-9]{3}"; 
 		     Pattern pattern = Pattern.compile(regex);
 		     Matcher matcher = pattern.matcher(cvv.getText());
            if(!matcher.matches()) {
    	        cvv.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));

    			JOptionPane.showMessageDialog(jPanel1,"cvv not valid","Error",JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }                             

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void ref_factureFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        if(ref_facture.getText().equals("R�f�rence de Facture")){
            ref_facture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9,132, 227), 1, true));

            ref_facture.setText("");
           ref_facture.setForeground(new java.awt.Color(20, 106, 168));
        }
       
    }                                       

    private void ref_factureFocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
         ref_facture.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

         if(ref_facture.getText().equals("")){
            ref_facture.setText("R�f�rence de Facture");
            ref_facture.setForeground(new java.awt.Color(149,165,166));
        }  
         
         if(!ref_facture.getText().equals("") && !ref_facture.getText().equals("R�f�rence de Facture") )
        {
        	final String  regex = "[0-9]+"; 
 		     Pattern pattern = Pattern.compile(regex);
 		     Matcher matcher = pattern.matcher(ref_facture.getText());
            if(!matcher.matches()) {
            	ref_facture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));

    			JOptionPane.showMessageDialog(jPanel1,"R�f�rence invalide !","Error",JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }                                     

    private void ref_factureActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void dateFocusGained(java.awt.event.FocusEvent evt) {                                 
        if(date.getText().equals("mm-yyyy")){
            date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9,132, 227), 1, true));

            date.setText("");
            date.setForeground(new java.awt.Color(20, 106, 168));
        }

       
        // TODO add your handling code here:
    }                                

    private void dateFocusLost(java.awt.event.FocusEvent evt) {                               
        // TODO add your handling code here:
         date.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

         if(date.getText().equals("")){
            date.setText("mm-yyyy");
            date.setForeground(new java.awt.Color(149,165,166));
        }  
         if(!date.getText().equals("") && !date.getText().equals("mm-yyyy") )
         {
         	final String  regex = "(0?[1-9]|1[0-2])[-]?(?:19|20)[0-9]{2}";
  		     Pattern pattern = Pattern.compile(regex);
  		     Matcher matcher = pattern.matcher(date.getText());
             if(!matcher.matches()) {
     	        date.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(187,33,36)));

     			JOptionPane.showMessageDialog(jPanel1,"Date Not Valide","Error",JOptionPane.INFORMATION_MESSAGE);

             }
         }
    }                              

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void card_numberMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
         if(card_number.getText().equals("Numero De Payment De Carte")){
            card_number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9,132, 227), 1, true));

            card_number.setText("");
            card_number.setForeground(new java.awt.Color(20, 106, 168));
        }
    }                                        

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
            java.util.logging.Logger.getLogger(PaymentCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentCardView().setVisible(true);
            }
        });
    }
    
    // Erroor Message
    public void setErrorMessage(String errorMessage) {
        // lblErrorMessage.setText(errorMessage);
     	JOptionPane.showMessageDialog(jPanel1, errorMessage,"Error",JOptionPane.WARNING_MESSAGE);
     }
    
    public void setSuccesMessage(String succesMessage) {
        // lblErrorMessage.setText(errorMessage);
     	JOptionPane.showMessageDialog(jPanel1,succesMessage ,"Succes",JOptionPane.INFORMATION_MESSAGE);
     }


    // Variables declaration - do not modify                     
    private javax.swing.JTextField card_number;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel p_card;
    private javax.swing.JPanel p_container;
    private javax.swing.JPanel p_header;
    private javax.swing.JButton payer;
    private javax.swing.JTextField ref_facture;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    // End of variables declaration                   
}
