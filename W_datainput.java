import java.io.*;
class W_datainput{
	public static void main(String args[]){
	
		DataInputStream in = new DataInputStream(System.in);
		String s = new String();
		try{
			s = in.readLine();
			float f = Float.valueOf(s).floatValue();
			System.out.println(f);
			
		}	catch(Exception e){
			System.out.println("Error: " + e.toString());
		}
	}
}

