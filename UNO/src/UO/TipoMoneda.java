package UO;


	
	public enum TipoMoneda implements Conversor {
	    DOLAR {
	        public double convertir(double cantidad) {
	            return cantidad * 17.1; // Ej: pesos a dólares
	        }
	    },
	    EURO {
	        public double convertir(double cantidad) {
	            return cantidad * 18.5;
	        }
	    },
	    YEN {
	        public double convertir(double cantidad) {
	            return cantidad * 0.12;
	        }
	    };
	}


