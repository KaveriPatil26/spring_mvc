package AEPL_TEST.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class userDto {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String mobile;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dob;
	private String location;
	private String identificationDocument;
	
	@Override
	public String toString() {
		return "userDto [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", dob=" + dob
				+ ", location=" + location + ", identificationDocument=" + identificationDocument + "]";
	}
	
	

}