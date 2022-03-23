package com.yntbros.bootapp.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Models a {@link Doctor Doctor's} specialty (surgery, cardiology etc).
 *
 * @author Nan Yang
 */
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity {

}
