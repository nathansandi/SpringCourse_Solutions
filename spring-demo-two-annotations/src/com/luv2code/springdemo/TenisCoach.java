package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;


//its possible auto generate the bean id so if we dont specify the bean id 
//it will be authomatic 
//@Component("tenis

//create a component prototype
@Component
//@Scope("prototype")
public class TenisCoach implements Coach{
	
	//its replaces constructor methods, and authomatic set this field
	//Field Injection
    @Value("${foo.email}")
    private String email;
        
    @Value("${foo.team}")
    private String team;
    
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//@Autowired
	///public TenisCoach(FortuneService theFortuneService) {
	//	fortuneService = theFortuneService;
	//}
	public TenisCoach() {
		
	}
	//define init method8
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">>Tenicoach; inside of doMyStartupStuff()");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">>Tenicoach; inside of doMyCleanStuff()");
	}
	
	//SETTER INJECTION
	//Spring will auto resolve this method 
	//@Autowired
	//public void setFortuneService(FortuneService theFortuneService) {
	//	this.fortuneService = theFortuneService;
	//}
	//METHOD INJECTION
	//@Autowired
	//public void doSomeCrazyStuff(FortuneService theFortuneService) {
	//	System.out.println("this is just another stupid test");
		//this.fortuneService = theFortuneService;
	//}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		
		return "Practice ur backhand volley";
		
	}

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
	
		return fortuneService.getFortune();
	}
}
/* Qualifier with construction
@Autowired
public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

    System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
    
    fortuneService = theFortuneService;
}
*/