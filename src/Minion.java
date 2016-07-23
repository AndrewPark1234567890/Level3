
public class Minion {
	String name; 
	int eyes; 
	String color; 
	String master;
	Minion(String name,int eyes, String color, String master){
		this.name = name; 
		this.eyes = eyes; 
		this.color =color; 
		this.master = master;
	}
	public String getName(){
		return name;
	}
	public int getEyes(){
		return eyes;
	}
	public String getColor(){
		return color;
	}
	public String getMaster(){
		return master;
	}
	public void setName(String n){
		name = n;
	}
	public void setEyes(int e){
		eyes = e;
	}
	public void setColor(String c){
		color = c;
	}
	public void setMaster(String m){
		master = m;
	}
}
