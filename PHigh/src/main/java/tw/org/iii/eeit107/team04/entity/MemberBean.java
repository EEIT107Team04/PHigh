package tw.org.iii.eeit107.team04.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Member")
public class MemberBean {
	@Id
	private Integer mId;
	private String name;

	public MemberBean() {

	}

	public MemberBean(Integer mId, String name) {
		super();
		this.mId = mId;
		this.name = name;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberBean [mId=" + mId + ", name=" + name + "]";
	}

}
