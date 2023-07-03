package aaa.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class MemberData {

	public HashMap<String, Member>map;
	
	public ArrayList<Member>mems;
	
	public MemberData() {
//		map = new HashMap<>();
//		
//		map.put("aaa", new Member("aaa", "장동건", "1111"));
//		map.put("bbb", new Member("bbb", "장서건", "2222"));
//		map.put("ccc", new Member("ccc", "장동건", "3333"));
//		map.put("ddd", new Member("ddd", "장남건", "1111"));
//		map.put("eee", new Member("eee", " 북두신건", "3333"));
		
		mems = new ArrayList<>();
		
//		mems.add(new Member("aaa","1111"));
//		mems.add( new Member("bbb","2222"));
//		mems.add( new Member("ccc","3333"));
//		mems.add( new Member("ddd","1111"));
//		mems.add( new Member("eee","3333"));
	}
}
