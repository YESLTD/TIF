/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptc.tifworkbench;

import com.ptc.tifworkbench.integrity.IntegrityApi;
import com.ptc.tifworkbench.integrity.IntegrityConnection;
import com.ptc.tifworkbench.integrity.IntegrityExceptionEx;
import com.ptc.tifworkbench.jaxbbinding.ImSolution;
import com.ptc.tifworkbench.model.TifChecker;
import com.ptc.tifworkbench.model.TifUtils;
import com.ptc.tifworkbench.model.XmlFormatter;
import com.ptc.tifworkbench.ui.AboutDialog;
import com.ptc.tifworkbench.ui.DifferenceDialog;
import com.ptc.tifworkbench.ui.EnvironmentDialog;
import com.ptc.tifworkbench.ui.EnvironmentFrame;
import com.ptc.tifworkbench.ui.FileViewFrame;
import com.ptc.tifworkbench.ui.ReadSolutionProgressDlg;
import com.ptc.tifworkbench.ui.TifCheckFrame;
import com.ptc.tifworkbench.ui.TifViewFrame;
import com.ptc.tifworkbench.ui.TransformDialog;
import com.ptc.tifworkbench.ui.WrapperGeneratorDlg;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.filechooser.FileFilter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author pbowden
 */
public class TifWorkbenchApplication extends javax.swing.JFrame implements InternalFrameListener
{
    public static final String TIF_VERSION = "1.0.9a";
    
    private TifViewFrame currentView = null;
    private List<TifViewFrame>views = new ArrayList<TifViewFrame>();
    private File openTifDir = new File(System.getProperty("user.dir"));
    private File openEnvDir = new File(System.getProperty("user.dir"));
    
    /**
     * Creates new form TifWorkbenchApplication
     */
    public TifWorkbenchApplication() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenu();
        newTifMeniItem = new javax.swing.JMenuItem();
        newEnvMenuItem = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenu();
        envOpenMenuItem = new javax.swing.JMenuItem();
        integrityMenuItem = new javax.swing.JMenuItem();
        integrityPlusMenuItem = new javax.swing.JMenuItem();
        tifMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        findMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        checkMenuItem = new javax.swing.JMenuItem();
        diffMenuItem = new javax.swing.JMenuItem();
        transformMenuItem = new javax.swing.JMenuItem();
        generateMenuItem = new javax.swing.JMenuItem();
        windowMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIF Workbench");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/ptc/tifworkbench/ui/Utilities-icon.png")).getImage());
        setName("appFrame"); // NOI18N

        desktopPane.setBackground(new java.awt.Color(204, 204, 255));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        newMenu.setText("New");

        newTifMeniItem.setText("New TIF");
        newTifMeniItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTifMeniItemActionPerformed(evt);
            }
        });
        newMenu.add(newTifMeniItem);

        newEnvMenuItem.setText("New Enviromnent");
        newEnvMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEnvMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newEnvMenuItem);

        fileMenu.add(newMenu);

        openMenu.setText("Open");

        envOpenMenuItem.setText("Environment");
        envOpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envOpenMenuItemActionPerformed(evt);
            }
        });
        openMenu.add(envOpenMenuItem);

        integrityMenuItem.setText("Integrity");
        integrityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrityMenuItemActionPerformed(evt);
            }
        });
        openMenu.add(integrityMenuItem);

        integrityPlusMenuItem.setText("Integrity + resources");
        integrityPlusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrityPlusMenuItemActionPerformed(evt);
            }
        });
        openMenu.add(integrityPlusMenuItem);

        tifMenuItem.setText("TIF");
        tifMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tifMenuItemActionPerformed(evt);
            }
        });
        openMenu.add(tifMenuItem);

        fileMenu.add(openMenu);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        findMenuItem.setMnemonic('t');
        findMenuItem.setText("Find");
        editMenu.add(findMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        toolsMenu.setText("Tools");

        checkMenuItem.setText("Check TIF");
        checkMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(checkMenuItem);

        diffMenuItem.setText("Difference");
        diffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diffMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(diffMenuItem);

        transformMenuItem.setText("Transform");
        transformMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(transformMenuItem);

        generateMenuItem.setText("Generate wrappers");
        generateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(generateMenuItem);

        menuBar.add(toolsMenu);

        windowMenu.setText("Window");
        menuBar.add(windowMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-584)/2, (screenSize.height-518)/2, 584, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void integrityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrityMenuItemActionPerformed
        try
        {
            IntegrityApi api = IntegrityApi.getInstance();
            api.clientConnect();

            TifViewFrame viewFrame = new TifViewFrame();
            currentView = viewFrame;
            setConnectionTitle(api, viewFrame);
            viewFrame.addInternalFrameListener(this);
            desktopPane.add(viewFrame);

            // The progress dlg will create a background thread to read the solution from
            // integrity and then put the result in the nominated SolutionViewer.
            ReadSolutionProgressDlg prog = new ReadSolutionProgressDlg(this, false);

            prog.setVisible(true);
            // Read the Integrity solution and have the result put into the viewFrame
            // i.e. a SolutionViewer window.
            prog.readSolution(viewFrame);
            viewFrame.setVisible(true); 
        }catch(IntegrityExceptionEx ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_integrityMenuItemActionPerformed
    
    protected void setConnectionTitle(IntegrityApi api, TifViewFrame viewFrame)throws IntegrityExceptionEx
    {
        IntegrityConnection conn = api.getDefaultConnection();
        String connStr = conn.getHost() + ":" + conn.getPort();
        viewFrame.setTitle("Template from server: " + connStr);
    }

    private void tifMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tifMenuItemActionPerformed
        String fname="";
        JFileChooser chooser = new JFileChooser();
        XMLFileFilter filter = new XMLFileFilter();
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(openTifDir);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
            	fname = chooser.getSelectedFile().getName();
                openTifDir = chooser.getSelectedFile().getParentFile();
                TifViewFrame viewFrame = new TifViewFrame();
                currentView = viewFrame;
                setFileTitle(fname, viewFrame);
                desktopPane.add(viewFrame);
                JAXBContext jaxbContext = JAXBContext.newInstance(ImSolution.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ImSolution sol =  (ImSolution)jaxbUnmarshaller.unmarshal(chooser.getSelectedFile());
                viewFrame.setSolution(sol);
                viewFrame.addInternalFrameListener(this);
                viewFrame.setVisible(true);
            } catch (JAXBException ex) 
            {
                Throwable linked = ex.getLinkedException();
                String exmess = "";
                
                if(ex.getMessage() != null)
                    exmess += ex.getMessage();
                if(linked.getMessage() != null)
                    exmess += linked.getMessage();
                
                String mess = "Error parsing TIF file " + fname + "\n" + exmess;
                JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                //ex.printStackTrace();
            }
            catch(IntegrityExceptionEx ex)
            {
                String mess = "Integrity error when reading file " + fname + "\n" + ex.getMessage();
                JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                //ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_tifMenuItemActionPerformed

    private void diffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diffMenuItemActionPerformed

        TifViewFrame viewFrame = new TifViewFrame();
        try
        {
            DifferenceDialog diffDlg = new DifferenceDialog(this, true, viewFrame);

            diffDlg.setChoices(views);
            diffDlg.setVisible(true);
            currentView = viewFrame;
            setFileTitle(diffDlg.getDescription(), viewFrame);
            desktopPane.add(viewFrame);
            viewFrame.addInternalFrameListener(this);
            viewFrame.setVisible(true);
        }catch(Exception e)
        {
            String mess = "Error differencing solutions\n" + e.getMessage();
            JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_diffMenuItemActionPerformed

    private void generateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMenuItemActionPerformed
        // The progress dlg will create a background thread to read the solution from
        // integrity and then put the result in the nominated SolutionViewer.
        if(currentView != null)
        {
            WrapperGeneratorDlg dlg = new WrapperGeneratorDlg(this, true, currentView.getSolution());
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_generateMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        String fname = "";
        JFileChooser chooser = new JFileChooser();
        XMLFileFilter filter = new XMLFileFilter();
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                fname = chooser.getSelectedFile().getAbsolutePath();
                if(!fname.endsWith(".xml"))
                    fname = fname + ".xml";
                if(currentView != null)
                {
                    XmlFormatter fmt = new XmlFormatter();
                    FileOutputStream ostream = new FileOutputStream(fname);
                    fmt.marshal(currentView.getSolution(), ostream);
                    ostream.close();
                }
                currentView.setTitle(fname);
            }
            catch(Exception ioEx)
            {
                String mess = "Error reading file " + fname + "\n" + ioEx.getMessage();
                JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                ioEx.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void transformMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformMenuItemActionPerformed
        if(currentView != null)
        {
            TransformDialog dlg = new TransformDialog(this, true, currentView.getSolution());
            boolean result = dlg.showDialog();
            if(result)
            {
                System.out.println("Showing result view");
                FileViewFrame viewFrame = dlg.getTransformView();
                desktopPane.add(viewFrame);
                viewFrame.addInternalFrameListener(this);
                viewFrame.setVisible(true);
            }

        }
    }//GEN-LAST:event_transformMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutDialog dlg = new AboutDialog(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void newTifMeniItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTifMeniItemActionPerformed
        try
        {
            TifViewFrame viewFrame = new TifViewFrame();
            currentView = viewFrame;
            setFileTitle("New", viewFrame);
            desktopPane.add(viewFrame);
            ImSolution sol = TifUtils.createEmptyTif();
            viewFrame.setSolution(sol);
            viewFrame.addInternalFrameListener(this);
            viewFrame.setVisible(true);
        }
        catch(Exception ioEx)
        {
            String mess = "Error creating new TIF\n" + ioEx.getMessage();
            JOptionPane.showConfirmDialog(this, mess, "Create error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            ioEx.printStackTrace();
        }
        
    }//GEN-LAST:event_newTifMeniItemActionPerformed

    private void envOpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envOpenMenuItemActionPerformed
        String fname="";
        JFileChooser chooser = new JFileChooser();
        PropsFileFilter filter = new PropsFileFilter();
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(openEnvDir);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                EnvironmentFrame envFrame = new EnvironmentFrame(chooser.getSelectedFile());
                desktopPane.add(envFrame);
                envFrame.addInternalFrameListener(this);
                envFrame.setVisible(true);
                openEnvDir = chooser.getSelectedFile().getParentFile();
            }
            catch(Exception ioEx)
            {
                String mess = "Error reading file " + fname + "\n" + ioEx.getMessage();
                JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                ioEx.printStackTrace();
            }
        }
    }//GEN-LAST:event_envOpenMenuItemActionPerformed

    private void integrityPlusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrityPlusMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_integrityPlusMenuItemActionPerformed

    private void newEnvMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEnvMenuItemActionPerformed
        EnvironmentDialog dlg = new EnvironmentDialog(this, true, false);
        boolean result = dlg.showDialog();
        if(result)
        {
            System.out.println("Creating new environment");
            try
            {
                EnvironmentFrame envFrame = new EnvironmentFrame(dlg.getEnvironment().getPropertiesFile());
                desktopPane.add(envFrame);
                envFrame.addInternalFrameListener(this);
                envFrame.setVisible(true);
            }
            catch(Exception ioEx)
            {
                String mess = "Error reading environment " + dlg.getEnvironment().getEnvDir().getAbsolutePath() + "\n" + ioEx.getMessage();
                JOptionPane.showConfirmDialog(this, mess, "Read error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                ioEx.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_newEnvMenuItemActionPerformed

    private void checkMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMenuItemActionPerformed
        if(currentView != null)
        {
            TifChecker checker = new TifChecker(currentView.getTitle(), currentView.getSolution());
            TifCheckFrame checkFrame = new TifCheckFrame(checker.getReport());
            desktopPane.add(checkFrame);
            checkFrame.addInternalFrameListener(this);
            checkFrame.setVisible(true);
        }
    }//GEN-LAST:event_checkMenuItemActionPerformed

    protected void setFileTitle(String fname, TifViewFrame viewFrame)throws IntegrityExceptionEx
    {
        viewFrame.setTitle("Template from file: " + fname);
    }
    


    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        System.out.println("Opening internal frame: " + e.getInternalFrame().getTitle());
        this.windowMenu.add(new JMenuItem(e.getInternalFrame().getTitle()));
        if(e.getInternalFrame() instanceof TifViewFrame)
        {
            views.add((TifViewFrame)e.getInternalFrame());
            System.out.println("Adding to list of views");
        }
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) 
    {
        String title = e.getInternalFrame().getTitle();
        System.out.println("Closing internal frame: " + title);
        for(int i=0; i<windowMenu.getItemCount(); i++)
        {
            String menuText = windowMenu.getItem(i).getText();
            if(title.equals(menuText))
            {
                windowMenu.remove(windowMenu.getItem(i));
                if(e.getInternalFrame() instanceof TifViewFrame)
                   views.remove((TifViewFrame)e.getInternalFrame());
            }
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        System.out.println("Activated internal frame: " + e.getInternalFrame().getTitle());
        if(e.getInternalFrame() instanceof TifViewFrame)
        {
            currentView = (TifViewFrame)e.getInternalFrame();
        }

    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
    public class XMLFileFilter extends FileFilter
    {
        @Override
        public boolean accept(File f)
        {
            if(f.isDirectory())return true;
        	int dot = f.getName().lastIndexOf(".");
            if(dot == -1) return false;
            String extn = f.getName().substring(dot, f.getName().length());
            return ".xml".equalsIgnoreCase(extn);
        }
        
        @Override
        public String getDescription()
        {
        	return "XML Files";
        }
    }
    public class PropsFileFilter extends FileFilter
    {
        @Override
        public boolean accept(File f)
        {
            if(f.isDirectory())return true;
            return f.getName().equalsIgnoreCase("build.properties");
        }
        
        @Override
        public String getDescription()
        {
        	return "TIF Environments";
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TifWorkbenchApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TifWorkbenchApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TifWorkbenchApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TifWorkbenchApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TifWorkbenchApplication().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem checkMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem diffMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem envOpenMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem findMenuItem;
    private javax.swing.JMenuItem generateMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem integrityMenuItem;
    private javax.swing.JMenuItem integrityPlusMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newEnvMenuItem;
    private javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem newTifMeniItem;
    private javax.swing.JMenu openMenu;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem tifMenuItem;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JMenuItem transformMenuItem;
    private javax.swing.JMenu windowMenu;
    // End of variables declaration//GEN-END:variables
}
