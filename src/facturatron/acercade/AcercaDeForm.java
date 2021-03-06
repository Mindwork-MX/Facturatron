package facturatron.acercade;

import java.util.Observable;
import java.util.Observer;

/**
 * Formulario que muestra los créditos.
 *
 * @author Ulises Estecche
 */
public class AcercaDeForm extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form AcercaDeForm
     */
    public AcercaDeForm() {
        initComponents();
    }

    @Override
    public void update(Observable o, Object arg) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblPhesusFacturatron = new javax.swing.JLabel();
        lblSoftwareGeneracion = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblDesarrolladores = new javax.swing.JLabel();
        lblPaulaMedina = new javax.swing.JLabel();
        lblMexicoPaula = new javax.swing.JLabel();
        lblMexicoOctavio = new javax.swing.JLabel();
        lblOctavioRuiz = new javax.swing.JLabel();
        lblSaulRomero = new javax.swing.JLabel();
        lblMexicoFlagSaul = new javax.swing.JLabel();
        lblVenezuelaUlises = new javax.swing.JLabel();
        lblUlisesEstecche = new javax.swing.JLabel();
        lblVersion1 = new javax.swing.JLabel();

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPhesusFacturatron.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        lblPhesusFacturatron.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhesusFacturatron.setText("Phesus Facturatron");
        pnlPrincipal.add(lblPhesusFacturatron, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 40));

        lblSoftwareGeneracion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblSoftwareGeneracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoftwareGeneracion.setText("Software de Generación de Comprobantes Fiscales Digitales");
        pnlPrincipal.add(lblSoftwareGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 20));

        lblVersion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("©Phesus '08-'14");
        pnlPrincipal.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 430, 20));

        lblDesarrolladores.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        lblDesarrolladores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrolladores.setText("Desarrolladores");
        pnlPrincipal.add(lblDesarrolladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 420, 40));

        lblPaulaMedina.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPaulaMedina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPaulaMedina.setText("Paula Medina Bello");
        pnlPrincipal.add(lblPaulaMedina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 200, -1));

        lblMexicoPaula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturatron/imagenes/BanderaMexico.png"))); // NOI18N
        pnlPrincipal.add(lblMexicoPaula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblMexicoOctavio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturatron/imagenes/BanderaMexico.png"))); // NOI18N
        pnlPrincipal.add(lblMexicoOctavio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblOctavioRuiz.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblOctavioRuiz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOctavioRuiz.setText("Octavio Ruiz Castillo");
        pnlPrincipal.add(lblOctavioRuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, -1));

        lblSaulRomero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblSaulRomero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaulRomero.setText("Saúl Romero Haro");
        pnlPrincipal.add(lblSaulRomero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, -1));

        lblMexicoFlagSaul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturatron/imagenes/BanderaMexico.png"))); // NOI18N
        pnlPrincipal.add(lblMexicoFlagSaul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblVenezuelaUlises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturatron/imagenes/BanderaVenezuela.png"))); // NOI18N
        pnlPrincipal.add(lblVenezuelaUlises, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblUlisesEstecche.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblUlisesEstecche.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUlisesEstecche.setText("Ulises D. Estecche I.");
        pnlPrincipal.add(lblUlisesEstecche, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, -1));

        lblVersion1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblVersion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion1.setText("Versión 1.7.0");
        pnlPrincipal.add(lblVersion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDesarrolladores;
    private javax.swing.JLabel lblMexicoFlagSaul;
    private javax.swing.JLabel lblMexicoOctavio;
    private javax.swing.JLabel lblMexicoPaula;
    private javax.swing.JLabel lblOctavioRuiz;
    private javax.swing.JLabel lblPaulaMedina;
    private javax.swing.JLabel lblPhesusFacturatron;
    private javax.swing.JLabel lblSaulRomero;
    private javax.swing.JLabel lblSoftwareGeneracion;
    private javax.swing.JLabel lblUlisesEstecche;
    private javax.swing.JLabel lblVenezuelaUlises;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel lblVersion1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

}
