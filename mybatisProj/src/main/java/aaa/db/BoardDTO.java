package aaa.db;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("bDTO")
@Data
public class BoardDTO {

	Integer id, cnt, seq, level, gid;
	String title, pname, pw, content, upfile, sch;
	Date reg_date;
	public BoardDTO(String title, String pname, String pw, String content) {
		super();
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}
	
	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}
}
