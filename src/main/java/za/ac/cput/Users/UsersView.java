/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Users;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mbuso Kotob's
 */
public class UsersView extends javax.swing.JFrame {

    UserDBOperations dbOperation = new UserDBOperations();
    
    /**
     * Creates new form Users
     */
    public UsersView()
    {
        initComponents();
        ImageIcon icon;
        icon = new ImageIcon("Logo/logos.jpg");
        this.setIconImage(icon.getImage());
        addDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateUserBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Name", "Email", "Cellphone", "UserType"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usersTable);
        if (usersTable.getColumnModel().getColumnCount() > 0)
        {
            usersTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            usersTable.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("User Management Area");

        updateUserBtn.setLabel("Update User");
        updateUserBtn.setName("updateUser"); // NOI18N
        updateUserBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateUserBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setText("Remove User");
        removeUserBtn.setName("removeUserBtn"); // NOI18N
        removeUserBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeUserBtnActionPerformed(evt);
            }
        });

        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addUserBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateUserBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeUserBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addGap(678, 678, 678)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUserBtn)
                    .addComponent(removeUserBtn)
                    .addComponent(addUserBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        pack();
    }

    private void addDataToTable()
    {
        DefaultTableModel model = (DefaultTableModel)usersTable.getModel();
        
        for(User userObj : dbOperation.getUsers())
        {
            model.addRow(new Object[]{
                userObj.getId(),
                userObj.getFirstName() + " " + userObj.getLastName(),
                userObj.getEmail(),
                userObj.getCellphone(),
                userObj.getUserType()
            });
        }    
    }
    
    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateUserBtnActionPerformed
    {//GEN-HEADEREND:event_updateUserBtnActionPerformed
        FetchUserView fetchUserView = new FetchUserView();
        fetchUserView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_removeUserBtnActionPerformed
    {//GEN-HEADEREND:event_removeUserBtnActionPerformed
        RemoveUserView removeUserView = new RemoveUserView();
        removeUserView.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_removeUserBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addUserBtnActionPerformed
    {//GEN-HEADEREND:event_addUserBtnActionPerformed
        // TODO add your handling code here:
        AddUserView addUserView = new AddUserView();
        addUserView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addUserBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.FlatLafLight");
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                System.out.println(info.getName());
                if ("FlatLafLight".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new UsersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
