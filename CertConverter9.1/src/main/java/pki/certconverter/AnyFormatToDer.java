package pki.certconverter;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.chilkatsoft.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author hlrrabbi
 */
public class AnyFormatToDer extends javax.swing.JFrame implements FileChooser{

    /**
     * Creates new form AnyFormatToDer
     */
    public AnyFormatToDer() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("logo_certconvert.png");
        this.setIconImage(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert Any Format to Der");
        setLocation(new java.awt.Point(500, 125));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.textHighlight);
        jLabel1.setText("Conversion d'un certificat au format PEM ou PKCS#7 en DER");

        jButton1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton1.setText("Choisir un fichier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel2.setText("Choisir le certificat à convertir");

        jButton2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton2.setText("Enregistrer le certificat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton3.setText("<=Retour");
        jButton3.setToolTipText("Revenir à l'accueil pour choisir un type de conversion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton4.setText("Convertir");
        jButton4.setToolTipText("Lancez la conversion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel5.setText("Choisir le répertoire d'enregistrement");

        jTextField1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jTextField1.setText("Aucun fichier selectionné");

        jTextField2.setFont(new java.awt.Font("Sitka Small", 3, 10)); // NOI18N
        jTextField2.setText("* selectionnez /ou/ entrez  le nom du nouveau certificat *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel5)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addGap(2, 2, 2)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    //Creation d'une action sur le bouton retour;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        CertConverter cc = new CertConverter();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //creation d'une action pour effectuer la conversion
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConvertToDer();
  
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //class pour effectuer la conversion en der
    private void ConvertToDer() {

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
    successLoad = anyCert.ExportCertDerFile(enregistre);
    //Si le repertoire est mal renseigné ou inaccessible alors on renvoie un message d'erreur.
    if (successLoad != true) {    	
        JOptionPane.showMessageDialog(null, "Impossible d'enregistrer le nouveau certificat à l'endroit indiqué.\n", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        //System.out.println(anyCert.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    JOptionPane.showMessageDialog(null, "Votre certificat est maintenant au format DER!");
  
}
    
    //Création d'une action pour charger un certificat depuis son ordinateur
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileFilter filter1 = new FileNameExtensionFilter("pem, crt, p7b, p7c ", new String[] { "pem","crt","p7b", "p7c" });
        CertChooser(jTextField1, filter1);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Creation d'une action pour enregistrer le nouveau certificat dans la machine 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ext1=".der", ext2=".cer";
        SaveCert(jTextField2, ext1, ext2);
    }//GEN-LAST:event_jButton2ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
