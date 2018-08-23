public class Musician implements Artist{

	private String name;

	public Musician(String name){
		this.name = name;
	}

	public void performance(){
		System.out.println("Playing guitar");
	}

	public String getName(){
		return name;
	}
}