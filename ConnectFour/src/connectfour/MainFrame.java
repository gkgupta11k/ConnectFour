package connectfour;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainFrame extends javax.swing.JFrame {

    private final static Integer Rows = 6;
    private final static Integer Columns = 7;
    private GridLocation[][] gameGrid;
    private Integer[] rowStart;
    private Player currentPlayer = Player.One;
    
    public MainFrame() {
        initComponents();
        gameGrid = new GridLocation[Rows][Columns];
        rowStart = new Integer[Columns];
        
        for(int i = 0; i < Rows; i++) {
            for(int j = 0; j < Columns; j++){
                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(204, 204, 204));
                label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                label.setOpaque(true);
                label.setText("" + i+ j);
                gameGridPanel.add(label);

                GridLocation gridLocation = new GridLocation(label);
                gameGrid[i][j] = gridLocation;
            }
        }
        
        for(int i = 0; i < Columns; i++) {
            rowStart[i] = Rows - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayPlayerPanel = new javax.swing.JPanel();
        gameGridPanel = new javax.swing.JPanel();
        columnOneButton = new javax.swing.JButton();
        columnTwoButton = new javax.swing.JButton();
        columnThreeButton = new javax.swing.JButton();
        columnFourButton = new javax.swing.JButton();
        columnFiveButton = new javax.swing.JButton();
        columnSixButton = new javax.swing.JButton();
        columnSevenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect 4");

        javax.swing.GroupLayout displayPlayerPanelLayout = new javax.swing.GroupLayout(displayPlayerPanel);
        displayPlayerPanel.setLayout(displayPlayerPanelLayout);
        displayPlayerPanelLayout.setHorizontalGroup(
            displayPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        displayPlayerPanelLayout.setVerticalGroup(
            displayPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(displayPlayerPanel, java.awt.BorderLayout.PAGE_START);

        gameGridPanel.setLayout(new java.awt.GridLayout(7, 7));

        columnOneButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnOneButton.setText("↓");
        columnOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnOneButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnOneButton);

        columnTwoButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnTwoButton.setText("↓");
        columnTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnTwoButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnTwoButton);

        columnThreeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnThreeButton.setText("↓");
        columnThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnThreeButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnThreeButton);

        columnFourButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnFourButton.setText("↓");
        columnFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnFourButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnFourButton);

        columnFiveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnFiveButton.setText("↓");
        columnFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnFiveButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnFiveButton);

        columnSixButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnSixButton.setText("↓");
        columnSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnSixButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnSixButton);

        columnSevenButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnSevenButton.setText("↓");
        columnSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnSevenButtonActionPerformed(evt);
            }
        });
        gameGridPanel.add(columnSevenButton);

        getContentPane().add(gameGridPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columnOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnOneButtonActionPerformed
        buttonAction(0, columnOneButton);
    }//GEN-LAST:event_columnOneButtonActionPerformed

    private void columnTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnTwoButtonActionPerformed
        buttonAction(1, columnTwoButton);
    }//GEN-LAST:event_columnTwoButtonActionPerformed

    private void columnThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnThreeButtonActionPerformed
        buttonAction(2, columnThreeButton);
    }//GEN-LAST:event_columnThreeButtonActionPerformed

    private void columnFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnFourButtonActionPerformed
        buttonAction(3, columnFourButton);
    }//GEN-LAST:event_columnFourButtonActionPerformed

    private void columnFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnFiveButtonActionPerformed
        buttonAction(4, columnFiveButton);
    }//GEN-LAST:event_columnFiveButtonActionPerformed

    private void columnSixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnSixButtonActionPerformed
        buttonAction(5, columnSixButton);
    }//GEN-LAST:event_columnSixButtonActionPerformed

    private void columnSevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnSevenButtonActionPerformed
        buttonAction(6, columnSevenButton);
    }//GEN-LAST:event_columnSevenButtonActionPerformed

    private void buttonAction(Integer row, JButton columnTopButton) {
        GridLocation gridLocation = this.gameGrid[this.rowStart[row]][row];
        JLabel label = gridLocation.getLabel();
        
        this.rowStart[row] -= 1;
        if(this.rowStart[row] < 0) {
            columnTopButton.setEnabled(false);
        }
        
        gridLocation.setPlayer(currentPlayer);
        
        if(currentPlayer == Player.One) {
            label.setBackground(Color.RED);
            currentPlayer = Player.Two;
        } else {
            label.setBackground(Color.BLUE);
            currentPlayer = Player.One;
        }
        
        checkForWinner();
    }
    
    private void checkForWinner() {
        if(isThereHorizontalWinner()) {
            System.out.println("THERE IS A WINNER");
        }
    }
    
    private boolean isThereVerticalWinner() {
        boolean isWinner = false;
        // 00 10 20 30
        // 10 20 30 40
        // 20 30 40 50
        
        // 01 11 21 31
        // 11 21 31 41
        // 21 31 41 51
        
        //....
        
        for(int i = 0; i < Columns; i++) {
            for(int j = 0; j < 3; j++) {
                if(areGridLocationPlayersEqual(
                    gameGrid[j][i], 
                    gameGrid[j+1][i],
                    gameGrid[j+2][i],
                    gameGrid[j+3][i])) 
                {
                    isWinner = true;
                }
            }
        }
        
        return isWinner;
    }
    
    private boolean isThereHorizontalWinner() {
        boolean isWinner = false;
        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
        // 40 41 42 43
        // 50 51 52 53
        // 60 61 62 63
        
        // 01 02 03 04
        // 11 12 13 14
        //....
        
        // 03 04 05 06
        // 13 14 15 16
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < Rows; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.println("ijk = " + i + j + k);
                    if(areGridLocationPlayersEqual(
                    gameGrid[j][k + i], 
                    gameGrid[j][k + i + 1],
                    gameGrid[j][k + i + 2],
                    gameGrid[j][k + i + 3])) 
                {
                    isWinner = true;
                }
                }
            }
        }
         for(int i = 0; i < 4; i++) {
            for(int j = 0; j < Rows; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.println("ijk = " + i + j + k);
                    if(areGridLocationPlayersEqual(
                    gameGrid[j][k + i+10], 
                    gameGrid[j][k + i + 11],
                    gameGrid[j][k + i + 12],
                    gameGrid[j][k + i + 13])) 
                {
                    isWinner = true;
                }
                }
            }
        }
          for(int i = 0; i < 4; i++) {
            for(int j = 0; j < Rows; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.println("ijk = " + i + j + k);
                    if(areGridLocationPlayersEqual(
                    gameGrid[j][k + i+20], 
                    gameGrid[j][k + i + 21],
                    gameGrid[j][k + i + 22],
                    gameGrid[j][k + i + 23])) 
                {
                    isWinner = true;
                }
                }
            }
        }
           for(int i = 0; i < 4; i++) {
            for(int j = 0; j < Rows; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.println("ijk = " + i + j + k);
                    if(areGridLocationPlayersEqual(
                    gameGrid[j][k + i+30], 
                    gameGrid[j][k + i + 31],
                    gameGrid[j][k + i + 32],
                    gameGrid[j][k + i + 33])) 
                {
                    isWinner = true;
                }
                }
            }
        }
        
        return isWinner;
    }
    
    private boolean areGridLocationPlayersEqual(GridLocation... gridLocations) {
        boolean equal = true;
        
        // 0 = ONE 1 = NULL 2 = ONE 3 = ONE
        
        for(int i = 1; i < gridLocations.length; i++) {
            if(gridLocations[0].getPlayer() == null || 
               gridLocations[0].getPlayer() != gridLocations[i].getPlayer()) {
                equal = false;
                break;
            }
        }
        
        return equal;
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton columnFiveButton;
    private javax.swing.JButton columnFourButton;
    private javax.swing.JButton columnOneButton;
    private javax.swing.JButton columnSevenButton;
    private javax.swing.JButton columnSixButton;
    private javax.swing.JButton columnThreeButton;
    private javax.swing.JButton columnTwoButton;
    private javax.swing.JPanel displayPlayerPanel;
    private javax.swing.JPanel gameGridPanel;
    // End of variables declaration//GEN-END:variables
}
