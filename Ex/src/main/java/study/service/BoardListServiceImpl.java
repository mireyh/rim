package study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardListServiceImpl implements BoardListService {
	
	@Autowired
	BoardListMapper mapper;

	@Override
	public List<BoardListVo> selectBoardList(BoardListVo vo) throws Exception {

//		return mapper.selectBoardList(vo);
		return null;
	}
	
}
