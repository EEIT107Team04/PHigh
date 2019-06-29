package tw.org.iii.eeit107.team04.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.org.iii.eeit107.team04.entity.BoardBean;

public interface BoardDAO extends JpaRepository<BoardBean, Integer> {

}
