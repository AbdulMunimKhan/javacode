import java.util.*;
class W_setint{
	public static void main(String[] args){
		Set<String> s1 = new HashSet<String>();
		for (String str : args)
		{
			System.out.println("Reading complete");
		
			if(!s1.add(str))
			System.out.println("Duplicate detecgted: " + str);
		
		}
		System.out.println(s1.size() + " distinct words are " + s1);
	}	
}