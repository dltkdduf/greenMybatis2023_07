package aaa.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class Memmlog {
	
	//유효성 검사 정의
	@NotEmpty(message = "아이디를 입력하세요")
	@Size(min=3, max = 10)  //message를 입력하지 않을 경우 "크기가 4에서 10 사이여야 합니다" 자동 설정
	String pid;
	
	@NotEmpty(message = "비밀번호를 입력하세요")
	@Size(min=4, max = 13, message = "4~12 자리 이어야 합니다.")
	String pw;
	
	

}
