
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class infoChange extends JDialog {

	private JTextField nameText;
	private JTextField idText;
	private JPasswordField pwText1;
	private JPasswordField pwText2;
	private JTextField phoneNum1;
	private JTextField phoneNum2;
	private JTextField phoneNum3;
	private JButton nameChange;
	private JButton idChange;
	private JButton pwChange;
	private JButton doubleCheck;
	private JButton changeCheck;
	private JButton reset;
	private ArrayList<Member> memberList;
	private ArrayList<Member> manageList;
	private Member user;
	private boolean doubleCheckOk;
	private JLabel lblNewLabel;
	private JLabel pwValidation;
	private JButton phoneNumChange;

	public boolean isDoubleCheckOk() {
		return doubleCheckOk;
	}

	public void setDoubleCheckOk(boolean doubleCheckOk) {
		this.doubleCheckOk = doubleCheckOk;
	}

	public JButton getDoubleCheck() {
		return doubleCheck;
	}

	public void setDoubleCheck(JButton doubleCheck) {
		this.doubleCheck = doubleCheck;
	}

	public JLabel getPwValidation() {
		return pwValidation;
	}

	public void setPwValidation(JLabel pwValidation) {
		this.pwValidation = pwValidation;
	}

	public JTextField getNameText() {
		return nameText;
	}

	public void setNameText(JTextField nameText) {
		this.nameText = nameText;
	}

	public JTextField getIdText() {
		return idText;
	}

	public void setIdText(JTextField idText) {
		this.idText = idText;
	}

	public JPasswordField getPwText1() {
		return pwText1;
	}

	public void setPwText1(JPasswordField pwText1) {
		this.pwText1 = pwText1;
	}

	public JTextField getPhoneNum1() {
		return phoneNum1;
	}

	public JPasswordField getPwText2() {
		return pwText2;
	}

	public void setPwText2(JPasswordField pwText2) {
		this.pwText2 = pwText2;
	}

	public void setPhoneNum1(JTextField phoneNum1) {
		this.phoneNum1 = phoneNum1;
	}

	public JTextField getPhoneNum2() {
		return phoneNum2;
	}

	public void setPhoneNum2(JTextField phoneNum2) {
		this.phoneNum2 = phoneNum2;
	}

	public JTextField getPhoneNum3() {
		return phoneNum3;
	}

	public void setPhoneNum3(JTextField phoneNum3) {
		this.phoneNum3 = phoneNum3;
	}

	public JButton getNameChange() {
		return nameChange;
	}

	public void setNameChange(JButton nameChange) {
		this.nameChange = nameChange;
	}

	public JButton getIdChange() {
		return idChange;
	}

	public void setIdChange(JButton idChange) {
		this.idChange = idChange;
	}

	public JButton getPwChange() {
		return pwChange;
	}

	public void setPwChange(JButton pwChange) {
		this.pwChange = pwChange;
	}

	public JButton getPhoneNumChange() {
		return phoneNumChange;
	}

	public void setPhoneNumChange(JButton phoneNumChange) {
		this.phoneNumChange = phoneNumChange;
	}

	public infoChange() {
		memberList = DataCenter.getInstance().getMemberList();
		manageList = DataCenter.getInstance().getManegerList();
		user = DataCenter.getInstance().getMyInfo();

		showView();
		addListener();
	}

	private void showView() {

		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(44, 195, 248));

		JPanel titleBar = new JPanel();

		JLabel title = new JLabel("???????????? ??????");
		title.setFont(new Font("????????????T", Font.BOLD, 30));
		title.setBounds(89, 5, 181, 66);

		titleBar.setBackground(Color.WHITE);
		titleBar.setBounds(12, 10, 360, 81);
		titleBar.setLayout(null);
		titleBar.add(title);
		pnl.add(titleBar);

		setSize(400, 353);
		pnl.setLayout(null);

		getContentPane().add(pnl);

		JPanel infoBar = new JPanel();
		infoBar.setBackground(Color.WHITE);
		infoBar.setBounds(12, 101, 360, 145);
		pnl.add(infoBar);
		infoBar.setLayout(null);

		JLabel phoneNum = new JLabel("????????????");
		phoneNum.setBounds(35, 120, 55, 15);
		infoBar.add(phoneNum);
		phoneNum.setFont(new Font("????????????T", Font.PLAIN, 12));

		phoneNum1 = new JTextField(user.getFPhone());
		phoneNum1.setBounds(100, 117, 45, 20);
		infoBar.add(phoneNum1);
		phoneNum1.setEnabled(false);

		phoneNum2 = new JTextField(user.getMPhone());
		phoneNum2.setBounds(165, 117, 45, 20);
		infoBar.add(phoneNum2);
		phoneNum2.setEnabled(false);

		phoneNum3 = new JTextField(user.getLPhone());
		phoneNum3.setBounds(227, 117, 45, 20);
		infoBar.add(phoneNum3);
		phoneNum3.setEnabled(false);

		JLabel hypen2 = new JLabel("-");
		hypen2.setBounds(192, 140, 7, 15);
		infoBar.add(hypen2);

		JLabel hypen = new JLabel("-");
		hypen.setBounds(152, 117, 7, 15);
		infoBar.add(hypen);

		JLabel name = new JLabel("??????");
		name.setFont(new Font("????????????T", Font.PLAIN, 12));
		name.setBounds(35, 8, 40, 15);
		infoBar.add(name);

		nameText = new JTextField(user.getName());
		nameText.setBounds(100, 5, 80, 20);
		nameText.setEnabled(false);
		infoBar.add(nameText);

		nameChange = new JButton("??????");
		nameChange.setFont(new Font("????????????T", Font.PLAIN, 12));
		nameChange.setBounds(190, 5, 56, 20);
		infoBar.add(nameChange);

		JLabel id = new JLabel("ID");
		id.setBounds(35, 36, 40, 15);
		infoBar.add(id);
		id.setFont(new Font("????????????T", Font.PLAIN, 12));

		idText = new JTextField(user.getID());
		idText.setBounds(100, 33, 80, 20);
		infoBar.add(idText);
		idText.setEnabled(false);

		idChange = new JButton("??????");
		idChange.setBounds(190, 33, 56, 20);
		infoBar.add(idChange);
		idChange.setFont(new Font("????????????T", Font.PLAIN, 12));

		doubleCheck = new JButton("????????????");
		doubleCheck.setBounds(258, 33, 80, 20);
		infoBar.add(doubleCheck);
		doubleCheck.setFont(new Font("????????????T", Font.PLAIN, 12));

		JLabel pw = new JLabel("PW");
		pw.setBounds(35, 64, 40, 15);
		infoBar.add(pw);
		pw.setFont(new Font("????????????T", Font.PLAIN, 12));

		pwText1 = new JPasswordField(user.getPw());
		pwText1.setBounds(100, 61, 80, 20);
		infoBar.add(pwText1);
		pwText1.setEnabled(false);

		pwChange = new JButton("??????");
		pwChange.setBounds(190, 61, 56, 20);
		infoBar.add(pwChange);
		pwChange.setFont(new Font("????????????T", Font.PLAIN, 12));

		JLabel pw2 = new JLabel("PW2");
		pw2.setBounds(35, 92, 40, 15);
		infoBar.add(pw2);
		pw2.setFont(new Font("????????????T", Font.PLAIN, 12));

		pwText2 = new JPasswordField(user.getPw());
		pwText2.setBounds(100, 89, 80, 20);
		infoBar.add(pwText2);
		pwText2.setEnabled(false);

		changeCheck = new JButton("????????????");
		changeCheck.setBounds(207, 256, 75, 34);
		pnl.add(changeCheck);
		changeCheck.setFont(new Font("????????????T", Font.PLAIN, 12));
		changeCheck.setForeground(new Color(0, 0, 0));
		changeCheck.setToolTipText("");
		changeCheck.setBackground(Color.WHITE);
		
		phoneNumChange = new JButton("??????");
	    phoneNumChange.setFont(new Font("????????????T", Font.PLAIN, 12));
	    phoneNumChange.setBounds(284, 117, 56, 20);
	    infoBar.add(phoneNumChange);

		reset = new JButton("reset");
		reset.setBounds(297, 256, 75, 34);
		pnl.add(reset);
		reset.setFont(new Font("????????????T", Font.PLAIN, 12));
		reset.setBackground(Color.WHITE);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"resource/lottoimage/userInfoChange.png"));
		lblNewLabel.setBounds(12, 10, 81, 81);
		pnl.add(lblNewLabel);
		
		 pwValidation = new JLabel("");
  		 pwValidation.setFont(new Font("??????", Font.PLAIN, 11));
         pwValidation.setBounds(192, 89, 113, 20);
         infoBar.add(pwValidation);

	}

	private void addListener() {

		nameText.addKeyListener(new KeyAdapter() {

			@Override // ?????????????????? ??????????????? ????????? ????????? ??????
			public void keyReleased(KeyEvent e) {
				for (int i = 0; i < nameText.getText().length(); i++) {
					if (!(Character.isAlphabetic(nameText.getText().charAt(i)))) { // ????????? ??????????????? ???????????? ??????????????????

						JOptionPane.showMessageDialog(infoChange.this, "????????? ?????? ??????");

						String a;
						a = nameText.getText();
						nameText.setText(a.replaceAll("[^a-zA-Z???-??????-???]", "")); // ?????????????????? ????????? ??????????????? ?????? ??????

					}
				}
			}
		});

		idText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < idText.getText().length(); i++) {
					String a;
					a = idText.getText();
					String b = String.valueOf(a.charAt(i)); // ????????? ???????????? ???????????? ????????? ??????

					if (b.matches("^[a-zA-Z0-9]")) {

					} else {
						JOptionPane.showMessageDialog(infoChange.this, "??????, ????????? ????????????");
						idText.setText(a.replaceAll("[^a-zA-Z0-9]", "")); // ???????????? ????????? ??????????????? ??? ?????????
					}
				}

			}
		});

		phoneNum2.addKeyListener(new KeyAdapter() {

			@Override // ???????????? ????????? ????????? ??????????????? ?????? ??????
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < phoneNum2.getText().length(); i++) {

					if (!(Character.isDigit(phoneNum2.getText().charAt(i)))) {
						JOptionPane.showMessageDialog(infoChange.this, "????????? ??????????????????.");
						String a;
						a = phoneNum2.getText();
						phoneNum2.setText(a.replaceAll("[^0-9]", ""));
					}

					else if (phoneNum2.getText().length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
							&& !(e.getKeyCode() == KeyEvent.VK_LEFT) && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
						phoneNum2.setText(phoneNum2.getText().substring(0, 4));
						phoneNum2.transferFocus();
					}
				}
			}

		});

		phoneNum3.addKeyListener(new KeyAdapter() {

			@Override // ???????????? ????????? ?????????
			public void keyReleased(KeyEvent e) {

				for (int i = 0; i < phoneNum3.getText().length(); i++) {
					if (!(Character.isDigit(phoneNum3.getText().charAt(i)))) {
						JOptionPane.showMessageDialog(infoChange.this, "????????? ??????????????????.");
						String a;
						a = phoneNum3.getText();
						phoneNum3.setText(a.replaceAll("[^0-9]", ""));
					}

					else if (phoneNum3.getText().length() >= 4) {
						phoneNum3.setText(phoneNum3.getText().substring(0, 4));
					}
				}
			}
		});

		ActionListener listener = new ActionListener() {

			String idCheck;

			@Override
			public void actionPerformed(ActionEvent e) {
				// nameChange ????????? ???????????? ?????????????????? ?????????
				if (nameChange.equals(e.getSource())) {
					if (nameChange.getText().equals("??????")) {
						nameText.setEnabled(true);
						nameChange.setText("??????");
					} else if (nameChange.getText().equals("??????")) {
						nameText.setEnabled(false);
						nameChange.setText("??????");
					}
				}

				else if (doubleCheck.equals(e.getSource())) {

					if (idText.getText().length() >= 7) {

						boolean sameId = false;

						for (int i = 0; i < memberList.size(); i++) {

							if (memberList.get(i).getID().equals(idText.getText())
									&& !(user.getID().equals(idText.getText()))) {
								sameId = true;

							}
						}

						for (int i = 0; i < manageList.size(); i++) {

							if (manageList.get(i).getID().equals(idText.getText())) {
								sameId = true;

							}
						}

						if (sameId == true) {
							JOptionPane.showMessageDialog(infoChange.this, "?????? ???????????? ID?????????.");
						} else {
							JOptionPane.showMessageDialog(infoChange.this, "??????????????? ID?????????.");
							idCheck = idText.getText();
							doubleCheckOk = true;
						}
					}

					else {
						JOptionPane.showMessageDialog(infoChange.this, "ID??? 7?????? ?????? ????????? ?????????.");
					}

				}

				else if (idChange.equals(e.getSource())) {

					if (idChange.getText().equals("??????")) {
						idText.setEnabled(true);
						idChange.setText("??????");
					}

					else if (idChange.getText().equals("??????")) {

						if (doubleCheckOk == true && idCheck.equals(idText.getText())) {

							idText.setEnabled(false);
							idChange.setText("??????");
						} else {
							JOptionPane.showMessageDialog(infoChange.this, "??????????????? ????????????.");
						}
					}
				}

				else if (pwChange.equals(e.getSource())) {

					if (pwChange.getText().equals("??????")) {
						pwText1.setEnabled(true);
						pwText2.setEnabled(true);
						pwChange.setText("??????");
					}

					else if (pwChange.getText().equals("??????")) {

						if (!(pwText1.getText().length() >= 8) || !(pwText1.getText().equals(pwText2.getText()))) {
							JOptionPane.showMessageDialog(infoChange.this, "PW??? ??????????????????.");
						} else {
							pwText1.setEnabled(false);
							pwText2.setEnabled(false);
							pwChange.setText("??????");
						}
					}

				}

				else if (phoneNumChange.equals(e.getSource())) {

					if (phoneNumChange.getText().equals("??????")) {

						phoneNum1.setEnabled(true);
						phoneNum2.setEnabled(true);
						phoneNum3.setEnabled(true);

						phoneNumChange.setText("??????");
					} else if (phoneNumChange.getText().equals("??????")) {

						phoneNum1.setEnabled(false);
						phoneNum2.setEnabled(false);
						phoneNum3.setEnabled(false);
						phoneNumChange.setText("??????");
					}
				}

				else if (reset.equals(e.getSource())) {

					nameText.setText(user.getName());
					phoneNum1.setText(user.getFPhone());
					phoneNum2.setText(user.getMPhone());
					phoneNum3.setText(user.getLPhone());
					idText.setText(user.getID());
					pwText1.setText(user.getPw());
					pwText2.setText(user.getPw());

					nameChange.setText("??????");
					idChange.setText("??????");
					pwChange.setText("??????");
					phoneNumChange.setText("??????");
					pwValidation.setText("");

					nameText.setEnabled(false);
					phoneNum1.setEnabled(false);
					phoneNum2.setEnabled(false);
					phoneNum3.setEnabled(false);
					idText.setEnabled(false);
					pwText1.setEnabled(false);
					pwText2.setEnabled(false);
					
					doubleCheckOk = false;

				}
			}
		};

		changeCheck.addActionListener(listener);
		reset.addActionListener(listener);
		pwChange.addActionListener(listener);
		idChange.addActionListener(listener);
		doubleCheck.addActionListener(listener);
		nameChange.addActionListener(listener);
		phoneNumChange.addActionListener(listener);

		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pwValidation.show(false); // ???????????????????????? false ??? ????????? ????????? ???????????? true??? ???????????????
				String valiTxt = ""; // ?????? ????????? ????????? ?????????(??????) ?????????
				if (pwText1.getText().length() < 8 && pwText1.getText().length() > 0) {
					valiTxt = "PW??? 8?????? ??????"; // pwText1 8?????? ????????????
					pwValidation.setForeground(Color.RED);
				} else if (pwText1.getText().length() <= 0) {
					valiTxt = ""; // pwText ??? ????????? 0?????? (?????? ???????????????)
				} else if (!pwText1.getText().equals(pwText2.getText())) {
					valiTxt = "?????????"; // pwTex?????? 8?????? ??????????????? pwText1, pwText2 ?????? ?????????
					pwValidation.setForeground(Color.RED);
				} else if (pwText1.getText().equals(pwText2.getText())) {
					valiTxt = "??????"; // pwText ?????? 8?????? ???????????? pwText1, pwText2 ?????? ????????? (????????????)
					pwValidation.setForeground(Color.GREEN);
				}
				pwValidation.setText(valiTxt); // ?????? ????????? ???????????? ??????????????? valiTxt??? pwValidation ??? ????????????
				pwValidation.show(true); // ???????????????.
			}
		};

		pwText1.addKeyListener(adapter);
		pwText2.addKeyListener(adapter);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// new MyPage().getFrame().setVisible(true);
				dispose();
			}

		});

	}

	public JButton getChangeCheck() {
		return changeCheck;
	}

	public void setChangeCheck(JButton changeCheck) {
		this.changeCheck = changeCheck;
	}

//   public static void main(String[] args) {
//      new infoChange().setVisible(true);
//      
//   }

}