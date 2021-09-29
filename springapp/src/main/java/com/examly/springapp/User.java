package com.examly.springapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(nullable = false, unique = true, length = 60)
    private String email;
    
    @Column(nullable = false, length = 40)
    private String password;
    
    @Column(nullable = false, length = 60)
    private String firstname;
    
    @Column(nullable = true, length = 60)
    private String lastname;
    
    @Column(nullable = true, length = 200)
    private String description;
    
    @Column(nullable = true, length = 100)
    private String profile_pic;
    
    @Column(nullable = false, columnDefinition="bigint(10) DEFAULT 0")
    private Long posts;
    
    @Column(nullable = false, columnDefinition="bigint(10) DEFAULT 0")
    private Long followers;
    
    @Column(nullable = false, columnDefinition="bigint(10) DEFAULT 0")
    private Long following;
    
    @Column(nullable = false, columnDefinition="BOOLEAN DEFAULT false")
    private boolean status;
    
//    @PrePersist
//    void preInsert() {
//        if (this.description == null) {
//            this.description = "";
//        }
//    }
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProfile_pic() {
		return profile_pic;
	}
	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}
	public Long getPosts() {
		return posts;
	}
	public void setPosts(Long posts) {
		this.posts = posts;
	}
	public Long getFollowers() {
		return followers;
	}
	public void setFollowers(Long followers) {
		this.followers = followers;
	}
	public Long getFollowing() {
		return following;
	}
	public void setFollowing(Long following) {
		this.following = following;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", description=" + description + ", profile_pic=" + profile_pic
				+ ", posts=" + posts + ", followers=" + followers + ", following=" + following + ", status=" + status
				+ "]";
	}
    
}
