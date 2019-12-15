package de.kuksin.dbversioning;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, UUID> {
}
