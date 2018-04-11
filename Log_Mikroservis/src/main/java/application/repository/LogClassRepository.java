package application.repository;

import application.model.LogClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface LogClassRepository extends CrudRepository<LogClass,Long> {

    Collection<LogClass> findByLogTypeId(Long logType);

    Collection<LogClass> findByStatus(Long status);

    Collection<LogClass> findBySource(String logSource);

    Collection<LogClass> findByUser(String user);

    Collection<LogClass> findByTripName(String tripName);

}