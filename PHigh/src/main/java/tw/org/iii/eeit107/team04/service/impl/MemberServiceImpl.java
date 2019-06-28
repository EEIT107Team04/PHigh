package tw.org.iii.eeit107.team04.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.org.iii.eeit107.team04.dao.MemberDAO;
import tw.org.iii.eeit107.team04.entity.MemberBean;
import tw.org.iii.eeit107.team04.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	@Transactional
	public MemberBean createMember(MemberBean mb) {
		
		dao.save(mb);
		
		return mb;
	}

}
