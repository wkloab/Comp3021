package blog;

import java.util.ArrayList;

import base.Post;
import base.User;

public class Blog {

	private User user;
	private ArrayList<Post> allPosts;
	public Blog(User user) {
		this.user = user;
		this.allPosts = allPosts;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void post(Post p){
		
	}
	public void list () {
		
	}
	public void delete (int index){
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
