package com.cqupt.business.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cqupt.business.model.Knowledge;
import com.cqupt.business.service.KnowledgeService;
import com.cqupt.business.util.DateUtil;

@Controller
@RequestMapping(value = "/logisticDynamic")
public class LogisticDynamic {
	@Resource
	private KnowledgeService knowledgeService;

	@Resource(name = "knowledgeService")
	public void setKnowledgeService(KnowledgeService knowledgeService) {
		this.knowledgeService = knowledgeService;
	}

	@RequestMapping(value = "/getAll")
	public void findAllKnowledge(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<Knowledge> knowledges = knowledgeService.findAllKnowledge();
		String str = JSON.toJSONString(knowledges);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(str);
	}

	@RequestMapping(value = "/getById")
	public void findKnowledgeById(int id) {

	}

	@RequestMapping(value = "/add")
	public String addKnowledge(HttpServletRequest request) {
		String title = request.getParameter("active-topic");
		String content = request.getParameter("active-cont");
		String author = request.getParameter("active-author");
		Date issueDate = DateUtil.getCurrentDate();

		Knowledge knowledge = new Knowledge();
		knowledge.setTitle(title);
		knowledge.setContent(content);
		knowledge.setAuthor(author);
		knowledge.setIssueDate(issueDate);
		knowledgeService.addKnowledge(knowledge);
		return "/knowledge_select.jsp";
	}

	@RequestMapping(value = "delete")
	public void deleteKnowledge(int id) {

	}

	@RequestMapping(value = "batchDelte")
	public void batchDeleteKnowledge(List<Integer> ids) {

	}

	@RequestMapping(value = "update")
	public void changeKnowledge(int id, Knowledge knowledge) {

	}
}
