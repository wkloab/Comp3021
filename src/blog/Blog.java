package blog;

import java.util.ArrayList;

import base.Post;
import base.User;

public class Blog {

	private User user;
	private ArrayList<Post> allPosts;
	public Blog(User user) {
		this.user = user;
		this.allPosts = new ArrayList<Post>();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void post(Post p){
		this.allPosts.add(p);
		if (this.allPosts.contains(p)){
			System.out.println("A new Post: ");
			System.out.println(p.toString());
		}
	}
	public void list () {
		System.out.println("Current Posts: ");
		for (int i=0; i<this.allPosts.size(); i++){
			System.out.println("Post["+(i+1)+"]: ");
			System.out.println(this.allPosts.get(i).toString());
		}
	}
	public void delete (int index){
		if (index>this.allPosts.size()|| index <= 0){
			System.out.println("illegal detetion.");
		}else
			this.allPosts.remove(index-1);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
