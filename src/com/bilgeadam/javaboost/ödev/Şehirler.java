package com.bilgeadam.javaboost.ödev;

public class Şehirler {
	
	static int counter = 0;
	int id;
	private String citiyName;
	
	public Şehirler() {
		counter++;
		id = counter;
	}
	
	public Şehirler(int id, String citiyName) {
		this();
		this.id = id;
		this.citiyName = citiyName;
	}
	
	@Override
	public String toString() {
		return "Şehirler [id=" + id + ", citiyName=" + citiyName + "]";
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public static void setCounter(int counter) {
		Şehirler.counter = counter;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCitiyName() {
		return citiyName;
	}
	
	public void setCitiyName(String citiyName) {
		this.citiyName = citiyName;
		
	}
	
	//
	// public void addlist() {
	// ArrayList<Şehirler> ŞehirlerList = new ArrayList<Şehirler>();
	// String empty = "";
	//
	// try (BufferedReader bufferedReader = new BufferedReader(new
	// FileReader("E:\\file\\şehirler.txt"))) {
	//
	// while (true) {
	// String lineString = bufferedReader.readLine();
	// if (lineString == null) {
	// break;
	// } else {
	//
	// StringTokenizer tokenizer = new StringTokenizer(lineString, ",");
	//
	// while (tokenizer.hasMoreElements()) {
	//
	// empty = (String) tokenizer.nextToken();
	//
	// ŞehirlerList.add(new Şehirler(id, empty));
	// }
	// }
	//
	// }
	//
	// } catch (Exception e) {
	// // TODO: handle exception
	// }
	// ŞehirlerList.forEach((temp) -> System.out.println(temp.getId() + " " +
	// temp.getCitiyName()));
	//
	// }
	public static void main(String[] args) {
		Şehirler Şehirler = new Şehirler(5, "b");
		System.out.println(Şehirler.toString());
		
	}
}
