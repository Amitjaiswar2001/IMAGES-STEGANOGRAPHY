/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Coding;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Amitj
 */
public class Encode_Frame extends javax.swing.JFrame {
BufferedImage sourceImage = null,EmbeddedImage=null;
    private double location;

    /**
     * Creates new form Encode_Frame
     */
    public Encode_Frame() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelSourceImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelEmbedded = new javax.swing.JLabel();
        jButtonOpen = new javax.swing.JButton();
        jButtonEmbed = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DECRYPTION OF MESSAGE.");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Message"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextMessage.setColumns(20);
        jTextMessage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SourceImage"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSourceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelSourceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 380, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("EmbeddedImage"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmbedded, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelEmbedded, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 370, 270));

        jButtonOpen.setBackground(new java.awt.Color(51, 0, 51));
        jButtonOpen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOpen.setText("Open");
        jButtonOpen.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 534, 93, 38));

        jButtonEmbed.setBackground(new java.awt.Color(51, 0, 51));
        jButtonEmbed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEmbed.setText("Embed");
        jButtonEmbed.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButtonEmbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmbedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 534, 92, 38));

        jButtonSave.setBackground(new java.awt.Color(51, 0, 51));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 534, 100, 38));

        jButtonReset.setBackground(new java.awt.Color(51, 0, 51));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 534, 98, 38));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private File showFileDialog(final boolean open){
    JFileChooser fc = new JFileChooser("open an image");
    
    FileFilter filefilter = new FileFilter(){
     @Override
        public boolean accept(File file) {
           String  name = file.getName().toLowerCase();
           if(open)
               return file.isDirectory()||name.endsWith(".jpg")||name.endsWith(".jpeg")||name.endsWith(".png")||name.endsWith(".bmp");
           return file.isDirectory()|| name.endsWith(".png")||name.endsWith(".bmp");
        }
     @Override
        public String getDescription(){
        if(open)
            return "Image (*.jpg,*.jpeg,*.png,*.bmp)";
        return "Image (*.png,*.bmp)";
        }
    };
    fc.setAcceptAllFileFilterUsed(false);
    fc.addChoosableFileFilter(filefilter);
    
    File file = null;
    if(open && fc.showOpenDialog(this)==fc.APPROVE_OPTION)
        file = fc.getSelectedFile();
    else if(!open && fc.showSaveDialog(this)==fc.APPROVE_OPTION)
        file = fc.getSelectedFile();
    return file;
}

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        File file = showFileDialog(true);
       if(file == null){
       return;
       } 
    try {
        sourceImage = ImageIO.read(file);
        jLabelSourceImage.setIcon(new ImageIcon(sourceImage));
        this.validate();
    } catch (IOException ex) {   
    }    
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonEmbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmbedActionPerformed
       if(jTextMessage.equals("")||sourceImage==null){
       JOptionPane.showMessageDialog(this,"no message has been embedded","no picture or message found",JOptionPane.ERROR_MESSAGE);
       return;
       }
       String Message = jTextMessage.getText();
       EmbeddedImage = sourceImage.getSubimage(0,0,
               sourceImage.getWidth(),sourceImage.getHeight());
       embeddedMessage(EmbeddedImage,Message);
       
       jLabelEmbedded.setIcon(new ImageIcon(EmbeddedImage));
       this.validate();
       
    }//GEN-LAST:event_jButtonEmbedActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
       jTextMessage.setText("");
       sourceImage = null;
       EmbeddedImage = null;
       jLabelSourceImage.setIcon(null);
       jLabelEmbedded.setIcon(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       if(EmbeddedImage == null){
           JOptionPane.showMessageDialog(this,"no message has been embedded",
                   "nothing to save",JOptionPane.ERROR_MESSAGE);
       }
       else{
           File file = showFileDialog(false);
           if(file==null)
               return;
           
           String name = file.getName();
           String Extention = name.substring(name.lastIndexOf(".")+1).toLowerCase();
           
           if(!Extention.equals("png")&& !Extention.equals("bmp")){
               Extention = "png";
               file = new File(file.getAbsolutePath()+".png");
           
           }
           if(file.exists())file.delete();
           try {
               ImageIO.write(EmbeddedImage,Extention.toUpperCase(),file);
                       
                       } catch (IOException ex) {
                           ex.printStackTrace();
           }
       
       }
    }//GEN-LAST:event_jButtonSaveActionPerformed
    private void embeddedMessage(BufferedImage img,String mess){
        int messageLength = mess.length();
        int imageWidth = img.getWidth(),imageHeight = img.getHeight(),
                imageSize = imageWidth * imageHeight;
        
        if(messageLength * 8 + 32 > imageSize){
        JOptionPane.showMessageDialog(this,"message is too long for this image",
                "message too long!",JOptionPane.ERROR_MESSAGE);
        return;
        }
        else{
            embedInteger(img,messageLength,0,0);
            byte b[]=mess.getBytes();
            for(int i=0;i<b.length;i++)   
                embedByte(img,b[i],i*8+32,0);
        }
    }
    private void embedInteger(BufferedImage img,int n,int start,int storageBit){
    int maxX = img.getWidth(),maxY=img.getHeight(),
            startX=start/maxY,startY=start-startX*maxY,count=0;
    for(int i=startX;i<maxX && count<32;i++){
    for(int j=startY;j<maxY && count<32;j++){
    int rgb = img.getRGB(i, j),bit=getBitValue(n,count);
    rgb = setBitValue(rgb,storageBit,bit);
    img.setRGB(i, j, rgb);
    count++;
    }
    }
    }
    private void embedByte(BufferedImage img,byte b,int start,int storageBit){
        int  maxX = img.getWidth(),maxY=img.getHeight(),
                startX = start/maxY,startY=start-startX*maxY,count=0;
        for(int i = startX;i<maxX && count<8;i++){
            for(int j = startY;j<maxY && count<8;j++){
                int rgb = img.getRGB(i, j),bit=getBitValue(b,count);
                rgb = setBitValue(rgb,storageBit,bit);
                img.setRGB(i, j, rgb);
                count++;
            }
        
        }
    
    }
    private int getBitValue(int n,int location){
        int v = (int)(n & Math.round(Math.pow(2,location )));
        return v == 0?0:1;
    }
            
    private int setBitValue(int n,int location,int bit){
        int toggle = (int) Math.pow(2, location),bv = getBitValue(n,location);
        if(bv==bit)
            return n;
        if(bv==0&&bit==1)
            n |= toggle;
        else if(bv == 1 && bit == 0)
            n ^=toggle;
        return n;
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
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encode_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmbed;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelEmbedded;
    private javax.swing.JLabel jLabelSourceImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables

   /* private int setBitValue(int rgb, int storageBit, int bit) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }*/
}
