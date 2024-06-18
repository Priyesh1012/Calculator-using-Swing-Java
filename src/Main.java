import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Main implements ActionListener {

     Main() {
         JFrame f = new JFrame();
         f.setSize(450, 650);
         f.setLayout(null);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setTitle("Calculator with Swing");



         JButton b0 = new JButton("0");
         JButton b1 = new JButton("1");
         JButton b2 = new JButton("2");
         JButton b3 = new JButton("3");
         JButton b4 = new JButton("4");
         JButton b5 = new JButton("5");
         JButton b6 = new JButton("6");
         JButton b7 = new JButton("7");
         JButton b8 = new JButton("8");
         JButton b9 = new JButton("9");
         JButton p = new JButton("+");
         JButton m = new JButton("x");
         JButton mi = new JButton("-");
         JButton d = new JButton("/");
         JButton mo = new JButton("%");
         JButton equal = new JButton("=");
         JButton ac = new JButton("AC");
         JTextField a = new JTextField();
         JTextField b = new JTextField();
         JTextField r = new JTextField();
         JTextField res = new JTextField();
         JTextField add = new JTextField();
         add.setText("0");
         JTextField mul = new JTextField();
         mul.setText("0");
         JTextField min = new JTextField();
         min.setText("0");
         JTextField div = new JTextField();
         div.setText("0");
         JTextField mod = new JTextField();
         mod.setText("0");


         b0.setBounds(110, 520, 50, 50);
         f.add(b0);
         b1.setBounds(40, 450, 50, 50);
         f.add(b1);
         b4.setBounds(40, 370, 50, 50);
         f.add(b4);
         b7.setBounds(40, 290, 50, 50);
         f.add(b7);

         b2.setBounds(110, 450, 50, 50);
         f.add(b2);
         b5.setBounds(110, 370, 50, 50);
         f.add(b5);
         b8.setBounds(110, 290, 50, 50);
         f.add(b8);


         ac.setBounds(40, 210, 50, 50);
         f.add(ac);
         mo.setBounds(110, 210, 50, 50);
         f.add(mo);
         d.setBounds(180, 210, 50, 50);
         f.add(d);
         mi.setBounds(300, 210, 50, 50);
         f.add(mi);
         m.setBounds(300, 290, 50, 50);
         f.add(m);
         p.setBounds(300, 370, 50, 50);
         f.add(p);
         a.setBounds(30, 40, 180, 40);
         a.setText("0");
         f.add(a);
         b.setBounds(220, 40, 180, 40);
         b.setText("0");
         f.add(b);
         r.setBounds(130, 90, 200, 40);
         r.setText("0");
         f.add(r);
         res.setText("0");
         equal.setBounds(300, 450, 50, 50);
         f.add(equal);


         b3.setBounds(180, 450, 50, 50);
         f.add(b3);
         b6.setBounds(180, 370, 50, 50);
         f.add(b6);
         b9.setBounds(180, 290, 50, 50);
         f.add(b9);



         ActionListener ab1 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("1");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("1");
                     }
                 } else {
                     if(Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("1");
                         a.setText(String.valueOf(one));

                     }else {
                         a.setText("1");
                     }
                 }
             }
         };


         ActionListener ab2 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("2");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("2");
                     }
                 } else {
                     if(Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("2");
                         a.setText(String.valueOf(one));

                     }else {
                         a.setText("2");
                     }
                 }
             }
         };

         ActionListener ab3 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("3");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("3");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("3");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("3");
                     }
                 }
             }
         };

         ActionListener ab4 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("4");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("4");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("4");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("4");
                     }
                 }
             }
         };
         ActionListener ab5 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("5");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("5");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("5");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("5");
                     }
                 }
             }
         };
         ActionListener ab6 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("6");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("6");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("6");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("6");
                     }
                 }
             }
         };
         ActionListener ab7 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("7");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("7");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("7");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("7");
                     }
                 }
             }
         };
         ActionListener ab8 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("8");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("8");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("8");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("8");
                     }
                 }
             }
         };
         ActionListener ab9 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (Integer.parseInt(add.getText()) !=0 || Integer.parseInt(mul.getText()) != 0 || Integer.parseInt(div.getText()) != 0|| Integer.parseInt(mod.getText()) != 0|| Integer.parseInt(min.getText()) != 0) {
                     if(Integer.parseInt(b.getText()) !=0) {
                         StringBuffer one = new StringBuffer(b.getText());
                         one.append("9");
                         b.setText(String.valueOf(one));

                     }else {
                         b.setText("9");
                     }
                 } else {
                     if (Integer.parseInt(a.getText()) !=0) {
                         StringBuffer one = new StringBuffer(a.getText());
                         one.append("9");
                         a.setText(String.valueOf(one));

                     } else {
                         a.setText("9");
                     }
                 }
             }
         };







         ActionListener plus = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 mul.setText("0");
                 min.setText("0");
                 div.setText("0");
                 mod.setText("0");
                 add.setText("1");
             }
         };
         ActionListener multiply = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 add.setText("0");
                 min.setText("0");
                 div.setText("0");
                 mod.setText("0");
                 mul.setText("1");
             }
         };
         ActionListener minus = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 add.setText("0");
                 mul.setText("0");
                 div.setText("0");
                 mod.setText("0");
                 min.setText("1");
             }
         };
         ActionListener divide = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 add.setText("0");
                 mul.setText("0");
                 min.setText("0");
                 mod.setText("0");
                 div.setText("1");
             }
         };
         ActionListener module = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 add.setText("0");
                 mul.setText("0");
                 min.setText("0");
                 div.setText("0");
                 mod.setText("1");
             }
         };
         ActionListener acF =new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 add.setText("0");
                 mul.setText("0");
                 min.setText("0");
                 div.setText("0");
                 mod.setText("0");
                 a.setText("0");
                 b.setText("0");
                 r.setText("0");
             }
         };



         ActionListener equ = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 long x = Long.parseLong(a.getText());
                 long y = Long.parseLong(b.getText());
                 if(Integer.parseInt(add.getText()) == 1){
                     r.setText(String.valueOf(x+y));
                     a.setText("0");
                     b.setText("0");
                     add.setText("0");
                 } else if(Integer.parseInt(mul.getText()) == 1) {
                     r.setText(String.valueOf(x*y));
                     a.setText("0");
                     b.setText("0");
                     mul.setText("0");
                 } else if ((Integer.parseInt(min.getText()) == 1)) {
                     r.setText(String.valueOf(x-y));
                     a.setText("0");
                     b.setText("0");
                     min.setText("0");
                 }else if ((Integer.parseInt(mod.getText()) == 1)) {
                     r.setText(String.valueOf(x % y));
                     a.setText("0");
                     b.setText("0");
                     mod.setText("0");
                 }else if ((Integer.parseInt(div.getText()) == 1)) {
                     r.setText(String.valueOf(x / y));
                     a.setText("0");
                     b.setText("0");
                     div.setText("0");
                 }
             }
         };


        b1.addActionListener(ab1);
        b2.addActionListener(ab2);
        b3.addActionListener(ab3);
        b4.addActionListener(ab4);
        b5.addActionListener(ab5);
        b6.addActionListener(ab6);
        b7.addActionListener(ab7);
        b8.addActionListener(ab8);
        b9.addActionListener(ab9);
        p.addActionListener(plus);
        equal.addActionListener(equ);
        m.addActionListener(multiply);
        mi.addActionListener(minus);
        d.addActionListener(divide);
        mo.addActionListener(module);
        ac.addActionListener(acF);


         f.setVisible(true);
     }


    public static void main(String[] args){
        new Main();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}