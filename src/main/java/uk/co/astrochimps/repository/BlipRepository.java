package uk.co.astrochimps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.co.astrochimps.domain.Blip;

/**
 * Created by Imran on 13-May-17.
 */
@RepositoryRestResource
public interface BlipRepository extends CrudRepository<Blip, Long> {

}
