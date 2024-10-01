package todaytask;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Student1 {
	@Id
    @GeneratedValue
	private int stdId;
	@Column(nullable=true)
	private String stdName;
	private String stdAdd;
	private double stdPer;
	private String stdGen;
	@Lob
	private byte[] image;

}
