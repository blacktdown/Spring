package kr.co.ppol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ppol.dao.MemberDao;
import kr.co.ppol.vo.TermsVo;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public void insertMember() {}
	public TermsVo selectTerms() {
		return dao.selectTerms();
	}
	public void selectMember() {}
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}

}
