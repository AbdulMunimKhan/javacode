import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class W_dataoutput{
	public static void main (String args[]){
		try{
			FileOutputStream fos1 = new FileOutputStream(args[0]);
			DataOutputStream dos1 = new DataOutputStream(fos1);
			FileInputStream fis1 = new FileInputStream("test.txt");
			dos1.writeChar('J');
			dos1.writeChar('A');
			dos1.writeChar('V');
			dos1.writeChar('A');
			fos1.close();
			dos1.close();
			String rdr = fis1.readLine();
			println(rdr);
						
		} catch (Exception e){
				System.out.println("Exception " + e);
		}
	}
}