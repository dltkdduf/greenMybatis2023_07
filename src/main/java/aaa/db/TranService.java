package aaa.db;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.Resource;

@Service
public class TranService {
	@Resource
	TranMapper tm;
	
	@Transactional
	public void tranGO() {
		//try ~ catch 존재시 @Transactional 실행 안함
		tm.insert2(arrs(123,121,124));
	}
	
	ArrayList<BoardDTO> arrs(int ...arr){
		ArrayList<BoardDTO> res = new ArrayList<>();
		for (int i: arr) {
			res.add(new BoardDTO(i, "제목"+i, "유택"+i));
		}
		
		return res;
	}
}
