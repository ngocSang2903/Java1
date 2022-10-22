package bai1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
public class bai1 extends JFrame {

	private JPanel contentPane;
	private JTextField textThang;
	private JTextField textNam ;
	private JTextField textNgay;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private  String mangdcchon ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 frame = new bai1();
					frame.setTitle("Ktra Số Ngày");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public bai1() {
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label ketQua = new Label("");
		ketQua.setFont(new Font("Dialog", Font.PLAIN, 20));
		ketQua.setForeground(Color.BLUE);
		ketQua.setAlignment(Label.CENTER);
		ketQua.setBounds(30, 161, 380, 39);
		contentPane.add(ketQua);
		
		JButton nutNgu = new JButton("KTra");
		nutNgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mangdcchon.equalsIgnoreCase("Số ngày của tháng")) {
					if(textThang.getText().equals("Tháng")||textNam.getText().equals("Năm")) {
						ketQua.setText("Nhập dữ liệu vào thằng ngu ạ !");
					}else {
						try {
							int thang = Integer.parseInt(textThang.getText());
							int nam = Integer.parseInt(textNam.getText());
							int soNgay = kTraSoNgay.kTraSoNgayTrongThang(thang, nam);
							if(thang>=1 && thang<=12) {
								ketQua .setText("Số ngày của tháng "+thang+"/"+nam+" là : "+soNgay);
							}else {
								ketQua .setText("Sao m khôn thế (có tháng "+thang+" ak) !");
							}
						}catch (Exception E) {
							ketQua .setText("Nhập dữ liệu sai");
						}
					}
				}else if(mangdcchon.equals("Số ngày đến tết")) {
					if(textThang.getText().equals("Tháng")||textNam.getText().equals("Năm")||textNgay.getText().equals("Ngày")) {
						ketQua .setText("Nhập dữ liệu vào thằng ngu ạ !");
					}else {
						try {
							int thang = Integer.parseInt(textThang.getText());
							int nam = Integer.parseInt(textNam.getText());
							int ngay = Integer.parseInt(textNgay.getText());
							int soNgay = kTraSoNgay.kTraSoNgayTrongThang(thang, nam);
							if(thang>=1 && thang<=12&&ngay<=soNgay&&ngay>=1) {
								int tong = soNgay-ngay;
								if (thang<12){
									for(int i = thang+1;i<=12;i++) {
										tong += kTraSoNgay.kTraSoNgayTrongThang(i, nam);
									}
								}
							ketQua .setText("Số ngày đến tết là : "+tong);
							}else {
								ketQua .setText("Ngày này không tồn tại bé ơi !");
							}
						}catch (Exception E) {
							ketQua .setText("Nhập dữ liệu sai");
						}
					}
				}
			}
		});
		nutNgu.setBorder(new LineBorder(new Color(0, 0, 0)));
		nutNgu.setBounds(300, 78, 66, 30);
		
		
		textThang = new JTextField();
		textThang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textThang.setHorizontalAlignment(SwingConstants.CENTER);
		textThang.setText("Tháng");
		textThang.setBounds(117, 77, 52, 30);
	
		textThang.setColumns(10);
		
		textNam = new JTextField();
		textNam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNam.setHorizontalAlignment(SwingConstants.CENTER);
		textNam.setText("Năm");
		textNam.setBounds(191, 77, 96, 30);
		
		textNam.setColumns(10);
		
		JCheckBox ngayMax = new JCheckBox("Số ngày của tháng");
		buttonGroup.add(ngayMax);
		buttonGroup.add(ngayMax);
		ngayMax.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ngayMax.setHorizontalAlignment(SwingConstants.CENTER);
		ngayMax.setBounds(30, 20, 111, 23);
		contentPane.add(ngayMax);

		JCheckBox ngayConLai = new JCheckBox("Số ngày đến tết");
		buttonGroup.add(ngayConLai);
		buttonGroup.add(ngayConLai);
		
		ngayConLai.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ngayConLai.setBounds(161, 20, 146, 23);
		contentPane.add(ngayConLai);
		
		JButton chon = new JButton("CHỌN");
		chon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Enumeration<AbstractButton> non = buttonGroup.getElements();
				 while (non.hasMoreElements()) {
					AbstractButton abstractButton = (AbstractButton) non.nextElement();
					if(abstractButton.isSelected()) {
						mangdcchon = (abstractButton.getText());
					}
				}
				if(ngayConLai.isSelected()) {
					contentPane.add(textNgay);
					contentPane.updateUI();
				}else {
					contentPane.remove(textNgay);
					contentPane.updateUI();
				}
				if(ngayMax.isSelected()||ngayConLai.isSelected()) {
					contentPane.add(textThang);
					contentPane.add(textNam);
					contentPane.add(nutNgu);
					contentPane.updateUI();
					
				}else {
					contentPane.remove(textNgay);
					contentPane.remove(textThang);
					contentPane.remove(textNam);
					contentPane.remove(nutNgu);
					contentPane.updateUI();
				}
			}
		});
		chon.setBounds(338, 20, 72, 23);
		contentPane.add(chon);
		
		textNgay = new JTextField();
		textNgay.setText("Ngày");
		textNgay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNgay.setHorizontalAlignment(SwingConstants.CENTER);
		textNgay.setBounds(42, 77, 52, 30);
		textNgay.setColumns(10);
		
		
		
	}
}
