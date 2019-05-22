package pki.certconverter;

import com.chilkatsoft.CkPfx;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author hlrrabbi
 */
public class Pkcs12ToPem extends javax.swing.JFrame implements FileChooser{

    /**
     * On instancie Pkcs12ToPem
     */
    public Pkcs12ToPem() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("logo_certconvert.png");
        this.setIconImage(icon);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert PKCS#12 to Pem");
        setLocation(new java.awt.Point(500, 125));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.textHighlight);
        jLabel1.setText("Conversion d'un certificat au  format PFX/P12 en PEM");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel2.setText("Choisir le certificat à convertir");

        jButton1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton1.setText("Choisir un fichier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton2.setText("Enregistrer le certificat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton3.setText("Convertir");
        jButton3.setToolTipText("Lancez la conversion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton4.setText("<= Retour");
        jButton4.setToolTipText("Revenir à l'accueil pour choisir un type de conversion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel6.setText("Mot de passe du certificat (laisser vide si aucun)");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel7.setText("Choisir le répertoire de destination");

        jTextField1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jTextField1.setText("Aucun fichier selectionné");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Sitka Small", 3, 10)); // NOI18N
        jTextField2.setText("* selectionnez /ou/ entrez  le nom du nouveau certificat *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    FileFilter filter1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filter1 = new FileNameExtensionFilter("pfx, p12", new String[] { "pfx","p12" });
        CertChooser(jTextField1, filter1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ext1=".pem", ext2=".crt";
        SaveCert(jTextField2, ext1, ext2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConvertPfxtoPem();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ConvertPfxtoPem () {
	// On verifie que la librairie chilkatsoft a bien été configurée avant d'executer le code.
  
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      JOptionPane.showMessageDialog(null, "Verifiez que la librairie chilkasoft a été configurée comme il se doit.\n", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
      System.exit(1);
    }
  

    CkPfx certPfx = new CkPfx(); //Création d'une variable capable de recevoir un certificat pfx/p12.

    String pfxPassword=new String (jPasswordField1.getPassword());
    String cheminFichier=jTextField1.getText();
    boolean successLoad = certPfx.LoadPfxFile(cheminFichier,pfxPassword);
    if (successLoad != true) {
        JOptionPane.showMessageDialog(null, "Certificat pfx/p12 erroné / mot de passe incorrect / "
                + "chemin d'accès inaccessible.", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
    	//System.out.println(certPfx.lastErrorText()); //à ajouter dans les log pour plus de details sur l'erreur.
        return;
        }

    //on convertit et on export le tout dans un fichier choisir par l'utilisateur ou par defaut dans le repertoire de l'appli
    String strPem = certPfx.toPem(); 
    String cheminEnreg=jTextField2.getText();
    File f = new File(cheminEnreg);
    try {
		FileWriter fw= new FileWriter(f);
		fw.write(strPem);
		fw.close();
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Impossible d'acceder au repertoire d'enregistrement"
                + "chemin d'accès inaccessible.", 
                    "Erreur", JOptionPane.ERROR_MESSAGE);
		//e.printStackTrace();
	}            
            if (f.length() != 0)
            JOptionPane.showMessageDialog(null, "Conversion effectuée avec succès!");    
}
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CertConverter cc = new CertConverter();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
