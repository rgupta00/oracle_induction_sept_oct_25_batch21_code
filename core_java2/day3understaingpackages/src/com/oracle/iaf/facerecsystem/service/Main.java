package com.oracle.iaf.facerecsystem.service;

import com.oracle.iaf.facerecsystem.ui.Face;

public class Main {

	public static void main(String[] args) {
		Face face=new Face();
		face.printFaceOnUI();
		
		com.oracle.iaf.facerecsystem.db.Face face1=
				new com.oracle.iaf.facerecsystem.db.Face();
	}
}
