/**
 * 
 */
package com.tquach.RestApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ThienQQ1
 *
 */
@Entity
public class Blog {

	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String title;
    private String content;
	public Blog() {
		// TODO Auto-generated constructor stub
	}
	
    public Blog(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }
	
	public Blog(int id, String title, String content) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	 

}
