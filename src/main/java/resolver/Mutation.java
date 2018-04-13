package resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import simulation.Simulation;
import simulation.SimulationRepository;

public class Mutation implements GraphQLMutationResolver {
	
private SimulationRepository simulationRepository;
	
	public Mutation(SimulationRepository simulationRepository) {
		this.simulationRepository = simulationRepository;
	}
	
	public Simulation newSimulation(String title) {
		Simulation simulation = new Simulation(title);
		simulationRepository.save(simulation);
		
		return simulation;
	}
	
	public Boolean deleteSimualtion(Long id) {
		simulationRepository.deleteById(id);
		return true;
	}
	
	public Simulation updateSimulation(Simulation simulation) {
		simulationRepository.save(simulation);
		return simulation;
	}

}
