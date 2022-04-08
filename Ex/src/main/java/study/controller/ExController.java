package study.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import study.service.BoardListVo;

@RestController
public class ExController {
	
	@GetMapping("/im700")
	public String im700() throws Exception {
		return "im700";
	}
	
	
	@GetMapping(value="/main.do")
	public ModelAndView home() throws Exception {
//		model.addAttribute("name","ahhh");
		return new ModelAndView("/index");
	}
	
	
	@GetMapping("/ajax.do")
	@ResponseBody
	public void ajax(HttpServletResponse response, @RequestParam String name) throws Exception {
		Gson gson = new Gson();
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		data.put("rs", "ok");
		data.put("msg", "json data");
		data.put("name", name);
		
		response.getWriter().print(gson.toJson(data));
	}
	
	
	
	
	
	
}
