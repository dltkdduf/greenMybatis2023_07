package aaa.model;

import lombok.Data;

@Data
public class StudData {
	String name ,grade;
	int kor,eng,mat,tot,avg;
	
	
	
	public StudData(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor + eng + mat;
		avg = tot/3;
		
		if(avg >= 90 ) {
			grade = "수";
		}else if (avg >= 80) {
			grade = "우";
		}else if (avg >= 70) {
			grade = "미";
		}else if (avg >= 60) {
			grade = "양";
		}else {
			grade = "가";
		}
		
	}
	
	
	
	
	
	

}


