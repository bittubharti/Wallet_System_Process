
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;


@SuppressWarnings("serial")
public class Dashboard extends javax.swing.JFrame {

	Map<String,String> order=new HashMap<String,String>();
	
	Wallet wallet=new Wallet();
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("My Wallet");
        
      
               
        
                
        jButton1.getColorModel();
        jButton1.setBackground(Color.pink);
        
        jButton2.setBackground(Color.orange);
        jButton3.setBackground(Color.pink);
        jButton4.setBackground(Color.orange);
        jButton5.setBackground(Color.pink);  
        
        
      
        jLabel1.setFont(new Font("", Font.BOLD, 20));
        jLabel1.setForeground(Color.black);
                
        jLabel2.setFont(new Font("", Font.BOLD, 15));
        jLabel2.setForeground(Color.black);
        
        jLabel3.setFont(new Font("", Font.BOLD, 15));
        jLabel3.setForeground(Color.black);
        
        jLabel4.setFont(new Font("", Font.BOLD, 15));
        jLabel4.setForeground(Color.black);
        
        jLabel5.setFont(new Font("", Font.BOLD, 15));
        jLabel5.setForeground(Color.black);
        
        jLabel6.setFont(new Font("", Font.BOLD, 15));
        jLabel6.setForeground(Color.black);
        
        
        
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
       
       
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
            
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
      
        jLabel6 = new javax.swing.JLabel();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Your phone and wallet are trying to have a beautiful baby!");
        
        jLabel2.setText("1. Create user-->  < Enter <User Name >");
        
        jLabel3.setText("2. Add Card To User-->  Enter <User Name> and  <Card_number>");
        
        jLabel4.setText("3. Pay--> Enter  <Payer_Name>,  <Payee>,  <Amount>,  <Note>");  
        
        jLabel5.setText("4. Check Balance--> Enter  <User Name > ");
        
        jLabel6.setText("5. Feed--> Enter  <User Name > ");
        
        jButton1.setText("Create User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Card To User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        jButton3.setText("Pay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton4.setText("Check Balance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        
        jButton5.setText("Feed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        }); 
      

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            		.addGap(50, 50, 50)	
            		
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(20,20,20)
                        .addComponent(jButton4)
                        .addGap(20,20,20)
                        .addComponent(jButton5)
                        .addGap(20,20,20)
                        
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            
                           )
                    
                        
                                      
                                
                            )
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        		
                                        
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            ))
                    
                    
                    .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                
                               
                            		))
                                    
                    
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            
                            
                            
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        		))
                   
                    .addGroup(layout.createSequentialGroup()
                    		 
                                                                                                   		
                    		))
                
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)));
       
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            		
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                		
                    .addGroup(layout.createSequentialGroup()
                    		.addGap(30, 30, 30)
                    		.addComponent(jLabel1)
                            
                    		.addGap(60, 60, 60)
                    		             		
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            
                            
                            .addGap(100, 100, 100)
                            
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            
                        
                        
                        )
                        )
                    
                    .addGroup(layout.createSequentialGroup()
                    		.addGroup(layout.createSequentialGroup()
                    				
                    	.addGap(110, 110, 110)	
                    				
                    				
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                
                   
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    
                    )
                		
                		
                		
                		)
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    
                    .addGap(100, 100, 100)
                    
                    
                   )
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	String user=jTextField1.getText();
    wallet.createUser(user);
    //	add(a);
    	
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    		 
    	String usr = jTextField1.getText();
        String card_number = jTextField2.getText();

	wallet.add(usr, card_number);
     	 
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
  
    	String payer = jTextField1.getText();
    	String payee = jTextField2.getText();
    	String amount = jTextField3.getText();
    	String note = jTextField4.getText();
    	
    	wallet.pay(payer, payee, amount, note);
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	String Balance=jTextField1.getText();
    	wallet.balanceUser(Balance);
        
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	String feed=jTextField1.getText();
    	wallet.feed(feed);
        
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    
    private javax.swing.JPanel jPanel1;
    
    private javax.swing.JTextField jTextField1;
   
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
   
   
    // End of variables declaration//GEN-END:variables
}
