
public class App {

	public static void main (String args[]) {
		StrategyContext strategyContext = new StrategyContext();
		
		strategyContext.setContext(new StrategyA());
		strategyContext.strategyMethod();
		
		strategyContext.setContext(new StrategyB());
		strategyContext.strategyMethod();
		
		
	}
}
