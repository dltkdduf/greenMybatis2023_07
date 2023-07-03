package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aaa.model.Member;
import aaa.model.MemberData;
import aaa.model.Memmlog;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class mlogcontroller {
	
	@Resource
	MemberData md;
	@Resource
	JoinChk joinChk;
	
	@GetMapping("/basic/mlogin")
	public String loginMain( Memmlog me, MemberData md,HttpSession session ) {
		
		String pid = "";
	System.out.println(md);
		
		if(!pid.equals("")) {
			session.setAttribute("memdata", md);
			
		}
		return "basic/mloginForm";
	}
	
	@PostMapping("/basic/mlogingo")
	public String loginReg(@Valid Memmlog me ,BindingResult bRes ,HttpSession session,Model mm) {
		String msg =  "로그인실패";
		
//		Member chk = null;
//		for (Member you : md.mems) {
//			if(mem.equals(you)) {
//				chk = you;
//				break;
//			}
//		}
	
		String id = "aaa";
		String pw = "1111";
				
		if(id.equals("aaa") &&pw.equals("1111")) {
			msg="로그인 성공";
			
			session.setAttribute("pid",id);
			session.setAttribute("pw", pw);
	
		}
		
		  mm.addAttribute("msg",msg);

//		if(joinChk.hasErrors(me, bRes)) {
//			return "basic/mloginForm";//view 페이지 진입임(url  변경이 아님)
//		}
		 return "basic/alert";
		
		
		//return "basic/mlogincomple";
	}

}
