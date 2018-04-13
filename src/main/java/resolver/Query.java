package resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import simulation.Simulation;
import simulation.SimulationRepository;

public class Query implements GraphQLQueryResolver {

	private SimulationRepository simulationRepository;
	
	public Query(SimulationRepository simulationRepository) {
		this.simulationRepository = simulationRepository;
	}
	
	public Iterable<Simulation> findAllSimulations() {
		return simulationRepository.findAll();
	}
	
	public Long countSumulations() {
		return simulationRepository.count();
	}
	
}
