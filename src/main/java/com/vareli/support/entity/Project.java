package com.vareli.support.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_master_proj")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int proj_id;
	

}
