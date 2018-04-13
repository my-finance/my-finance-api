package simulation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import resolver.Mutation;
import resolver.Query;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public Query query(SimulationRepository simulationRepository) {
    	return new Query(simulationRepository);
    }
    
    @Bean
    public Mutation mutation(SimulationRepository simulationRepository) {
    	return new Mutation(simulationRepository);
    }
    
    @Bean
    public CommandLineRunner demo(SimulationRepository simulationRepository) {
    	return (args) -> {
    		Simulation simulation = new Simulation("Test");
    		simulationRepository.save(simulation);
    	};
    }

}