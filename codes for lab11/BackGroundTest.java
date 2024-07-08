import javax.swing.*;
public class BackGroundTest extends JFrame{

    public BackGroundTest(){
        ImageIcon bg = new ImageIcon("img.png");	//创建一个背景图片
        setBounds(0, 0, 1100, 810);
        JLabel label=new JLabel(bg);//把背景图片添加到标签里
        label.setBounds(0, 20, 1110, 790);	//把标签设置为和图片等高等宽
        JPanel jp = (JPanel)this.getContentPane();		//把我的面板设置为内容面板
        jp.setOpaque(false);//把我的面板设置为不可视
        jp.setLayout(null);//把我的面板设置为绝对布局
        setLocationRelativeTo(null);
        this.getLayeredPane().add(label, Integer.valueOf(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
        //设置界面属性
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BackGroundTest();
    }

}
