public class Vuelo {

    String numeroVuelo;
    String aerolinea;
    String destino;
    String fecha;

    String[] destinosPermitidos = {"Cartagena", "Santa Marta", "Cali"};

    public Vuelo(String numeroVuelo, String aerolinea, String destino, String fecha) {

        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.fecha = fecha;

        boolean valido = false;

        for (String d : destinosPermitidos) {
            if (d.equals(destino)) {
                valido = true;
            }
        }

        if (valido) {
            this.destino = destino;
        } else {
            this.destino = "No válido";
        }
    }

    public boolean confirmarReserva() {

        if (destino.equals("No válido")) {
            System.out.println("Destino del vuelo no permitido");
            return false;
        }

        return true;
    }
    
        void buscarVueloPorId(int idBusqueda) {
        if (this.idVuelos == idBusqueda) {
            System.out.println("¡Vuelo encontrado!");
            obtenerVuelo(); // Llama a tu otro método para mostrar los datos
        } else {
            System.out.println("El ID " + idBusqueda + " no coincide con este vuelo.");
        }
    }
}

