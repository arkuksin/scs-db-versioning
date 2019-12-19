package de.kuksin.dbversioning;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "posts", collectionResourceRel = "posts")
public interface PostRepository extends PagingAndSortingRepository<Post, UUID> {
}
