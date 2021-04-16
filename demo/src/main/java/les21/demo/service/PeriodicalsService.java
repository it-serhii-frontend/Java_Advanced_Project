package les21.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import les21.demo.dao.PeriodicalRepo;
import les21.demo.domain.Periodical;

@Service
public class PeriodicalsService {

	@Autowired
	private PeriodicalRepo periodicalRepo;
	
	public Periodical save(Periodical periodical) {
		return periodicalRepo.save(periodical);
	}
	
	public List<Periodical> getAllPeriodicals(){
		return periodicalRepo.findAll();
	}
}
