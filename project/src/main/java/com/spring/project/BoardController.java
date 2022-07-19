package com.spring.project;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.vo.PageMaker;
import com.spring.dto.BoardDTO;
import com.spring.dto.ReplyDTO;
import com.spring.project.BoardController;
import com.spring.service.BoardService;
import com.spring.service.ReplyService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	private ReplyService rs;

	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public void select(PageMaker pm, Model model) throws Exception {

	model.addAttribute("list",service.listSearchCriteria(pm));
	pm.setTotalCount(service.listSearchCount(pm));

	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void insertGET(BoardDTO dto) throws Exception {
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPOST(BoardDTO dto, RedirectAttributes rttr) throws Exception {
		
		logger.info(dto.toString());
		
		service.insert(dto);
		
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/board/select";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("bno") int bno, PageMaker pm, Model model) throws Exception {
	
		service.viewcnt(bno);
		System.out.println(pm);
		model.addAttribute(service.detail(bno));
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateGET(int bno, Model model) throws Exception {
		model.addAttribute(service.detail(bno));
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BoardDTO dto, PageMaker pm, RedirectAttributes rttr) throws Exception {
		
		service.update(dto);
		
		System.out.println(pm);
		rttr.addAttribute("page", pm.getPage());
		rttr.addAttribute("perPageNum", pm.getPerPageNum());
		rttr.addAttribute("searchType", pm.getSearchType());
		rttr.addAttribute("keyword", pm.getKeyword());
		
		rttr.addFlashAttribute("msg", "success");
	
		return "redirect:/board/select";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, PageMaker pm, RedirectAttributes rttr) throws Exception {
	
		rttr.addAttribute("page", pm.getPage());
		rttr.addAttribute("perPageNum", pm.getPerPageNum());
		rttr.addAttribute("searchType", pm.getSearchType());
		rttr.addAttribute("keyword", pm.getKeyword());
		
		service.delete(bno);
	
		rttr.addFlashAttribute("msg", "success");
	
		return "redirect:/board/select";
	}
	
	
}
