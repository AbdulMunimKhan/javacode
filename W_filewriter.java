import java.io.FileReader;
import java.io.FileWriter;
class W_filewriter{
	public static void main(String args[]){
		try{
			FileReader fr = new FileReader("W_filewriter.java");
			FileWriter fw = new FileWriter("test.txt");
			int i;
			while((i = fr.read())!=-1){
				fw.write(i);
			}
			fw.close();
			fr.close();
		}	catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}