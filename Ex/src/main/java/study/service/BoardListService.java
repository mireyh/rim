package study.service;

import java.util.List;

public interface BoardListService {
	List<BoardListVo> selectBoardList(BoardListVo vo) throws Exception;
}
