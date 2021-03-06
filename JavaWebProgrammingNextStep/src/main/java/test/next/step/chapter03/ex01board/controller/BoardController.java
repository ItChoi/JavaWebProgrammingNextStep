package test.next.step.chapter03.ex01board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.domain.BoardReply;
import test.next.step.chapter03.ex01board.domain.Member;
import test.next.step.chapter03.ex01board.service.BoardService;
import test.next.step.chapter03.ex01board.service.MemberService;

@RequestMapping("/chapter03/board")
@Controller
public class BoardController {
	
	private Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	MemberService memberService;
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/list")
	public void boardList(Model model) {
		
		
		
		System.out.println("겟리스트");
	}
	
	@GetMapping("/posts")
	public String boardPosts(Model model) {
		
		List<Board> boardList = boardService.getBoardList();
		
		
		/*Page page = new Page();
		model.addAttribute("page", page);*/
		model.addAttribute("boardList", boardList);
		
		return "/chapter03/board/posts";
	}
	
	@GetMapping("/register")
	public String boardRegister(@ModelAttribute("member") Member member) {
		System.out.println("get resgister");
		return "/chapter03/board/register";
	}
	
	@PostMapping("/register")
	public String boardRegisterPost(Member member) {
		System.out.println("member: " + member.getUserId());
		
		memberService.register(member);
		
		System.out.println("post register 성공zz");
		
		return "redirect:list";
	}
	
	
	@GetMapping("/login")
	public String boardLogin(HttpServletRequest req, Model model, String babo) {
		
		System.out.println("babo::: " + babo);
		
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userId");
		
		System.out.println("로그인 된 userId: " + userId);
		
		model.addAttribute("userId", userId);
		
		return "/chapter03/board/login";
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> boardLoginPost(Member member, HttpServletRequest request) {

		boolean loginTest = false;
		
		// 로그인 검증
		loginTest = memberService.loginTest(member);
		
		if (loginTest) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", member.getUserId());
			System.out.println("로그인 성공 세션 등록!");
		}
			
		System.out.println("loginTest: " + loginTest);
		return new ResponseEntity<>(loginTest, HttpStatus.OK);
	}
	
	
	@GetMapping("/logout")
	public String boardLogout(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userId");
		
		if (userId != null) {
			session.invalidate();
		} else {
			model.addAttribute("babo", "로그인 안하셨잖아요.");
		}
		
		return "redirect:login"; 
	}
	
	@GetMapping("/info")
	public String boardInfo() {
		
		return "/chapter03/board/form";
	}
	
	
	@GetMapping("/detail")
	public String detailGet(@RequestParam("boardId") Long boardId, Model model) {
		logger.info("boardId: " + boardId);
		
		Board board = boardService.getBoardByBoardId(boardId);
		
		List<BoardReply> boardReply = boardService.getBoardReplyByBoardId(boardId);
		
		model.addAttribute("board", board);
		model.addAttribute("boardReply", boardReply);
		model.addAttribute("boardReplyCount", boardService.getBoardReplyCountByBoardId(boardId));
		
		return "/chapter03/board/form";
	}
	
	
	
	
	
}
