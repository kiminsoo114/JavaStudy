package com.sist.client;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ClientForm extends JFrame {
	JTable table;
	DefaultTableModel model;
	JTextArea ta;
	JTextField tf;
	JButton loginBtn, sendBtn, endBtn;

	public ClientForm() {
		// ��������� �ʱ�ȭ
		ta = new JTextArea();
		JScrollPane js1 = new JScrollPane(ta);
		tf = new JTextField();
		loginBtn = new JButton("�α���");
		sendBtn = new JButton("����");
		endBtn = new JButton("����");

		String[] col = { "ID", "Name", "Sex" };
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row, col);
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		// Spring / AWS / MyBatis
		// Spring-Boot == VueJS , ReactJS AI
		// �����쿡 ��ġ
		setLayout(null);
		js2.setBounds(10, 15, 500, 200);
		js1.setBounds(10, 220, 500, 250);
		tf.setBounds(10, 475, 500, 30);

		JPanel p = new JPanel();
		p.add(loginBtn);
		p.add(endBtn);
		p.setBounds(10, 510, 500, 35);
		// �߰�
		add(js1);
		add(js2);
		add(tf);
		add(p);
		setSize(550, 590);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientForm();
	}

}
