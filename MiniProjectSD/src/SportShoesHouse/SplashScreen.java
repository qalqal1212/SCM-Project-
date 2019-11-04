
package SportShoesHouse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgCircle = new SportShoesHouse.ProgressCircle();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout ProgCircleLayout = new javax.swing.GroupLayout(ProgCircle);
        ProgCircle.setLayout(ProgCircleLayout);
        ProgCircleLayout.setHorizontalGroup(
            ProgCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        ProgCircleLayout.setVerticalGroup(
            ProgCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        getContentPane().add(ProgCircle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setToolTipText("SSHIMS");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Authentic Shoes Inventory Management System");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 50));
        getContentPane().add(jLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 410));

        setSize(new java.awt.Dimension(539, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        MainPage mp = new MainPage();
        SplashScreen s = new SplashScreen();
        
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i= 0; i <= 100; i++)
                {
                    try
                    {
                        Thread.sleep(20);
                        if(i==100)
                        {
                            s.setVisible(false);
                            mp.setVisible(true);
                            dispose();
                        }
                    }
                    catch(InterruptedException ex)
                    {
                       Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);         
                    }
                    ProgCircle.RenderProgress(i);
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SportShoesHouse.ProgressCircle ProgCircle;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
