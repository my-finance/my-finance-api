package simulation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simulation {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
    private String title;

	public Simulation() {}

    public Simulation(String title) {
        this.title = title;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Simulation simulation = (Simulation) o;
		return id.equals(simulation.id);
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Simualtion:{" +
				"id= " + this.id +
				", title='" + this.title + '\'';
	}
	
}
