package simulator.model;

import org.json.JSONObject;

public abstract class SimulatedObject {

	protected String _id;

	SimulatedObject(String id) {
		_id = id;
	}

	public String getId() {
		return _id;
	}

	@Override
	public String toString() {
		return _id;
	}

	abstract void advance(int time) throws Exception;

	@SuppressWarnings("exports")
	abstract public JSONObject report();
}
