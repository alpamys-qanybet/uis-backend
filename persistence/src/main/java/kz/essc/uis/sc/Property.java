package kz.essc.uis.sc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sc_property")
public class Property implements Serializable {
	private static final long serialVersionUID = 1897468625183503638L;
	
	private String properties;
	private String key;
	private String value;
	
	@Id
	@Column(name="properties_", nullable=false)
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	@Column(name="key_", nullable=false)
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	@Column(name="value_", nullable=false)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
