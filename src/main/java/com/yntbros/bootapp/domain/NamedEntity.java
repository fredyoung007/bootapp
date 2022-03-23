package com.yntbros.bootapp.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Domain object adds a name property to <code>BaseEntity</code>. 
 *
 * @author Nan Yang
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
