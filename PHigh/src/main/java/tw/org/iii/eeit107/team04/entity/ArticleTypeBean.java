package tw.org.iii.eeit107.team04.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ArticleType")
public class ArticleTypeBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer articleTypeId;
	private String articleTypeName;

	@ManyToOne
	@JoinColumn(name = "fk_board_id", nullable = false)
	private BoardBean board;

	@OneToMany(mappedBy = "articleType", cascade = CascadeType.ALL)
	private Set<ArticleTypeBean> article = new LinkedHashSet<ArticleTypeBean>();

	public ArticleTypeBean() {

	}

	public ArticleTypeBean(Integer articleTypeId, String articleTypeName, BoardBean board,
			Set<ArticleTypeBean> article) {
		super();
		this.articleTypeId = articleTypeId;
		this.articleTypeName = articleTypeName;
		this.board = board;
		this.article = article;
	}

	@Override
	public String toString() {
		return "ArticleTypeBean [articleTypeId=" + articleTypeId + ", articleTypeName=" + articleTypeName + ", board="
				+ board + ", article=" + article + "]";
	}

	public Integer getArticleType() {
		return articleTypeId;
	}

	public void setArticleType(Integer articleType) {
		this.articleTypeId = articleType;
	}

	public String getArticleTypeName() {
		return articleTypeName;
	}

	public void setArticleTypeName(String articleTypeName) {
		this.articleTypeName = articleTypeName;
	}

	public BoardBean getBoard() {
		return board;
	}

	public void setBoard(BoardBean board) {
		this.board = board;
	}

}
