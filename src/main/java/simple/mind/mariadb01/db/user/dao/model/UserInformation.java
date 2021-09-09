package simple.mind.mariadb01.db.user.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Subselect;
import org.springframework.data.annotation.Immutable;

@Entity
@Immutable
@Subselect("SELECT b.id, a.name, a.email, a.age, b.address FROM users a JOIN user_address b ON (a.id = b.user_id)")
public class UserInformation {
	@Id
	public Integer id;
	@Column
	public String name;
	@Column
	public String email;
	@Column
	public Integer age;
	@Column
	public String address;
}
