package kr.co.arukei.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.arukei.board.entity.BoardVO;
import kr.co.arukei.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Inject
	private BoardService boardService;

	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model) throws Exception {
		model.addAttribute("boardList", boardService.getBoardList());
		return "board/index";
	}

	@RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
	public String saveBoard(@ModelAttribute("BoardVO") BoardVO boardVO, RedirectAttributes rttr) throws Exception {

		boardService.insertBoard(boardVO);

		return "redirect:/board/getBoardList";

	}

	@RequestMapping("/boardForm")
	public String boardForm() {

		return "board/boardForm";
	}

	/*
	 * @RequestMapping(value = "/getBoardList", method = RequestMethod.GET) public
	 * ModelAndView getBoardList() throws Exception { ModelAndView mv = new
	 * ModelAndView(); mv.addObject("boardList", boardService.getBoardList());
	 * mv.setViewName("board/index"); return mv;
	 * 
	 * }
	 */

}
