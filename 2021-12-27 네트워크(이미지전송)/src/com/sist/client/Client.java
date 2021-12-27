package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client extends JFrame {
	private JButton[] btn = new JButton[5];
	private JLabel la = new JLabel();
	private String[] poster = { 
			"https://img.cgv.co.kr/Movie/Thumbnail/Poster/000084/84949/84949_320.jpg",
			"https://img.cgv.co.kr/Movie/Thumbnail/Poster/000082/82479/82479_320.jpg",
			"https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85515/85515_320.jpg",
			"https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85237/85237_320.jpg",
			"https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85503/85503_320.jpg" };

	public Client() {
		JPanel p = new JPanel();
		for(int i=0;i<btn.length; i++) {
			btn[i]=new JButton(String.valueOf(i));
			p.add(btn[i]);
		}
		try {
			la.setIcon(new ImageIcon()new URL(poster[0])));
		}
	}

}
