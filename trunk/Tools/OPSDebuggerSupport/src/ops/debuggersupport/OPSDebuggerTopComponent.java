/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ops.debuggersupport;

import configlib.exception.FormatException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicButtonUI;
import ops.OPSObject;
import ops.Participant;
import ops.Subscriber;
import ops.Topic;
import opsreflection.OPSFactory;
import org.netbeans.spi.viewmodel.ColumnModel;
import org.netbeans.spi.viewmodel.Model;
import org.netbeans.spi.viewmodel.Models;
import org.netbeans.spi.viewmodel.NodeModel;
import org.netbeans.spi.viewmodel.TableModel;
import org.netbeans.spi.viewmodel.TreeExpansionModel;
import org.openide.awt.TabbedPaneFactory;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.util.Utilities;

/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
// <editor-fold defaultstate="collapsed" desc="Generated Code">
/**
 * Top component which displays something.
 */
final class OPSDebuggerTopComponent extends TopComponent
{

    private static OPSDebuggerTopComponent instance;
    /** path to the icon used by the component and its open action */
    static final String ICON_PATH = "ops/debuggersupport/opsidlicon.GIF";
    //private static final String PREFERRED_ID = "OPSDebuggerTopComponent";
    private Subscriber subscriber;
    private JFileChooser fileChooser = new JFileChooser();
    private OPSFactory opsFactory = null;
    Serializable hatt;
    private ClassLoader clsLoader;
    private JTabbedPane tabbedPane;

    private OPSDebuggerTopComponent()
    {
        initComponents();
        setName(NbBundle.getMessage(OPSDebuggerTopComponent.class, "CTL_OPSDebuggerTopComponent"));
        setToolTipText(NbBundle.getMessage(OPSDebuggerTopComponent.class, "HINT_OPSDebuggerTopComponent"));
        setIcon(Utilities.loadImage(ICON_PATH, true));

        clsLoader = new OPSObject().getClass().getClassLoader();

        tabbedPane = new JTabbedPane();

        tabPanel.add(tabbedPane);


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        openButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tabPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        topicComboBox = new javax.swing.JComboBox();
        domainTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(openButton, org.openide.util.NbBundle.getMessage(OPSDebuggerTopComponent.class, "OPSDebuggerTopComponent.openButton.text")); // NOI18N
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(OPSDebuggerTopComponent.class, "OPSDebuggerTopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabPanel.setLayout(new java.awt.BorderLayout());

        jComboBox1.setEnabled(false);

        topicComboBox.setToolTipText((String)topicComboBox.getSelectedItem());

        domainTextField.setText(org.openide.util.NbBundle.getMessage(OPSDebuggerTopComponent.class, "OPSDebuggerTopComponent.domainTextField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(domainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openButton)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openButtonActionPerformed
    {//GEN-HEADEREND:event_openButtonActionPerformed
        if (opsFactory != null)
        {

            Participant participant = Participant.getInstance(domainTextField.getText());
            Topic topic = participant.createTopic((String)topicComboBox.getSelectedItem());
            subscriber = opsFactory.createSubscriber((String)topicComboBox.getSelectedItem());

            TreeModelImpl tm = new TreeModelImpl(subscriber);

            ColumnModel cm2 = new ValueColumnModel();

            TableModel tbm = new TableModelImpl();

            NodeModel nm = new NodeModelImpl();
            TreeExpansionModel tem = new TreeExpansionModelImpl();

            JComponent treeView = Models.createView(
                    Models.createCompoundModel(
                    Arrays.asList(new Model[]
                    {
                        tm, // TreeModel
                        tbm,
                        nm,
                        tem,
                        //cm1,
                        cm2
                    })));

            tabbedPane.addTab(topic.getName() + ":" + domainTextField.getText() + "(" + topic.getDomainAddress() + ")", treeView);

            tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(treeView), new ButtonTabComponent(tabbedPane));




        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        ArrayList<String> topicNames;
        // TODO add your handling code here:

        if (opsFactory == null)
        {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
            {
                if (fileChooser.getSelectedFile() != null)
                {
                    if (fileChooser.getSelectedFile().getName().endsWith("xml"))
                    {
                        try
                        {
                            opsFactory = new OPSFactory(fileChooser.getSelectedFile());
                            topicNames = opsFactory.listTopicNames();
                            openButton.setEnabled(true);

                            Collections.sort(topicNames);

                            for (String string : topicNames)
                            {
                                topicComboBox.addItem(string);
                            }
                        } catch (FileNotFoundException ex)
                        {
                            Exceptions.printStackTrace(ex);
                        } catch (FormatException ex)
                        {
                            Exceptions.printStackTrace(ex);
                        } catch (IOException ex)
                        {
                            Exceptions.printStackTrace(ex);
                        }


                    }
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void onNewData(Object arg)
    {
        //tm.setObject(arg);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField domainTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton openButton;
    private javax.swing.JPanel tabPanel;
    private javax.swing.JComboBox topicComboBox;
    // End of variables declaration//GEN-END:variables

//    /**
//     * Gets default instance. Do not use directly: reserved for *.settings files only,
//     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
//     * To obtain the singleton instance, use {@link #findInstance}.
//     */
    public static synchronized OPSDebuggerTopComponent getDefault()
    {
//        if (instance == null)
//        {
//            instance = new OPSDebuggerTopComponent();
//        }
//        return instance;
        return new OPSDebuggerTopComponent();
    }
//
//    /**
//     * Obtain the OPSDebuggerTopComponent instance. Never call {@link #getDefault} directly!
//     */

    public static synchronized OPSDebuggerTopComponent findInstance()
    {
//        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
//        if (win == null)
//        {
//            Logger.getLogger(OPSDebuggerTopComponent.class.getName()).warning(
//                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
//            return getDefault();
//        }
//        if (win instanceof OPSDebuggerTopComponent)
//        {
//            //return (OPSDebuggerTopComponent) win;
//            return getDefault();
//        }
//        Logger.getLogger(OPSDebuggerTopComponent.class.getName()).warning(
//                "There seem to be multiple components with the '" + PREFERRED_ID +
//                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType()
    {
        return TopComponent.PERSISTENCE_ONLY_OPENED;
    }

    @Override
    public void componentOpened()
    {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed()
    {
        // TODO add custom code on component closing
    }
    /** replaces this in object stream */
//    @Override
//    public Object writeReplace()
//    {
//        return new ResolvableHelper();
//    }
//
//
//
//    final static class ResolvableHelper implements Serializable
//    {
//
//        private static final long serialVersionUID = 1L;
//
//        public Object readResolve()
//        {
//            return OPSDebuggerTopComponent.getDefault();
//        }
//    }
}

class ButtonTabComponent extends JPanel
{

    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane)
    {
        //unset default FlowLayout' gaps
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null)
        {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);

        //make JLabel read titles from JTabbedPane
        JLabel label = new JLabel()
        {

            public String getText()
            {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1)
                {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };

        add(label);
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //tab button
        JButton button = new TabButton();
        add(button);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    private class TabButton extends JButton implements ActionListener
    {

        public TabButton()
        {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("close this tab");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            //No need to be focusable
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Making nice rollover effect
            //we use the same listener for all buttons
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            //Close the proper tab by clicking the button
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent e)
        {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);
            if (i != -1)
            {
                pane.remove(i);
            }
        }

        //we don't want to update UI for this button
        public void updateUI()
        {
        }

        //paint the cross
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            //shift the image for pressed buttons
            if (getModel().isPressed())
            {
                g2.translate(1, 1);
            }
            g2.setStroke(new BasicStroke(2));
            g2.setColor(Color.GRAY);
            if (getModel().isRollover())
            {
                g2.setColor(Color.BLACK);
            }
            int delta = 6;
            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
            g2.dispose();
        }
    }
    private final static MouseListener buttonMouseListener = new MouseAdapter()
    {

        public void mouseEntered(MouseEvent e)
        {
            Component component = e.getComponent();
            if (component instanceof AbstractButton)
            {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
            }
        }

        public void mouseExited(MouseEvent e)
        {
            Component component = e.getComponent();
            if (component instanceof AbstractButton)
            {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
            }
        }
    };
}

class TestObject
{

    public int a = 1;
    public double b = 2;
    public String hej = "hatten";
    public TestObject2 object2 = new TestObject2();

    public TestObject()
    {
    }

    public int getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public String getHej()
    {
        return hej;
    }
}

class TestObject2
{

    public int c = 1;
    public double d = 2;
    public String hej = "Hatten!";
}
