package javaGreen05;

import javax.swing.JButton;

public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JButton[] jbtn = new JButton[6];
		String[] rannum = new String[6];
		int ran[] = new int[6];

		int k = 0;
		for (int i = 0; i < 6; i++) {
			ran[i] = (int) (Math.random() * 40) + 1;
			while (k < i) {
				ran[i] = (int) (Math.random() * 40) + 1;
				for (k = 0; k < ran.length; k++) {
					if (ran[i] == ran[k]) {
						break;
					}
				}
			}
		}
		//
	
		for (int i = 0; i < ran.length; i++) {
			System.out.println(ran[i]);
			//rannum[i] = Integer.toString(ran[i]);
		}
		System.out.println(ran[0]);
		System.out.println(ran[1]);
		System.out.println(ran[2]);
		System.out.println(ran[3]);
		rannum[0] = Integer.toString(ran[0]);
		System.out.println(rannum[0]);


	}
}
