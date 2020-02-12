/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trediecto.Debug;

import com.trediecto.CConsole;
import com.trediecto.Game.GameGraphics;

/**
 *
 * @author Zoran
 */
public class GameDebug extends javax.swing.JFrame
{

    /**
     * Creates new form GameDebug
     */
    public GameDebug()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Canvas1 = new com.trediecto.Debug.GameDebugUpdate();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                formKeyTyped(evt);
            }
        });

        Canvas1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                Canvas1KeyTyped(evt);
            }
        });

        menuBar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                menuBarKeyPressed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("Action");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Debug");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        CConsole.UpdateDebugGraphicsRunning = false;
        CConsole.UpdateDebugGraphics.stop();
        this.hide();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        CConsole.UpdateDebugGraphicsRunning = false;
        CConsole.UpdateDebugGraphics.stop();
        this.hide();
    }//GEN-LAST:event_formWindowClosing

    private void formKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyPressed
    {//GEN-HEADEREND:event_formKeyPressed
        GameGraphics.onKeyDown(evt.getKeyCode());
    }//GEN-LAST:event_formKeyPressed

    private void KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_KeyPressed
    {//GEN-HEADEREND:event_KeyPressed
        GameGraphics.onKeyDown(evt.getKeyCode());
    }//GEN-LAST:event_KeyPressed

    private void Canvas1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_Canvas1KeyTyped
    {//GEN-HEADEREND:event_Canvas1KeyTyped
        GameGraphics.onKeyDown(evt.getKeyCode());
    }//GEN-LAST:event_Canvas1KeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyTyped
    {//GEN-HEADEREND:event_formKeyTyped
        GameGraphics.onKeyDown(evt.getKeyCode());
    }//GEN-LAST:event_formKeyTyped

    private void menuBarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_menuBarKeyPressed
    {//GEN-HEADEREND:event_menuBarKeyPressed
        GameGraphics.onKeyDown(evt.getKeyCode());
    }//GEN-LAST:event_menuBarKeyPressed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GameDebug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GameDebug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GameDebug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GameDebug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GameDebug().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.trediecto.Debug.GameDebugUpdate Canvas1;
    public javax.swing.JMenu editMenu;
    public javax.swing.JMenuItem exitMenuItem;
    public javax.swing.JMenu fileMenu;
    public javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}