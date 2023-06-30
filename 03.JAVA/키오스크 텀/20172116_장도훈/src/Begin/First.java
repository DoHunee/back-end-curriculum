package Begin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First  extends JFrame{
	 
	
   	int count = 0;//상품 개수
    String show = "";
    int sum; //선택한 상품 총금액 변수


public First() {
	 setTitle("도훈 도훈 글로벌 식당><");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container c = getContentPane();
     JTabbedPane pane = createTabbedPane();
     c.add(pane, FlowLayout.LEFT);
     setSize(650,700);
     
     setVisible(true);
     
  }
  



  private JTabbedPane createTabbedPane() {
     JTabbedPane pane = new JTabbedPane();
     pane.add("한식",new MyPanel1());
     pane.add("중식",new MyPanel2());
     return pane;
  }
  
  class MyPanel1 extends JPanel {
     public MyPanel1() {
    	 String menu[] = { "<비빔밥>", "<불고기>", "<장아찌>", "<육개장>", "<추어탕>", "<홍어회>", "<수제비>", "<김치전>" };
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
          // 햄버거 버튼
          bt[i] = new JButton(menu[i]);
          if (i < 4) {
              bt[i].setBounds(50 + i * 150, 50, 150, 150);
          } else {
              bt[i].setBounds(50 + (i - 4) * 150, 300, 150, 150);
              //5번째부터는 아래로 표현 (y값이 다르다
          }
          icon[i] = new ImageIcon("../ehgns123.image/"+i + ".jpg"); //이미지 파일 첨부!!
          bt[i].setIcon(icon[i]);

          // 숫자 txt 버튼
          suja[i] = new TextField("0"); //기본값0
          suja[i].setBackground(Color.white);
          suja[i].setEditable(false);
          suja[i].setBounds(bt[i].getX() + 50, bt[i].getY()+50 + 130, 40, 30);

          // "-" 버튼
          minus[i] = new Button("-");
          minus[i].setBounds(bt[i].getX()+20, suja[i].getY(), 20, 30);
          minus[i].setEnabled(false);

          // "+" 버튼
          plus[i] = new Button("+");
          plus[i].setBounds(bt[i].getX()+20 + (100 - 20), suja[i].getY(), 20, 30);
          plus[i].setEnabled(false);

          // 가격
          l[i] = new Label(price[i] + "원");
          l[i].setBounds(bt[i].getX() + 40, suja[i].getY() - 25, 100, 20);

          // 선택 버튼
          ok[i] = new JButton("선택");
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
 	 this.add(panel,"   상품명        단가        수량      총상품금액\\n\\n");
     //텍스트라인에 쓰여질 텍스트 설정
     ta.setBackground(Color.white);
     ta.setText("   상품명        단가        수량      총상품금액\n\n");
     ta.setEditable(false); //텍스트 입력ㄴㄴ
     
 	 
 	 Button bt1 = new Button(" 카드결제");
     Button bt2 = new Button("현금결제");     
     Button bt3 = new Button("다시선텍");
     
     this.add(bt1);
     this.add(bt2);
     this.add(bt3);
     
     bt1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "카드결제를 실시하겠습니다 ");
            
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   상품명        단가        수량        합계\n\n");
             }
                
         }
         
     });
     
     //현금결제
     bt2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, " 현금결제를 실시하겠습니다 ");
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   상품명        단가        수량        합계\n\n");
             }
         }
     });


     
     
     // 초기화 
     bt3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             for (int i = 0; i < menu.length; i++) {
                 bt[i].setEnabled(true);
                 minus[i].setEnabled(false);
                 plus[i].setEnabled(false);
                 suja[i].setText("0");
                 ta.setText("   상품명        단가        수량        합계\n\n");
                   
             }
         }
     });
     
     /*
     frame.add(pNorth, BorderLayout.NORTH);
     frame.add(ta, BorderLayout.CENTER);
     frame.add(pSouth, BorderLayout.SOUTH);
     frame.setVisible(true);
     */

     // 이벤트단
     for (int i = 0; i < menu.length; i++) {
         int j = i;

         // 햄버그 버튼 이벤트
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

         // "-" 버튼 이벤트
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
          
         // "+" 버튼 이벤트
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
         
         //선택 버튼 이벤트
         ok[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 show = bt[j].getActionCommand();
                 sum = sum+price[j] * count;                
                 ta.append("   " + show + "      " + price[j] + "         " + count + "        " + sum +"원"+ "\n");//텍스트에 표시
                                 
                 ok[j].setEnabled(false);
                
             }
             
               
         });
         
         
            
         }
     
         
     }
	
}

 	 
  
  class MyPanel2 extends JPanel {
     public MyPanel2() {

           
		 String menu[] = {  "<짜장면>", "<짬뽕탕>", "<짬짜면>", "<깐풍기>", "<유산슬>", "<볶음밥>", "<마라탕>", "<팔보채>" };
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
             // 햄버거 버튼
             bt[i] = new JButton(menu[i]);
             if (i < 4) {
                 bt[i].setBounds(50 + i * 170, 50, 150, 150);
             } else {
                 bt[i].setBounds(50 + (i - 4) * 170, 300, 150, 150);
                 //5번째부터는 아래로 표현 (y값이 다르다)
             }
             icon[i] = new ImageIcon("../ehgns123.image/"+i + ".jpg"); //이미지 파일 첨부!!
             bt[i].setIcon(icon[i]);

             // 숫자 txt 버튼
             suja[i] = new TextField("0"); //기본값0
             suja[i].setBackground(Color.white);
             suja[i].setEditable(false);
             suja[i].setBounds(bt[i].getX() + 50, bt[i].getY()+50 + 130, 40, 30);

             // "-" 버튼
             minus[i] = new Button("-");
             minus[i].setBounds(bt[i].getX()+20, suja[i].getY(), 20, 30);
             minus[i].setEnabled(false);

             // "+" 버튼
             plus[i] = new Button("+");
             plus[i].setBounds(bt[i].getX()+20 + (100 - 20), suja[i].getY(), 20, 30);
             plus[i].setEnabled(false);

             // 가격
             l[i] = new Label(price[i] + "원");
             l[i].setBounds(bt[i].getX() + 40, suja[i].getY() - 25, 100, 20);

             // 선택 버튼
             ok[i] = new JButton("선택");
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
     	 this.add(panel,"         상품명        단가        수량      총상품금액\\n\\n");
         //텍스트라인에 쓰여질 텍스트 설정
         ta.setBackground(Color.white);
         ta.setText("      상품명        단가        수량      총상품금액\n\n");
         ta.setEditable(false); //텍스트 입력ㄴㄴ
         
     	 
     	 Button bt1 = new Button(" 카드결제");
         Button bt2 = new Button(" 현금결제");     
         Button bt3 = new Button(" 결제취소");
         
         this.add(bt1);
         this.add(bt2);
         this.add(bt3);
         
         bt1.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "카드결제를 실시하겠습니다 ");
                
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   상품명        단가        수량        합계\n\n");
                 }
             }
         });
         
         //현금결제
         bt2.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, " 현금결제를 실시하겠습니다 ");
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   상품명        단가        수량        합계\n\n");
                 }
             }
         });


         
         
         // 초기화 
         bt3.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 for (int i = 0; i < menu.length; i++) {
                     bt[i].setEnabled(true);
                     minus[i].setEnabled(false);
                     plus[i].setEnabled(false);
                     suja[i].setText("0");
                     ta.setText("   상품명        단가        수량        합계\n\n");
                       
    	 
     }
  }
         });

     	 
         for (int i = 0; i < menu.length; i++) {
             int j = i;

             // 햄버그 버튼 이벤트
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

             // "-" 버튼 이벤트
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
              
             // "+" 버튼 이벤트
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
             
             //확인 버튼 이벤트
             ok[i].addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent e) {
                     show = bt[j].getActionCommand();
                     sum = sum+price[j] * count;                
                     ta.append("   " + show + "      " + price[j] + "         " + count + "        " + sum +"원"+ "\n");//텍스트에 표시
                                     
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


