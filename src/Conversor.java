import java.awt.Image;
import java.awt.Toolkit;

/**
 * link al tutorial: 
 * ://www.youtube.com/watch?v=vsRTJbHWkSc&list=TLPQMTMxMTIwMjLoBzdyJvAnqA&indexhttps=6
 * @author leo_t
 */
public class Conversor extends javax.swing.JFrame {
 double cantidad = 0;
        double conversion = 0;
        String de ="Peso Arg";
        String a = "USD";
    public Conversor() {
       
        initComponents();
        this.setTitle("Conversor de Divisas");
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/divisas.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }
    public String conversor(double cantidad, String moneda){
        return "$"+Math.round(cantidad*100.0)/100.0+" "+moneda;
    }
    
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        cantidadSlider = new javax.swing.JSlider();
        cantidadResult = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradaDivisa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        salidaDivisa = new javax.swing.JComboBox<>();
        resultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CANTIDAD");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, 40));

        cantidadSlider.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        cantidadSlider.setMajorTickSpacing(1);
        cantidadSlider.setMinimum(1);
        cantidadSlider.setPaintTicks(true);
        cantidadSlider.setToolTipText("");
        cantidadSlider.setValue(1);
        cantidadSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadSliderStateChanged(evt);
            }
        });
        add(cantidadSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 630, 50));

        cantidadResult.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        cantidadResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadResult.setText("1");
        cantidadResult.setToolTipText("");
        add(cantidadResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 170, 50));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DE");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 40));

        entradaDivisa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        entradaDivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arg", "Eur", "USD", "Btc" }));
        entradaDivisa.setToolTipText("");
        entradaDivisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        entradaDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaDivisaActionPerformed(evt);
            }
        });
        add(entradaDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A");
        jLabel4.setToolTipText("");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 40, 40));

        salidaDivisa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        salidaDivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arg", "Eur", "USD", "Btc" }));
        salidaDivisa.setToolTipText("");
        salidaDivisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salidaDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salidaDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaDivisaActionPerformed(evt);
            }
        });
        add(salidaDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 170, -1));

        resultado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setToolTipText("");
        resultado.setAlignmentY(0.0F);
        add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 590, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("By Leonel Toloza");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void entradaDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaDivisaActionPerformed
        de=entradaDivisa.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_entradaDivisaActionPerformed

    private void salidaDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaDivisaActionPerformed
        a=salidaDivisa.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_salidaDivisaActionPerformed

    private void cantidadSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadSliderStateChanged
       cantidad = cantidadSlider.getValue();
    cantidadResult.setText(""+cantidad);
    convertir();
    }//GEN-LAST:event_cantidadSliderStateChanged
public void convertir(){
    switch (de){
        case "Eur":
            if (a.equalsIgnoreCase("USD")) {
                conversion=cantidad * 1.04;
            }else if (a.equalsIgnoreCase("arg")) {
                conversion = cantidad * 165.0;
            }else if (a.equalsIgnoreCase("btc")) {
                conversion = cantidad * 0.000063;
            }else {conversion = cantidad;}
            break;
            case "USD":
            if (a.equalsIgnoreCase("eur")) {
                conversion=cantidad * 0.96;
            }else if (a.equalsIgnoreCase("arg")) {
                conversion = cantidad *289.0;
            }else if (a.equalsIgnoreCase("btc")) {
                conversion = cantidad * 0.000060;
            }else {conversion = cantidad;}
            break;
            
            case "Arg":
            if (a.equalsIgnoreCase("USD")) {
                conversion=cantidad * 289.0;
            }else if (a.equalsIgnoreCase("eur")) {
                conversion = cantidad * 0.0061;
            }else if (a.equalsIgnoreCase("btc")) {
                conversion = cantidad * 0.0000038;
            }else {conversion = cantidad;}
            break;
            
            case "Btc":
            if (a.equalsIgnoreCase("USD")) {
                conversion=cantidad *16521.50;
            }else if (a.equalsIgnoreCase("arg")) {
                conversion = cantidad * 2629155.51;
            }else if (a.equalsIgnoreCase("eur")) {
                conversion = cantidad * 15927.55;
            }else {conversion = cantidad;}
            break;
    }
        resultado.setText(conversor(cantidad,de)+"-> "+conversor(conversion, a));
}
    
    
    public static void main(String args[]){
    java.awt.EventQueue.invokeLater(() -> {
        new Conversor().setVisible(true);
    });

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadResult;
    private javax.swing.JSlider cantidadSlider;
    private javax.swing.JComboBox<String> entradaDivisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel resultado;
    private javax.swing.JComboBox<String> salidaDivisa;
    // End of variables declaration//GEN-END:variables
}
