package simulator.model;

public abstract class Event implements Comparable<Event> {

	protected int _time;

	Event(int time) {
		if (time < 1)
			throw new IllegalArgumentException("Time must be positive (" + time + ")");
		else
			_time = time;
	}

	public int getTime() {
		return _time;
	}

	@Override
	public int compareTo(Event o) {
		if(_time > o.getTime())
			return 1;
		else if (_time == o.getTime())
			return 0;
		else
			return -1;
	}

	abstract void execute(RoadMap map) throws Exception;
}
