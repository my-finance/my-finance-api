package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simualtion {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
    private String title;

	protected Simualtion() {}

    public Simualtion(String title) {
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
	
}
