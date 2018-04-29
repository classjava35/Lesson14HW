package sorting;

public class State implements Comparable<State>{
	
	private String name;
	private int population;
	private int area;
	
	
	public State(String name, int population, int area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "State [" + (name != null ? "name=" + name + ", " : "") + "population=" + population + ", area=" + area
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof State))
			return false;
		State other = (State) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(State other) {
		return name.compareTo(other.name);
	}

	

}
