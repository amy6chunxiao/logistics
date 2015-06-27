package com.cqupt.business.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cqupt.business.annotation.FireAuthority;
import com.cqupt.business.model.AuthorityType;
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

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SIMPLE)
	@RequestMapping(value = "/getAll")
	public void findAllKnowledge(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<Knowledge> knowledges = knowledgeService.findAllKnowledge();
		String str = JSON.toJSONString(knowledges);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(str);
		out.close();
	}

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SIMPLE)
	@RequestMapping(value = "/getById")
	public String findKnowledgeById(HttpServletRequest request) {
		String id = request.getParameter("id");
		Knowledge knowledge = knowledgeService.findKnowledgeById(Integer
				.parseInt(id));
		return null;
	}

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SYSTEM)
	@RequestMapping(value = "/add")
	public String addKnowledge(HttpServletRequest request)
			throws ParseException {
		String title = request.getParameter("active-topic");
		String content = request.getParameter("active-cont");
		String author = request.getParameter("active-author");
		String issueDate = DateUtil.getCurrentDate();

		Knowledge knowledge = new Knowledge();
		knowledge.setTitle(title);
		knowledge.setContent(content);
		knowledge.setAuthor(author);
		knowledge.setIssueDate(issueDate);
		knowledgeService.addKnowledge(knowledge);
		return "redirect:/active_select.jsp";
	}

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SYSTEM)
	@RequestMapping(value = "delete")
	public void deleteKnowledge(HttpServletRequest request) {
		String id = request.getParameter("id");
		knowledgeService.deleteKnowledge(Integer.parseInt(id));
	}

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SYSTEM)
	@RequestMapping(value = "batchDelte")
	public void batchDeleteKnowledge(HttpServletRequest request) {
		String[] ids = request.getParameterValues("ids");
		List<Integer> idList = new ArrayList<Integer>();
		for (String tmp : ids) {
			idList.add(Integer.parseInt(tmp));
		}
		knowledgeService.batchDeleteKnowledge(idList);
	}

	@FireAuthority(authorityType = AuthorityType.AUTHORITY_SYSTEM)
	@RequestMapping(value = "update")
	public String changeKnowledge(HttpServletRequest request) {
		String id = request.getParameter("id");
		String title = request.getParameter("active-topic");
		String content = request.getParameter("active-cont");
		String author = request.getParameter("active-author");
		String issueDate = DateUtil.getCurrentDate();

		Knowledge knowledge = new Knowledge();
		knowledge.setTitle(title);
		knowledge.setContent(content);
		knowledge.setAuthor(author);
		knowledge.setIssueDate(issueDate);
		knowledgeService.changeKnowledge(Integer.parseInt(id), knowledge);
		return "redirect:/active_select.jsp";
	}
}
