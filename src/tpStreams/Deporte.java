package tpStreams;

public enum Deporte {
	
	running(1){
		@Override
		public String getName() {
			return "running";
		}
	}, futbol(2){
		@Override
		public String getName() {
			return "futbol";
		}
	},basket(2){
		@Override
		public String getName() {
			return "basket";
		}
	}, tennis(3){
		@Override
		public String getName() {
			return "tennis";
		}
	}, jabalina(4){
		@Override
		public String getName() {
			return "jabalina";
		}
	};
	
	private Integer complejidad;
	
	Deporte(int p){
		this.complejidad = p;
	}
	
	public int getComplejidad() {
		return this.complejidad;
	}

	boolean es(String d) {
		return d==this.getName();
	}
	
	public String getName() {
		return "";
	}

	public boolean tieneComplejidad(int c) {
		return this.complejidad == c;
	}

}

