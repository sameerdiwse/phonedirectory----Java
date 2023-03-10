package com.smartcontactmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ContactTable")
public class Contact 
{ 
   @Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int cid;
   @Column(name="contactid")
   private int phone;
   @Column(name="description")
   private String description;
   @Column(name="contactname")
   private String name;
   @Column(name="contactnickname")
   private String nickName;
   @Column(name="contactprofession")
   private String profession;
   @Column(name="contactemail")
   private String email;
   @Column(name="contactimageurl")
   private String imageUrl;
   @ManyToOne()
   private User user;
}
