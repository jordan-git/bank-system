/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

public class BankApplication extends javax.swing.JFrame {

    private static Bank bank = new Bank();
    private static MainPanel mainPanel = new MainPanel();
    private static StartupPanel startupPanel = new StartupPanel();
    private static CreateAccountPanel createAccountPanel = new CreateAccountPanel();
    private static ChangePinPanel changePinPanel = new ChangePinPanel();
    
    public BankApplication() {
        initComponents();
        startupPanel.setParent(this);
        mainPanel.setParent(this);
        createAccountPanel.setParent(this);
        changePinPanel.setParent(this);
        showStartupPanel();
    }
    
    public Bank getBank() {
        return bank;
    }
    
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    
    public StartupPanel getStartupPanel() {
        return startupPanel;
    }
    
    public CreateAccountPanel getCreateAccountPanel() {
        return createAccountPanel;
    }
    
    public ChangePinPanel getChangePinPanel() {
        return changePinPanel;
    }
    
    public void showStartupPanel() {
        add(startupPanel);
        pack();
        startupPanel.setSize(600, 500);
        startupPanel.setVisible(true);
    }

    public void hideStartupPanel() {
        startupPanel.setVisible(false);
        remove(startupPanel);
    }

    public void showCreateAccountPanel() {
        add(createAccountPanel);
        pack();
        createAccountPanel.setSize(600, 500);
        createAccountPanel.setVisible(true);
    }

    public void hideCreateAccountPanel() {
        createAccountPanel.setVisible(false);
        remove(createAccountPanel);
    }

    public void showMainPanel() {
        add(mainPanel);
        pack();
        mainPanel.setSize(600, 500);
        mainPanel.setVisible(true);
    }

    public void hideMainPanel() {
        mainPanel.setVisible(false);
        remove(mainPanel);
    }
    
    public void showChangePinPanel() {
        add(changePinPanel);
        pack();
        changePinPanel.setSize(600, 500);
        changePinPanel.setNewPin();
        changePinPanel.setVisible(true);
    }
    
    public void hideChangePinPanel() {
        changePinPanel.setVisible(false);
        remove(changePinPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BankApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
