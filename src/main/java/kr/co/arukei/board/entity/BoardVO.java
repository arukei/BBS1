package kr.co.arukei.board.entity;

public class BoardVO {
	
	public int bid; // 일련번호 
	public String cate_cd; // 게시글 카테고리
	public String title; // 제목
	public String content; // 게시글
	public String tag; // 태그
	public int view_cnt; // 카운트
	public String reg_id; // 작성자
	public String reg_dt; // 작성일자
	public String edit_dt; // 수정일자
	/**
	 * @return bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid セットする bid
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
	 * @param cate_cd セットする cate_cd
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
	 * @param title セットする title
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
	 * @param content セットする content
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
	 * @param tag セットする tag
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
	 * @param view_cnt セットする view_cnt
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
	 * @param reg_id セットする reg_id
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
	 * @param reg_dt セットする reg_dt
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
	 * @param edit_dt セットする edit_dt
	 */
	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}
	
	//각 필드에 현재 어떤 값이 셋팅 되어 있는지 쉽게 확인 할 수 있는 toString() 메소드도 자동으로 생성 할 수 있습니다.
	
	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", cate_cd=" + cate_cd + ", title=" + title + ", content=" + content + ", tag="
				+ tag + ", view_cnt=" + view_cnt + ", reg_id=" + reg_id + ", reg_dt=" + reg_dt + ", edit_dt=" + edit_dt
				+ "]";
	}


}
