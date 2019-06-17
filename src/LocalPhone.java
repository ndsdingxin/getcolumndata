

public class LocalPhone {
	private String id;
	private String wuliaoma;
	private String mingcheng;
	private String guige;
	private String beizhu;
	private String weizhi;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWuliaoma() {
		return wuliaoma;
	}
	public void setWuliaoma(String wuliaoma) {
		this.wuliaoma = wuliaoma;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getGuige() {
		return guige;
	}
	public void setGuige(String guige) {
		this.guige = guige;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getWeizhi() {
		return weizhi;
	}
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	public LocalPhone(String id, String wuliaoma, String mingcheng, String guige, String beizhu, String weizhi) {
		super();
		this.id = id;
		this.wuliaoma = wuliaoma;
		this.mingcheng = mingcheng;
		this.guige = guige;
		this.beizhu = beizhu;
		this.weizhi = weizhi;
	}
	public LocalPhone(String wuliaoma, String mingcheng, String guige, String beizhu, String weizhi) {
		super();
		this.wuliaoma = wuliaoma;
		this.mingcheng = mingcheng;
		this.guige = guige;
		this.beizhu = beizhu;
		this.weizhi = weizhi;
	}
	public LocalPhone() {
		super();
	}
	@Override
	public String toString() {
		return "LocalPhone [id=" + id + ", wuliaoma=" + wuliaoma + ", mingcheng=" + mingcheng + ", guige=" + guige
				+ ", beizhu=" + beizhu + ", weizhi=" + weizhi + "]";
	}
	
}
