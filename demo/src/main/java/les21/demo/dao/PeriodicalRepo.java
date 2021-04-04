package les21.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import les21.demo.domain.Periodical;

public interface PeriodicalRepo extends JpaRepository<Periodical, Integer>{

}
