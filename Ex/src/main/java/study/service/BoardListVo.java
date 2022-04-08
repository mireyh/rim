package study.service;

public class BoardListVo {
	
	private int bno;
	private String title;
	private String writer;
	private String insert_time;
	
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", title=" + title + ", writer=" + writer + ", insert_time=" + insert_time
				+ "]";
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}
		
}
