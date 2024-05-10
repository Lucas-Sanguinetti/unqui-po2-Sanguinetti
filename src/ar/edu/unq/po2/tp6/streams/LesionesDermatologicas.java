package ar.edu.unq.po2.tp6.streams;

public enum LesionesDermatologicas {
	
	ROJO("lesion roja", 3d){
		
		@Override
		public LesionesDermatologicas next() {
			return LesionesDermatologicas.GRIS;
		}
	}, GRIS("lesion gris", 3d){
		
		@Override
		public LesionesDermatologicas next() {
			return LesionesDermatologicas.AMARILLO;
		}
			
	}, AMARILLO("lesion amarilla", 3d){
		
		@Override
		public LesionesDermatologicas next() {
			return LesionesDermatologicas.MIEL ;
		}
	}, MIEL("lesion miel", 3d){
		
		@Override
		public LesionesDermatologicas next() {
			return LesionesDermatologicas.ROJO;
		}
	};
	
	private String descripcion;
	private double nivelDeRiesgo;
	
	LesionesDermatologicas(String string, double d) {
		this.descripcion = string;
		this.nivelDeRiesgo = d;
	}

	public LesionesDermatologicas next() {
		return ROJO;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public double getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	
	


}
