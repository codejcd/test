
public class StrategyContext {

	StrategyInf strategyInf;
	
	public void setContext(StrategyInf strategy) {
		strategyInf = strategy;
	}
	
	public void strategyMethod() {
		strategyInf.Algorithom();
	}
}
