package com.rkiesling.mvnecho;

public class MvnEchoApp {
	public static void main (String[] args) {
		System.out.print ("mnvecho:");
		if (args.length != 0) {
			for (String s: args) {
				System.out.print (" " + s);
			}
		} else {
			System.out.print (" (null)");
		}
		System.out.println ("");
	}
}
