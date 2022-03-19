package org.cwsya.TLBook.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import org.cwsya.TLBook.config.ClientConfig;
import org.cwsya.TLBook.pojo.UserPojo;
import org.cwsya.TLBook.service.Impl.LoginServiceImpl;
import org.cwsya.TLBook.util.ConfigUtil;
import org.omg.CORBA.ARG_OUT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField userName;
    private JPanel panel1;
    private JButton start;
    private JTextField passWord;

    private static JFrame frame;

    public static void run() {

        frame = new JFrame("123");
        frame.setContentPane(new Login().getPanel1());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.setSize(300, 210);
        //窗口居中
        int windowWidth = frame.getWidth();
        int windowHeight = frame.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        frame.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);
    }


    public Login() {
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userName = Login.this.userName.getText().replaceAll("\\s*", "");
                String passWord = Login.this.passWord.getText().replaceAll("\\s*", "");
                if (!"".equals(userName) || !"".equals(passWord)) {
                    UserPojo userPojo = new UserPojo(userName, passWord);
                    String login = new LoginServiceImpl().login(userPojo);
//                    System.out.println(login);
                    if (login != null || "".equals(login)) {
                        if (ConfigUtil.setConfig(ClientConfig.TOKEN_NAME, login)) {
                            JOptionPane.showMessageDialog(null, "登录成功", null, JOptionPane.WARNING_MESSAGE);
                            System.out.println(ConfigUtil.getConfig(ClientConfig.TOKEN_NAME));
                            new Index().run();
                            frame.dispose();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "用户名或密码错误", null, JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 2, new Insets(10, 20, 10, 20), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("账号:");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        userName = new JTextField();
        userName.setHorizontalAlignment(0);
        userName.setText("admin");
        panel1.add(userName, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("密码:");
        panel1.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        passWord = new JTextField();
        passWord.setEditable(true);
        passWord.setEnabled(true);
        passWord.setHorizontalAlignment(0);
        passWord.setText("12345");
        panel1.add(passWord, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        start = new JButton();
        start.setText("Button");
        panel1.add(start, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
