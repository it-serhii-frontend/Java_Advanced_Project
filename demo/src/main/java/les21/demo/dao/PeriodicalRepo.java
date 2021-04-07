package les21.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import les21.demo.domain.Periodical;

@Repository
public interface PeriodicalRepo extends JpaRepository<Periodical, Integer>{

}
