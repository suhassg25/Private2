import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String modle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModle() {
		return modle;
	}
	public void setModle(String modle) {
		this.modle = modle;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public List<Sim> getSim() {
		return sim;
	}
	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

	private int ram;
	private int cost;
	private String color;
	@OneToMany
	private List<Sim> sim;
	
	
}
