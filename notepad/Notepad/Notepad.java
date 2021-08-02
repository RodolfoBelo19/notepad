//package p1;

import java.io.*;
//import p1.FontChooser;
//import p1.FontDialog;
//import p1.FindDialog;
//import p1.LookAndFeelMenu;
//import p1.MyFileFilter;

class FileOperation {

	Notepad npd;
	
	boolean saved;
	boolean newFileFlag;
	String fileName;
	String applicationTitle = "Javapad";
	
	File fileRef;
	JFileChooser chooser;
	
	//////////////////////
	
	boolean isSave(boolean saved){this.saved=saved;}
	String getFileName(){
		return new String(fileName);
		}
	void setFileName(String fileName){
		this.FileName = new String(fileName);
		}
	
	/////////////////////
	
	FileOperation(Notepad npd) {
		this.npd = npd;
		
		saved 		= true;
		newFileFlag = true;
		fileName 	= new String("Untitled");
		fileRef 	= new File("fileName");
		
	}
	
}
