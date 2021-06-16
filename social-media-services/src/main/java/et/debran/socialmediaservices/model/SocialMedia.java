package et.debran.socialmediaservices.model;

public class SocialMedia {
	private String id;
	private String name;
	private String url;
	private String text;
	
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "SocialMedia [id=" + id + ", name=" + name + ", url=" + url + ", text=" + text + "]";
	}
	
	
}
