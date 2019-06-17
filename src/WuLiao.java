

public class WuLiao {
	/**
	 * id
	 */
	private Float id;
	/**
	 * 学号
	 */
	private String wuliaoma;
	/**
	 * 姓名
	 */
	private String mingcheng;
	/**
	 * 学院
	 */
	private String guige;
	/**
	 * 成绩
	 */
	private String zhujima;
	private String tuhao;
	private String fuzhushuxing;
	private String pihao;
	private String gongyingshang;
	private String cangkudaima;
	private String cangkumingcheng;
	private String cangweidaima;
	private String cangweimingcheng;
	private String jibenjiliangdanwei;
	private String jibendanweishuliang;
	private String biaoji;
	public Float getId() {
		return id;
	}
	public void setId(Float id) {
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
	public String getZhujima() {
		return zhujima;
	}
	public void setZhujima(String zhujima) {
		this.zhujima = zhujima;
	}
	public String getTuhao() {
		return tuhao;
	}
	public void setTuhao(String tuhao) {
		this.tuhao = tuhao;
	}
	public String getFuzhushuxing() {
		return fuzhushuxing;
	}
	public void setFuzhushuxing(String fuzhushuxing) {
		this.fuzhushuxing = fuzhushuxing;
	}
	public String getPihao() {
		return pihao;
	}
	public void setPihao(String pihao) {
		this.pihao = pihao;
	}
	public String getGongyingshang() {
		return gongyingshang;
	}
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	public String getCangkudaima() {
		return cangkudaima;
	}
	public void setCangkudaima(String cangkudaima) {
		this.cangkudaima = cangkudaima;
	}
	public String getCangkumingcheng() {
		return cangkumingcheng;
	}
	public void setCangkumingcheng(String cangkumingcheng) {
		this.cangkumingcheng = cangkumingcheng;
	}
	public String getCangweidaima() {
		return cangweidaima;
	}
	public void setCangweidaima(String cangweidaima) {
		this.cangweidaima = cangweidaima;
	}
	public String getCangweimingcheng() {
		return cangweimingcheng;
	}
	public void setCangweimingcheng(String cangweimingcheng) {
		this.cangweimingcheng = cangweimingcheng;
	}
	public String getJibenjiliangdanwei() {
		return jibenjiliangdanwei;
	}
	public void setJibenjiliangdanwei(String jibenjiliangdanwei) {
		this.jibenjiliangdanwei = jibenjiliangdanwei;
	}
	public String getJibendanweishuliang() {
		return jibendanweishuliang;
	}
	public void setJibendanweishuliang(String jibendanweishuliang) {
		this.jibendanweishuliang = jibendanweishuliang;
	}
	public String getBiaoji() {
		return biaoji;
	}
	public void setBiaoji(String biaoji) {
		this.biaoji = biaoji;
	}
	public WuLiao(Float id, String wuliaoma, String mingcheng, String guige, String zhujima, String tuhao,
			String fuzhushuxing, String pihao, String gongyingshang, String cangkudaima, String cangkumingcheng,
			String cangweidaima, String cangweimingcheng, String jibenjiliangdanwei, String jibendanweishuliang,
			String biaoji) {
		super();
		this.id = id;
		this.wuliaoma = wuliaoma;
		this.mingcheng = mingcheng;
		this.guige = guige;
		this.zhujima = zhujima;
		this.tuhao = tuhao;
		this.fuzhushuxing = fuzhushuxing;
		this.pihao = pihao;
		this.gongyingshang = gongyingshang;
		this.cangkudaima = cangkudaima;
		this.cangkumingcheng = cangkumingcheng;
		this.cangweidaima = cangweidaima;
		this.cangweimingcheng = cangweimingcheng;
		this.jibenjiliangdanwei = jibenjiliangdanwei;
		this.jibendanweishuliang = jibendanweishuliang;
		this.biaoji = biaoji;
	}
	public WuLiao(String wuliaoma, String mingcheng, String guige, String zhujima, String tuhao, String fuzhushuxing,
			String pihao, String gongyingshang, String cangkudaima, String cangkumingcheng, String cangweidaima,
			String cangweimingcheng, String jibenjiliangdanwei, String jibendanweishuliang, String biaoji) {
		super();
		this.wuliaoma = wuliaoma;
		this.mingcheng = mingcheng;
		this.guige = guige;
		this.zhujima = zhujima;
		this.tuhao = tuhao;
		this.fuzhushuxing = fuzhushuxing;
		this.pihao = pihao;
		this.gongyingshang = gongyingshang;
		this.cangkudaima = cangkudaima;
		this.cangkumingcheng = cangkumingcheng;
		this.cangweidaima = cangweidaima;
		this.cangweimingcheng = cangweimingcheng;
		this.jibenjiliangdanwei = jibenjiliangdanwei;
		this.jibendanweishuliang = jibendanweishuliang;
		this.biaoji = biaoji;
	}
	public WuLiao() {
		super();
	}
	@Override
	public String toString() {
		return "WuLiao [id=" + id + ", wuliaoma=" + wuliaoma + ", mingcheng=" + mingcheng + ", guige=" + guige
				+ ", zhujima=" + zhujima + ", tuhao=" + tuhao + ", fuzhushuxing=" + fuzhushuxing + ", pihao=" + pihao
				+ ", gongyingshang=" + gongyingshang + ", cangkudaima=" + cangkudaima + ", cangkumingcheng="
				+ cangkumingcheng + ", cangweidaima=" + cangweidaima + ", cangweimingcheng=" + cangweimingcheng
				+ ", jibenjiliangdanwei=" + jibenjiliangdanwei + ", jibendanweishuliang=" + jibendanweishuliang
				+ ", biaoji=" + biaoji + "]";
	}
	

}
