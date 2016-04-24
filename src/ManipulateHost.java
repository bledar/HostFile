import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipulateHost {
	private String path="";
	private Scanner file;
	String comment="";
	private ArrayList lista=new ArrayList();
	
	boolean openFile(){
		try{
			file=new Scanner(new File(path));
			System.out.println("U hap skedari me sukses");
			return true;
		}catch(Exception e){
			System.out.println("Gabim nje hapjen e skedarit!");
			return false;
		}
	}
	
	boolean closeFile(){
		try{
			file.close();	
			return true;
		}catch(Exception e){
			System.out.print("E pa mundyr per te mbyllur skedarin!");
			return false;
		}
		
	}
	public void readHost(){
		int i=0;
		String ip="";
		String host="";
		while(file.hasNextLine()){
			i++;
			String line=file.nextLine();
			if(line.startsWith("#")){
				comment=comment+line+"\n";
			}else{
				lista.add(line);
			}
//			System.out.println(line);
		}
		//System.out.println(comment);
	}
	
	void setPath(String path){
		
		this.path=path;
	}
	public ArrayList getList(){
		return this.lista;
	}
	
}
