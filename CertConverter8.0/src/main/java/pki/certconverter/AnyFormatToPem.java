
package pki.certconverter;

import com.chilkatsoft.CkCert;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hlrrabbi
 */
public class AnyFormatToPem extends javax.swing.JFrame {

    /**
     * Creates new form AnyFormatToPem
     */
    public AnyFormatToPem() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("logo_certconvert.png");
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert Any Format to Pem");
        setLocation(new java.awt.Point(500, 125));

        jLabel1.setText("Conversion d'un format de certificat DER OU PKCS#7  en PEM");

        jLabel2.setText("Choisir le certificat à convertir");

        jButton1.setText("Choisir un fichier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Choisir le dossier de destination");

        jButton2.setText("Enregistrer le certificat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Convertir");
        jButton3.setToolTipText("Lancez la conversion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<= Retour");
        jButton4.setToolTipText("Revenir en arrière");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setText("Aucun fichier selectionné");

        jTextField2.setText("Aucun repertoire selectionné");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Création d'une action pour charger un certificat depuis son ordinateur
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileFilter filter1 = new FileNameExtensionFilter("der, cer, p7b, p7c ", new String[] { "der","cer","p7b", "p7c" });
        JFileChooser choisirFichier = new JFileChooser();
        choisirFichier.setFileFilter(filter1);
        choisirFichier.setDialogTitle("Selectionnez un certificat");
        if (choisirFichier.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        File f=choisirFichier.getSelectedFile();
        String chemin= f.getAbsolutePath();
        jTextField1.setText(chemin);} else {
        jTextField1.setText("Aucun fichier selectionné");}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser choisirDossier = new JFileChooser();
       //choisirDossier.setCurrentDirectory(new java.io.File("."));
       choisirDossier.setDialogTitle("Choisissez un dossier pour enregistrer votre nouveau certificat");
       choisirDossier.setFileSelectionMode(JFileChooser.FILES_ONLY);
       if (choisirDossier.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
       	String filename = choisirDossier.getSelectedFile().toString();
       	   if (!filename .endsWith(".pem") &&  !filename .endsWith(".crt"))
       	        filename += ".pem";
           jTextField2.setText(filename);
   } else {
     jTextField2.setText("Aucun fichier selectionné");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                ToPem();
 
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //class pour effectuer la conversion en pem
    private void ToPem () {

	// On verifie que la librairie chilkatsoft a bien été configurée avant d'executer le code.
	
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      JOptionPane.showMessageDialog(null, "Verifiez que la librairie chilkasoft a été configurée comme il se doit.\n", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
      System.exit(1);
      } 
 
    CkCert anyCert = new CkCert();
    boolean successLoad;
    
  //Ici on charge n'importe quel type de certificat, le format sera détecté automatiquement.
    /*NB: un certificat au format pfx/p12 sera bien pris en compte mais n'aura 	pas le résultat escompté. 
     * une autre méthode de conversion existe pour la circonstance*/

    // L'utilisateur entre le chemin absolu du certificat à convertir
    String cheminFichier=jTextField1.getText();
    successLoad = anyCert.LoadFromFile(cheminFichier);
    
    // Si le certificat ou le chemin d'accès renseigné est erroné alors on affiche un message d'erreur.
    if (successLoad != true) {
    	JOptionPane.showMessageDialog(null, "Verifiez que votre certificat est conforme\n"
    			+ "ou que le chemin d'accès est accessible!.", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        //System.out.println(anyCert.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }
    //sinon on passe à la conversion     
    String enregistre=jTextField2.getText();
    successLoad = anyCert.ExportCertPemFile(enregistre);
    //Si le repertoire est mal renseigné ou inaccessible alors on renvoie un message d'erreur.
    if (successLoad != true) {    	
        JOptionPane.showMessageDialog(null, "Impossible d'enregistrer le nouveau certificat à l'endroit indiqué.\n", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        //System.out.println(anyCert.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    JOptionPane.showMessageDialog(null, "Conversion effectuée avec succès!");
  
}
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CertConverter cc = new CertConverter();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnyFormatToPem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnyFormatToPem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnyFormatToPem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnyFormatToPem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnyFormatToPem().setVisible(false);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
