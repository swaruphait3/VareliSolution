package com.vareli.support.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRawValue;

@Entity
@Table(name = "trn_issues")
public class Solutions {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
@OneToOne
	private Project project_id;
	private String issue;
	private String solutions;
    
@OneToOne
	private User user_id;
}
