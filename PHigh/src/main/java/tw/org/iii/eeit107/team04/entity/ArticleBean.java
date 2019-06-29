package tw.org.iii.eeit107.team04.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
public class ArticleBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer articleId;
	@ManyToOne
	@JoinColumn(name = "fk_board_id", nullable = false)
	private BoardBean board;
	@ManyToOne
	@JoinColumn(name = "fk_articleType_id", nullable = false)
	private ArticleTypeBean articleType;
	private String articleTitle;
	private String articleContent;
	@ManyToOne
	@JoinColumn(name = "fk_member_id", nullable = false)
	private MemberBean member;
	private java.util.Date articleCreateDate;
	private java.util.Date articleUpdateDate;

	public ArticleBean() {

	}

	public ArticleBean(Integer articleId, BoardBean board, ArticleTypeBean articleType, String articleTitle,
			String articleContent, MemberBean member, Date articleCreateDate, Date articleUpdateDate) {
		super();
		this.articleId = articleId;
		this.board = board;
		this.articleType = articleType;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.member = member;
		this.articleCreateDate = articleCreateDate;
		this.articleUpdateDate = articleUpdateDate;
	}

	@Override
	public String toString() {
		return "ArticleBean [articleId=" + articleId + ", board=" + board + ", articleType=" + articleType
				+ ", articleTitle=" + articleTitle + ", articleContent=" + articleContent + ", member=" + member
				+ ", articleCreateDate=" + articleCreateDate + ", articleUpdateDate=" + articleUpdateDate + "]";
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public BoardBean getBoard() {
		return board;
	}

	public void setBoard(BoardBean board) {
		this.board = board;
	}

	public ArticleTypeBean getArticleType() {
		return articleType;
	}

	public void setArticleType(ArticleTypeBean articleType) {
		this.articleType = articleType;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public MemberBean getMember() {
		return member;
	}

	public void setMember(MemberBean member) {
		this.member = member;
	}

	public java.util.Date getArticleCreateDate() {
		return articleCreateDate;
	}

	public void setArticleCreateDate(java.util.Date articleCreateDate) {
		this.articleCreateDate = articleCreateDate;
	}

	public java.util.Date getArticleUpdateDate() {
		return articleUpdateDate;
	}

	public void setArticleUpdateDate(java.util.Date articleUpdateDate) {
		this.articleUpdateDate = articleUpdateDate;
	}

}
