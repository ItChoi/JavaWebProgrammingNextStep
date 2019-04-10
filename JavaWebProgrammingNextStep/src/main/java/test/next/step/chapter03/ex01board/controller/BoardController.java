package test.next.step.chapter03.ex01board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import test.next.step.chapter03.ex01board.domain.Member;
import test.next.step.chapter03.ex01board.service.MemberService;

@RequestMapping("/chapter03/board")
@Controller
public class BoardController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/list")
	public void boardList() {
		System.out.println("겟리스트");
	}
	
	@GetMapping("/posts")
	public String boardPosts() {
		System.out.println("get posts");
		return "/chapter03/board/posts";
	}
	@GetMapping("/register")
	public String boardRegister(@ModelAttribute("member") Member member) {
		System.out.println("get resgister");
		return "/chapter03/board/form";
	}
	
	@PostMapping("/register")
	public String boardRegisterPost(Member member) {
		System.out.println("member: " + member.getUserId());
		
		memberService.register(member);
		
		System.out.println("post register 성공zz");
		
		return "redirect:list";
	}
	
	
	@GetMapping("/login")
	public String boardLogin() {
		
		return "/chapter03/board/login";
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> boardLoginPost(Member member, HttpServletRequest request) {

		boolean loginTest = false;
		
		// 로그인 검증
		if (member != null) {
			loginTest = memberService.loginTest(member);
			
			if (loginTest) {
				HttpSession session = request.getSession();
				session.setAttribute("userId", member.getUserId());
				System.out.println("로그인 성공 세션 등록!");
			}
			
		}
		
		System.out.println("?????????????: " + loginTest);
		return new ResponseEntity<>(loginTest, HttpStatus.OK);
	}
	
	
	@GetMapping("/logout")
	public void boardLogout() {
		
	}
	@GetMapping("/info")
	public String boardInfo() {
		
		return "/chapter03/board/form";
	}
	
	
	
	
}
