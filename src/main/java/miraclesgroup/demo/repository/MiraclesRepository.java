package miraclesgroup.demo.repository;

import miraclesgroup.demo.entity.Miracles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiraclesRepository extends JpaRepository<Miracles, Integer> {
}
