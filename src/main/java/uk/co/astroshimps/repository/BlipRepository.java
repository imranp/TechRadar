package uk.co.astroshimps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.co.astroshimps.domain.Blip;

/**
 * Created by Imran on 13-May-17.
 */
@RepositoryRestResource//(path = "radar-api/blip")
public interface BlipRepository extends CrudRepository<Blip, Long> {

}
