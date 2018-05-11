package webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webapi.domain.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	AppUser findOneByUsername(String username);
}
