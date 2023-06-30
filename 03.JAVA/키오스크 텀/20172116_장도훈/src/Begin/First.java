package Begin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First  extends JFrame{
	 
	
   	int count = 0;//��ǰ ����
    String show = "";
    int sum; //������ ��ǰ �ѱݾ� ����


public First() {
	 setTitle("���� ���� �۷ι� �Ĵ�><");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container c = getContentPane();
     JTabbedPane pane = createTabbedPane();
     c.add(pane, FlowLayout.LEFT);
     setSize(650,700);
     
     setVisible(true);
     
  }
  



  private JTabbedPane createTabbedPane() {
     JTabbedPane pane = new JTabbedPane();
     pane.add("�ѽ�",new MyPanel1());
     pane.add("�߽�",new MyPanel2());
     return pane;
  }
  
  class MyPanel1 extends JPanel {
     public MyPanel1() {
    	 String menu[] = { "<�����>", "<�Ұ��>", "<�����>", "<������>", "<�߾���>", "<ȫ��ȸ>", "<������>", "<��ġ��>" };
	        int price[] = { 3700, 3500, 4000, 3300, 5000, 3800, 5000, 3000 };
	        JButton bt[] = new JButton[menu.length];
	        TextField suja[] = new TextField[menu.length];
	        Button minus[] = new Button[menu.length];
	        Button plus[] = new Button[menu.length];
	        JButton ok[] = new JButton[menu.length];
	        Label l[] = new Label[menu.length];
	        ImageIcon icon[] = new ImageIcon[menu.length];
 	 
 	 
 	 for (int i = 0; i < menu.length; i++) 
      {
          // �ܹ��� ��ư
          bt[i] = new JButton(menu[i]);
          if (i < 4) {
              bt[i].setBounds(50 + i * 150, 50, 150, 150);
          } else {
              bt[i].setBounds(50 + (i - 4) * 150, 300, 150, 150);
              //5��°���ʹ� �Ʒ��� ǥ�� (y���� �ٸ���
          }
          icon[i] = new ImageIcon("../ehgns123.image/"+i + ".jpg"); //�̹��� ���� ÷��!!
          bt[i].setIcon(icon[i]);

          // ���� txt ��ư
          suja[i] = new TextField("0"); //�⺻��0
          suja[i].setBackground(Color.white);
          suja[i].setEditable(false);
          suja[i].setBounds(bt[i].getX() + 50, bt[i].getY()+50 + 130, 40, 30);

          // "-" ��ư
          minus[i] = new Button("-");
          minus[i].setBounds(bt[i].getX()+20, suja[i].getY(), 20, 30);
          minus[i].setEnabled(false);

          // "+" ��ư
          plus[i] = new Button("+");
          plus[i].setBounds(bt[i].getX()+20 + (100 - 20), suja[i].getY(), 20, 30);
          plus[i].setEnabled(false);

          // ����
          l[i] = new Label(price[i] + "��");
          l[i].setBounds(bt[i].getX() + 40, suja[i].getY() - 25, 100, 20);

          // ���� ��ư
          ok[i] = new JButton("����");
          ok[i].setBounds(bt[i].getX()+20, suja[i].getY()+40 , 100, 20);
          ok[i].setEnabled(false);
          
          this.add(bt[i]);
          this.add(suja[i]);
          this.add(minus[i]);
          this.add(plus[i]);
          this.add(l[i]);
          this.add(ok[i]);
      }
 	 
 	 Panel panel =new Panel();
 	 TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);    
 	 panel.add(ta);
 	 this.add(panel,"   ��ǰ��        �ܰ�        ����      �ѻ�ǰ�ݾ�\\n\\n");
     //�ؽ�Ʈ���ο� ������ �ؽ�Ʈ ����
     ta.setBackground(Color.white);
     ta.setText("   ��ǰ��        �ܰ�        ����      �ѻ�ǰ�ݾ�\n\n");
     ta.setEditable(false); //�ؽ�Ʈ �Է¤���
     
 	 
 	 Button bt1 = new Button(" ī�����");
     Button bt2 = new Button("���ݰ���");     
     Button bt3 = new Button("�ٽü���");
     
     this.add(bt1);
     this.add(bt2);
     this.add(bt3);
     
     bt1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "ī������� �ǽ��ϰڽ��ϴ� ");
            
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
             }
                
         }
         
     });
     
     //���ݰ���
     bt2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, " ���ݰ����� �ǽ��ϰڽ��ϴ� ");
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
             }
         }
     });


     
     
     // �ʱ�ȭ 
     bt3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
                   
             }
         }
     });
     
     /*
     frame.add(pNorth, BorderLayout.NORTH);
     frame.add(ta, BorderLayout.CENTER);
     frame.add(pSouth, BorderLayout.SOUTH);
     frame.setVisible(true);
     */

     // �̺�Ʈ��
     for (int i = 0; i < menu.length; i++) {
         int j = i;

         // �ܹ��� ��ư �̺�Ʈ
         bt[i].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 minus[j].setEnabled(true);
                 plus[j].setEnabled(true);
                 bt[j].setEnabled(false);
                 ok[j].setEnabled(true);

                 count = 0;
             }
         });

         // "-" ��ư �̺�Ʈ
         minus[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 if (count > 0) {
                     count = count - 1;
                     suja[j].setText(count + "");
                     ok[j].setEnabled(true);
                 } else {
                     minus[j].setEnabled(false);
                 }
             }
         });
          
         // "+" ��ư �̺�Ʈ
         plus[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 count = count + 1;
                 suja[j].setText(count + "");
                 ok[j].setEnabled(true);
                 if (count > 0) {
                     minus[j].setEnabled(true);
                 }
             }
         });
         
         //���� ��ư �̺�Ʈ
         ok[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 show = bt[j].getActionCommand();
                 sum = sum+price[j] * count;                
                 ta.append("   " + show + "      " + price[j] + "         " + count + "        " + sum +"��"+ "\n");//�ؽ�Ʈ�� ǥ��
                                 
                 ok[j].setEnabled(false);
                
             }
             
               
         });
         
         
            
         }
     
         
     }
	
}

 	 
  
  class MyPanel2 extends JPanel {
     public MyPanel2() {

           
		 String menu[] = {  "<¥���>", "<«����>", "<«¥��>", "<��ǳ��>", "<���꽽>", "<������>", "<������>", "<�Ⱥ�ä>" };
	        int price[] = { 4500, 4500, 5000, 5000, 7000, 7000, 4000, 6000 };
	        JButton bt[] = new JButton[menu.length];
	        TextField suja[] = new TextField[menu.length];
	        Button minus[] = new Button[menu.length];
	        Button plus[] = new Button[menu.length];
	        JButton ok[] = new JButton[menu.length];
	        Label l[] = new Label[menu.length];
	        ImageIcon icon[] = new ImageIcon[menu.length];
    	 
    	 
    	 for (int i = 0; i < menu.length; i++) 
         {
             // �ܹ��� ��ư
             bt[i] = new JButton(menu[i]);
             if (i < 4) {
                 bt[i].setBounds(50 + i * 170, 50, 150, 150);
             } else {
                 bt[i].setBounds(50 + (i - 4) * 170, 300, 150, 150);
                 //5��°���ʹ� �Ʒ��� ǥ�� (y���� �ٸ���)
             }
             icon[i] = new ImageIcon("../ehgns123.image/"+i + ".jpg"); //�̹��� ���� ÷��!!
             bt[i].setIcon(icon[i]);

             // ���� txt ��ư
             suja[i] = new TextField("0"); //�⺻��0
             suja[i].setBackground(Color.white);
             suja[i].setEditable(false);
             suja[i].setBounds(bt[i].getX() + 50, bt[i].getY()+50 + 130, 40, 30);

             // "-" ��ư
             minus[i] = new Button("-");
             minus[i].setBounds(bt[i].getX()+20, suja[i].getY(), 20, 30);
             minus[i].setEnabled(false);

             // "+" ��ư
             plus[i] = new Button("+");
             plus[i].setBounds(bt[i].getX()+20 + (100 - 20), suja[i].getY(), 20, 30);
             plus[i].setEnabled(false);

             // ����
             l[i] = new Label(price[i] + "��");
             l[i].setBounds(bt[i].getX() + 40, suja[i].getY() - 25, 100, 20);

             // ���� ��ư
             ok[i] = new JButton("����");
             ok[i].setBounds(bt[i].getX()+20, suja[i].getY()+40 , 100, 20);
             ok[i].setEnabled(false);
             
             this.add(bt[i]);
             this.add(suja[i]);
             this.add(minus[i]);
             this.add(plus[i]);
             this.add(l[i]);
             this.add(ok[i]);

            
         }
    	 
    	 Panel panel =new Panel();
     	 TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);    
     	 panel.add(ta);
     	 this.add(panel,"         ��ǰ��        �ܰ�        ����      �ѻ�ǰ�ݾ�\\n\\n");
         //�ؽ�Ʈ���ο� ������ �ؽ�Ʈ ����
         ta.setBackground(Color.white);
         ta.setText("      ��ǰ��        �ܰ�        ����      �ѻ�ǰ�ݾ�\n\n");
         ta.setEditable(false); //�ؽ�Ʈ �Է¤���
         
     	 
     	 Button bt1 = new Button(" ī�����");
         Button bt2 = new Button(" ���ݰ���");     
         Button bt3 = new Button(" �������");
         
         this.add(bt1);
         this.add(bt2);
         this.add(bt3);
         
         bt1.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "ī������� �ǽ��ϰڽ��ϴ� ");
                
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
                 }
             }
         });
         
         //���ݰ���
         bt2.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, " ���ݰ����� �ǽ��ϰڽ��ϴ� ");
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
                 }
             }
         });


         
         
         // �ʱ�ȭ 
         bt3.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
                       
    	 
     }
  }
         });

     	 
         for (int i = 0; i < menu.length; i++) {
             int j = i;

             // �ܹ��� ��ư �̺�Ʈ
             bt[i].addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     minus[j].setEnabled(true);
                     plus[j].setEnabled(true);
                     bt[j].setEnabled(false);
                     ok[j].setEnabled(true);

                     count = 0;
                 }
             });

             // "-" ��ư �̺�Ʈ
             minus[i].addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent e) {
                     if (count > 0) {
                         count = count - 1;
                         suja[j].setText(count + "");
                         ok[j].setEnabled(true);
                     } else {
                         minus[j].setEnabled(false);
                     }
                 }
             });
              
             // "+" ��ư �̺�Ʈ
             plus[i].addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent e) {
                     count = count + 1;
                     suja[j].setText(count + "");
                     ok[j].setEnabled(true);
                     if (count > 0) {
                         minus[j].setEnabled(true);
                     }
                 }
             });
             
             //Ȯ�� ��ư �̺�Ʈ
             ok[i].addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent e) {
                     show = bt[j].getActionCommand();
                     sum = sum+price[j] * count;                
                     ta.append("   " + show + "      " + price[j] + "         " + count + "        " + sum +"��"+ "\n");//�ؽ�Ʈ�� ǥ��
                                     
                     ok[j].setEnabled(false);
                    
                 }
                 
                       
             });
             }
             
         }
    	
    }
  
  
  
  public static void main(String [] args) {
     new First();
  }

}


