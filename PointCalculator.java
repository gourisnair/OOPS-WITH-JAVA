import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PointCalculator extends JFrame implements ActionListener {
	JTextField tfield;

	int z = 0,a = 0,b = 0,x = 0,y = 0 ;
	//z to prevent adding anything after displaying output
	//x for +,-
	//y for .
	//b for ( , )
	char ch;
	Point temp1 = new Point();
	Point temp2 = new Point();
	Point result = new Point();
	double scl;

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, clr, plus, mul, equal, dot, addSub,
			ed, md, slope, quad, xpro, ypro, xref, yref, opbrac, clbrac, comma , eqnLine;

	Container cont;

	JPanel textPanel, buttonpanel;

	PointCalculator() {
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		JPanel textpanel = new JPanel();
		tfield = new JTextField(35);
		tfield.setHorizontalAlignment(SwingConstants.RIGHT);
		tfield.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent keyevent) {
				char c = keyevent.getKeyChar();
				if (c >= '0' && c <= '9') {
				} else {
					keyevent.consume();
				}
			}
		});

		textpanel.add(tfield);
		buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(7, 4, 7, 7));

		clr = new JButton("AC");
		buttonpanel.add(clr);
		clr.setBackground(Color.BLACK);
		clr.setForeground(Color.WHITE);
		clr.addActionListener(this);

		opbrac = new JButton("(");
		buttonpanel.add(opbrac);
		opbrac.addActionListener(this);

		clbrac = new JButton(")");
		buttonpanel.add(clbrac);
		clbrac.addActionListener(this);

		comma = new JButton(",");
		buttonpanel.add(comma);
		comma.addActionListener(this);

		addSub = new JButton("-");
		buttonpanel.add(addSub);
		addSub.addActionListener(this);

		plus = new JButton("Add");
		buttonpanel.add(plus);
		plus.addActionListener(this);

		quad =  new JButton("Quadrant");
		buttonpanel.add(quad);
		quad.addActionListener(this);

		mul = new JButton("Scalar Mult");
		buttonpanel.add(mul);
		mul.addActionListener(this);

		slope = new JButton("Slope");
		buttonpanel.add(slope);
		slope.addActionListener(this);

		ed = new JButton("Euclidean Dist");
		buttonpanel.add(ed);
		ed.addActionListener(this);

		md = new JButton("Manhattan Dist");
		buttonpanel.add(md);
		md.addActionListener(this);

		xpro = new JButton("X Proj");
		buttonpanel.add(xpro);
		xpro.addActionListener(this);

		ypro =  new JButton("Y Proj");
		buttonpanel.add(ypro);
		ypro.addActionListener(this);

		xref = new JButton("X Refl");
		buttonpanel.add(xref);
		xref.addActionListener(this);

		yref =  new JButton("Y Refl");
		buttonpanel.add(yref);
		yref.addActionListener(this);

		eqnLine =  new JButton("Eqn of line");
		buttonpanel.add(eqnLine);
		eqnLine.addActionListener(this);

		b1 = new JButton("1");
		buttonpanel.add(b1);
		b1.addActionListener(this);

		b2 = new JButton("2");
		buttonpanel.add(b2);
		b2.addActionListener(this);

		b3 = new JButton("3");
		buttonpanel.add(b3);
		b3.addActionListener(this);

		dot = new JButton(".");
		buttonpanel.add(dot);
		dot.addActionListener(this);

		b4 = new JButton("4");
		buttonpanel.add(b4);
		b4.addActionListener(this);

		b5 = new JButton("5");
		buttonpanel.add(b5);
		b5.addActionListener(this);

		b6 = new JButton("6");
		buttonpanel.add(b6);
		b6.addActionListener(this);

		equal = new JButton("=");
		buttonpanel.add(equal);
		equal.addActionListener(this);

		b7 = new JButton("7");
		buttonpanel.add(b7);
		b7.addActionListener(this);

		b8 = new JButton("8");
		buttonpanel.add(b8);
		b8.addActionListener(this);

		b9 = new JButton("9");
		buttonpanel.add(b9);
		b9.addActionListener(this);

		b0 = new JButton("0");
		buttonpanel.add(b0);
		b0.addActionListener(this);

		cont.add("Center", buttonpanel);
		cont.add("North", textpanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("1")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "1");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "2");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "3");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "4");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "5");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "6");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "7");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "8");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {

			if (z == 0) {
				tfield.setText(tfield.getText() + "9");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				tfield.setText(tfield.getText() + "0");
			} else {
				tfield.setText("");
				tfield.setText(tfield.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("(")) {
			if (z == 0) {
					tfield.setText("" + "(");
				} else {
					tfield.setText("");
					tfield.setText(tfield.getText() + "(");
					z = 0;
				}
				b=1;
			}

		if (s.equals(")")) {
			if(b==2) {
				if (z == 0) {
					tfield.setText(tfield.getText() + ")");
				} else {
					tfield.setText("");
					tfield.setText(tfield.getText() + ")");
					z = 0;
				}
				b=0;
			}
		}
		if (s.equals(",")) {
			if(b==1) {
				if (z == 0) {
					tfield.setText(tfield.getText() + ",");
				} else {
					tfield.setText("");
					tfield.setText(tfield.getText() + ",");
					z = 0;
				}
				b=2;
			}
		}
		if (s.equals("AC")) {
			tfield.setText("");
			z = 0;
			y = 0;
			x = 0;
			a = 0;
			b = 0;
		}
		if (s.equals("-")) {
			if (x == 0 || x ==1) {
				tfield.setText(tfield.getText()+"-" );
				x++;
			} else {
				tfield.setText(tfield.getText());
			}
		}
		if (s.equals(".")) {
			if (y == 0 || y ==1) {
				tfield.setText(tfield.getText() + ".");
				y++;
			} else {
				tfield.setText(tfield.getText());
			}
		}
		if (s.equals("Add")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = '+';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				ch = '+';
				y = 0;
				x = 0;
			}
			tfield.requestFocus();
		}
		if (s.equals("Slope")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = 's';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				ch = 's';
				y = 0;
				x = 0;
			}
		}
		if (s.equals("Eqn of line")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = 'l';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				ch = 'l';
				y = 0;
				x = 0;
			}
		}
		if (s.equals("Manhattan Dist")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = 'm';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				ch = 'm';
				y = 0;
				x = 0;
			}

		}
		if (s.equals("Euclidean Dist")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = 'e';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				ch = 'e';
				y = 0;
				x = 0;
			}

		}
		if (s.equals("Scalar Mult")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
				ch = '*';
			} else {
				String t = tfield.getText();
				tfield.setText("");
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				x = 0;
				y = 0;
				ch = '*';
			}
		}
		if (s.equals("Quadrant")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
			} else {
				String t = tfield.getText();
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				tfield.setText("Quadrant "+temp1.whichQuadrant());
			}
		}
		if (s.equals("X Proj")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
			} else {
				String t = tfield.getText();
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				tfield.setText(temp1.xProj().toString());
			}
		}
		if (s.equals("Y Proj")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
			} else {
				String t = tfield.getText();
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				tfield.setText(temp1.yProj().toString());
			}
		}
		if (s.equals("X Refl")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
			} else {
				String t = tfield.getText();
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				tfield.setText(temp1.xRefl().toString());
			}
		}
		if (s.equals("Y Refl")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
				temp1.setX(0);
				temp1.setY(0);
			} else {
				String t = tfield.getText();
				String[] cord = t.substring(1, t.length()-1).split(",");
				temp1.setX(Double.parseDouble(cord[0]));
				temp1.setY(Double.parseDouble(cord[1]));
				tfield.setText(temp1.yRefl().toString());
			}
		}
		if (s.equals("=")) {
			if (tfield.getText().equals("")) {
				tfield.setText("");
			} else {
				if(ch == '+') {
					String t = tfield.getText();
					String[] cord = t.substring(1, t.length()-1).split(",");
					temp2.setX(Double.parseDouble(cord[0]));
					temp2.setY(Double.parseDouble(cord[1]));
					tfield.setText(temp1.sumPoint(temp2).toString());
					z = 1;
				}
				if(ch == '*') {
					scl = Double.parseDouble(tfield.getText());
					tfield.setText(temp1.scalarMult(scl).toString());
					z = 1;
				}
				if(ch == 'm') {
					String t = tfield.getText();
					String[] cord = t.substring(1, t.length()-1).split(",");
					temp2.setX(Double.parseDouble(cord[0]));
					temp2.setY(Double.parseDouble(cord[1]));
					tfield.setText(""+temp1.manhattanDistance(temp2));
				}
				if(ch == 'e') {
					String t = tfield.getText();
					String[] cord = t.substring(1, t.length()-1).split(",");
					temp2.setX(Double.parseDouble(cord[0]));
					temp2.setY(Double.parseDouble(cord[1]));
					tfield.setText(""+temp1.euclideanDistance(temp2));
				}
				if(ch == 's') {
					String t = tfield.getText();
					String[] cord = t.substring(1, t.length()-1).split(",");
					temp2.setX(Double.parseDouble(cord[0]));
					temp2.setY(Double.parseDouble(cord[1]));
					tfield.setText(""+temp1.slope(temp2));
				}
				if(ch == 'l') {
					String t = tfield.getText();
					String[] cord = t.substring(1, t.length()-1).split(",");
					temp2.setX(Double.parseDouble(cord[0]));
					temp2.setY(Double.parseDouble(cord[1]));
					tfield.setText(""+temp1.eqnOfLine(temp2));
				}
			}
		}
		tfield.requestFocus();
	}


	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
		}
		PointCalculator f = new PointCalculator();
		f.setTitle("Point Calculator");
		f.pack();
		f.setVisible(true);


	}

}
