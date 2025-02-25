package project1;

public class userdetail {
	//declaration 
	private double health;
	private double dmg;
	private double xp; 
	private double stm;
	private String name;
	private double magic;
//parameterless constructor 
public userdetail() {
	health =0;
	dmg =0;
	xp =0;
	stm=0;
	name ="";
}
// overload constructer 
	public userdetail(double health,double dmg, double xp,double stm,String name,double magic) {
		this.health = health;
		this.dmg = dmg;
		this.xp = xp;
		this.stm=stm;
		this.name = name;
		this.magic = magic;
		
		}
//getters
public double gethealth(){
	return health;
	}
public double getdmg() {
	return dmg;
	
}

public double getxp() {
	return xp;
	
}
public double getStm() {
	return stm;
}

public String getname() {
	return name;
}
public double getmagic() {
	return magic;
	
}


// setters
public void sethealth(double health) {
	this.health=health;
	
}


public void setdmg(double dmg) {
	this.dmg=dmg;
	
}
public void setxp(double xp) {
	this.xp=xp;
	
}

public void setStm(double stm) {
	this.stm = stm;
}

public void setname(String name) {
	this.name= name;
	
}

public void setmagic(double magic) {
	this.magic=magic;
	
}




}




