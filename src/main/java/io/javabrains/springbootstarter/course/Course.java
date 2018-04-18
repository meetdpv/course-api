package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String descrption;
	@ManyToOne
	private Topic topic;
	
	
	public Course() {
		super();
	}
	public Course(String id, String name, String descrption, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.topic = new Topic(topicId,"", "");
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	

}
