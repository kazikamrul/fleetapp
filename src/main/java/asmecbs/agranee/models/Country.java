package asmecbs.agranee.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_SEQ")
	@SequenceGenerator(sequenceName = "country_seq", allocationSize = 1, name = "country_SEQ")
//	@Column(name = "id")
	private Integer id;
	//@Column(name = "code")
	private String code;
	//@Column(name = "capital")
	private String capital;
	//@Column(name = "description")
	private String description;
	//@Column(name = "nationality")
	private String nationality;


	private String continent;
	//@Column(name = "code")

	@OneToMany(mappedBy = "country")
	private List<State> states;

	

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", capital=" + capital + ", description=" + description
				+ ", nationality=" + nationality + ", continent=" + continent + ", states=" + states + "]";
	}

 
}