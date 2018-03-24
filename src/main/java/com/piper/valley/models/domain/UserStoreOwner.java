package com.piper.valley.models.domain;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class UserStoreOwner extends User {
	@OneToMany(mappedBy = "userStoreOwner")
	private List<Store> stores;
}

