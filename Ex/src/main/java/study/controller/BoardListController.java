package study.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import study.service.BoardListService;
import study.service.BoardListVo;

@Controller
public class BoardListController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BoardListService boardListService;
	
//	@param request
//	@param response
//	@param session
//	@param model
//	@return
//	@throws Exception
	
	@RequestMapping(value = "/boardList.do")
	public void boardListJson(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("vo") BoardListVo vo) throws Exception {
		Gson gson = new Gson();
		
		Map<String, Object> data = new HashMap<String, Object>();
		//ddd
		
	}
	
	
}
