package kr.co.arukei.board.entity;

public class BoardVO {
	
	public int bid; // �Ϸù�ȣ 
	public String cate_cd; // �Խñ� ī�װ�
	public String title; // ����
	public String content; // �Խñ�
	public String tag; // �±�
	public int view_cnt; // ī��Ʈ
	public String reg_id; // �ۼ���
	public String reg_dt; // �ۼ�����
	public String edit_dt; // ��������
	/**
	 * @return bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid ���ëȪ��� bid
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return cate_cd
	 */
	public String getCate_cd() {
		return cate_cd;
	}
	/**
	 * @param cate_cd ���ëȪ��� cate_cd
	 */
	public void setCate_cd(String cate_cd) {
		this.cate_cd = cate_cd;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title ���ëȪ��� title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content ���ëȪ��� content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag ���ëȪ��� tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return view_cnt
	 */
	public int getView_cnt() {
		return view_cnt;
	}
	/**
	 * @param view_cnt ���ëȪ��� view_cnt
	 */
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	/**
	 * @return reg_id
	 */
	public String getReg_id() {
		return reg_id;
	}
	/**
	 * @param reg_id ���ëȪ��� reg_id
	 */
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	/**
	 * @return reg_dt
	 */
	public String getReg_dt() {
		return reg_dt;
	}
	/**
	 * @param reg_dt ���ëȪ��� reg_dt
	 */
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	/**
	 * @return edit_dt
	 */
	public String getEdit_dt() {
		return edit_dt;
	}
	/**
	 * @param edit_dt ���ëȪ��� edit_dt
	 */
	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}
	
	//�� �ʵ忡 ���� � ���� ���� �Ǿ� �ִ��� ���� Ȯ�� �� �� �ִ� toString() �޼ҵ嵵 �ڵ����� ���� �� �� �ֽ��ϴ�.
	
	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", cate_cd=" + cate_cd + ", title=" + title + ", content=" + content + ", tag="
				+ tag + ", view_cnt=" + view_cnt + ", reg_id=" + reg_id + ", reg_dt=" + reg_dt + ", edit_dt=" + edit_dt
				+ "]";
	}


}
