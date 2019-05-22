package pki.certconverter;

import javax.swing.filechooser.FileFilter;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.chilkatsoft.*;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author hlrrabbi
 */
public class PemToPkcs12 extends javax.swing.JFrame implements FileChooser{

    /**
     * On instancie PemToPkcs12
     */
    public PemToPkcs12() {
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert Any Format + Private Key to PKCS#12");
        setLocation(new java.awt.Point(500, 125));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.textHighlight);
        jLabel1.setText("Conversion d'un certificat au format PEM, DER ou PKCS#7 en PKCS#12/PFX");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel2.setText("Choisir le certificat à convertir");

        jButton1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton1.setText("Choisir un fichier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel4.setText("Choisir la clé privée");

        jButton2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton2.setText("Choisir un fichier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton4.setText("Enregistrer le certificat");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton5.setText("<= Retour");
        jButton5.setToolTipText("Revenir à l'accueil pour choisir un type de conversion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton6.setText("Convertir");
        jButton6.setToolTipText("Lancez la conversion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPasswordField1.setToolTipText("");
        jPasswordField1.setActionCommand("<Not Set>");

        jLabel11.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel11.setText("Insérer un mot de passe pour le nouveau certificat pfx/p12 (optionnel)");

        jLabel12.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel12.setText("Choisir le répertoire de destination");

        jTextField1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jTextField1.setText("Aucun fichier selectionné");

        jTextField2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jTextField2.setText("Aucun fichier selectionné");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Sitka Small", 3, 10)); // NOI18N
        jTextField3.setText("* selectionnez /ou/ entrez  le nom du nouveau certificat *");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel3.setText("Mot de passe de la clé privée (laisser vide si aucun)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(2, 2, 2)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPasswordField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    FileFilter filter1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filter1 = new FileNameExtensionFilter("pem, crt, der, cer, p7b, p7c", 
                new String[] {"p7c","p7b","crt","cer","der","pem" });
        CertChooser(jTextField1, filter1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       filter1 = new FileNameExtensionFilter("pem, key, PKCS1, PKCS8, ", 
               new String[] {"key","pem","PKCS1","PKCS8" });
        CertChooser(jTextField2, filter1);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ext1=".pfx", ext2=".p12";
        SaveCert(jTextField3, ext1, ext2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ConvertToPfx();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void ConvertToPfx () {

	// On verifie que la librairie chilkatsoft a bien été configurée avant d'executer le code.

    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      JOptionPane.showMessageDialog(null, "Verifiez que la librairie chilkasoft a été configurée comme il se doit.\n", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
      System.exit(1);
    }
    //Création d'une variable capable de recevoir un certificat ou une clé privée.
	  CkCert anyCert = new CkCert();
	  CkPrivateKey privKey = new CkPrivateKey();

    // 1) On permet à l'utilisateur de charger un certificat de type (.cer, .der, .p7b, .pem, etc.)
	  
	  String cheminFichier=jTextField1.getText();
    	  boolean successLoad = anyCert.LoadFromFile(cheminFichier);
    if (successLoad != true) {
    	JOptionPane.showMessageDialog(null, "Verifiez qu'il s'agit bien d'un certificat conforme \n" +
                "ou que le chemin d'accès a été bien specifié.", "Erreur", JOptionPane.ERROR_MESSAGE);
    	//System.out.println(anyCert.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    // 2) On permet à l'utilisateur de charger sa clé privée de type (pkcs#8, pem, key, etc.) chiffrée ou pas avec un mot de passe
    
    String password=new String (jPasswordField1.getPassword());
    cheminFichier=jTextField2.getText();
    successLoad = privKey.LoadPkcs8EncryptedFile(cheminFichier,password);
    if (successLoad != true) {
    	JOptionPane.showMessageDialog(null, "Vérifiez que vous avez entré le bon mot de passe\n "
    			+ " ou que la clé privée selectionnée est conforme.", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);

        //System.out.println(privKey.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    //  On convertir le certificat en pem si tel n'est déja pas le cas.
    	anyCert.exportCertPem();

    //  On compare le certificat (clé publique) à sa clé publique
    successLoad = anyCert.SetPrivateKey(privKey);
    if (successLoad != true) {
    	JOptionPane.showMessageDialog(null, "La clé privée choisie ne correspond pas au certificat.", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
    	// System.out.println(anyCert.lastErrorText()); // à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    // On convertit anyCert et privKey en .pfx 
    String pfxPassword=new String (jPasswordField1.getPassword());
    String cheminEnreg =jTextField3.getText();
    successLoad = anyCert.ExportToPfxFile(cheminEnreg,pfxPassword,true);
    if (successLoad != true) {
    	JOptionPane.showMessageDialog(null,"Impossible d'acceder au chemin d'enregistrement specifié!" , 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        //System.out.println(anyCert.lastErrorText()); //à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    JOptionPane.showMessageDialog(null, "Opération effectuée avec succès");
  
}
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CertConverter cc = new CertConverter();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}