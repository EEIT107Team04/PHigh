package tw.org.iii.eeit107.team04.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Board")
public class BoardBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer boardId;
	private String boardName;
	private String boardIntroduction;
	private String boardImagePath;

	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private Set<ArticleTypeBean> articleType = new LinkedHashSet<ArticleTypeBean>();

	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private Set<ArticleBean> article = new LinkedHashSet<ArticleBean>();

	public BoardBean() {

	}

	public BoardBean(Integer boardId, String boardName, String boardIntroduction, String boardImagePath,
			Set<ArticleTypeBean> articleType, Set<ArticleBean> article) {
		super();
		this.boardId = boardId;
		this.boardName = boardName;
		this.boardIntroduction = boardIntroduction;
		this.boardImagePath = boardImagePath;
		this.articleType = articleType;
		this.article = article;
	}

	@Override
	public String toString() {
		return "BoardBean [boardId=" + boardId + ", boardName=" + boardName + ", boardIntroduction=" + boardIntroduction
				+ ", boardImagePath=" + boardImagePath + ", articleType=" + articleType + ", article=" + article + "]";
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardIntroduction() {
		return boardIntroduction;
	}

	public void setBoardIntroduction(String boardIntroduction) {
		this.boardIntroduction = boardIntroduction;
	}

	public String getBoardImagePath() {
		return boardImagePath;
	}

	public void setBoardImagePath(String boardImagePath) {
		this.boardImagePath = boardImagePath;
	}

	public Set<ArticleTypeBean> getArticleType() {
		return articleType;
	}

	public void setArticleType(Set<ArticleTypeBean> articleType) {
		this.articleType = articleType;
	}

}
