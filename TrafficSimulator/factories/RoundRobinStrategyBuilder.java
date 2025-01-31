package simulator.factories;

import org.json.JSONObject;
import simulator.model.*;

public class RoundRobinStrategyBuilder extends Builder<LightSwitchingStrategy> {

	public RoundRobinStrategyBuilder() {
		super("round_robin_lss");
	}

	@Override
	protected LightSwitchingStrategy createTheInstance(JSONObject data) {
		if (data.has("timeslot"))
			return new RoundRobinStrategy(data.getInt("timeslot"));
		else
			return new RoundRobinStrategy(1);
	}

}
