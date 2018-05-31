package model;

public class MovieCategory {
	private int id;
	private String type;
	private String show;
	private int M_id;
	
	
	public int getM_id () {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}

}
