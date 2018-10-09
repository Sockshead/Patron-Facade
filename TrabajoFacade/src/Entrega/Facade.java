package Entrega;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Facade {

    protected ArrayList<IUsuario> misUsuarios = new ArrayList();
    protected ArrayList<Ruta> rutas = new ArrayList();
    private ArrayList<component> pagos = new ArrayList();
    protected FactoryUsuarios usuarios = new FactoryUsuarios();
    private Proxy prox;

    public void agregarConductor(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        boolean agregado = false;

        if (usuarios.buscar(ID) != null) {
            existe = true;
        }

        if (!existe) {
            IUsuario usuario = new Conductor();
            usuario.adicionar(correo, password);
            usuarios.agregarUsuario(ID, usuario);
            agregado = true;
        } else {
            throw new Exception("Conductor con la cedula " + ID + " ya existe.");
        }

        if (!agregado) {
            throw new Exception("Conductor no agregado.");
        }
    }

    public void agregarPasajero(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        boolean agregado = false;

        if (usuarios.buscar(ID) != null) {
            existe = true;
        }

        if (!existe) {
            IUsuario usuario = new Pasajero();
            usuario.adicionar(correo, password);
            usuarios.agregarUsuario(ID, usuario);
            agregado = true;
        } else {
            throw new Exception("Pasajero con la cedula " + ID + " ya existe.");
        }

        if (!agregado) {
            throw new Exception("Pasajero no agregado.");
        }
    }

    public void agregarAdministador(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        boolean agregado = false;

        if (usuarios.buscar(ID) != null) {
            existe = true;
        }

        if (!existe) {
            IUsuario usuario = new AdapterAdmin();
            usuario.adicionar(correo, password);
            usuarios.agregarUsuario(ID, usuario);
            agregado = true;
        } else {
            throw new Exception("Administrador con la cedula " + ID + " ya existe.");
        }

        if (!agregado) {
            throw new Exception("Administrador no agregado.");
        }
    }

    public void modConductor(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        IUsuario usuario = null;
        prox = Proxy.rConstructora();

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
            prox.modUs(correo, password);
        }
        if (!existe) {
            throw new Exception("Conductor con la cedula " + ID + " no existe.");
        }
    }

    public void modPasajero(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        IUsuario usuario = null;
        prox = Proxy.rConstructora();

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
            prox.modUs(correo, password);
        }
        if (!existe) {
            throw new Exception("Pasajero con la cedula " + ID + " no existe.");
        }
    }

    public void modAdministrador(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        IUsuario usuario = null;
        prox = Proxy.rConstructora();

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
            prox.modUs(correo, password);
        }
        if (!existe) {
            throw new Exception("Administrador con la cedula " + ID + " no existe.");
        }
    }

    public String consultarConductor(String correo, String ID) throws Exception {
        boolean encontrado = false;
        IUsuario usuario = null;
        String found = "";

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            found = usuario.consultar(correo);
            encontrado = true;
        }
        if (!encontrado) {
            throw new Exception("Conductor con cedula " + ID + " no existe.");
        }

        return found;
    }

    public String consultarPasajero(String correo, String ID) throws Exception {
        boolean encontrado = false;
        IUsuario usuario = null;
        String found = "";

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            found = usuario.consultar(correo);
            encontrado = true;
        }
        if (!encontrado) {
            throw new Exception("Pasajero con la cedula " + ID + " no existe.");
        }

        return found;
    }

    public String consultarAdministrador(String correo, String ID) throws Exception {
        boolean encontrado = false;
        IUsuario usuario = null;
        String found = "";

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            found = usuario.consultar(correo);
            encontrado = true;
        }
        if (!encontrado) {
            throw new Exception("Administrador con la cedula " + ID + " no existe.");
        }

        return found;
    }

    public Ruta newRuta(String ID, String nombre, float valor, int cupos, String fecha, String hora, String destino) {
        Ruta ruta = new Ruta(ID, nombre, valor, cupos, fecha, hora, destino);
        this.rutas.add(ruta);
        return ruta;
    }

    public void newCalle(Ruta ruta, float oX, float oY, float dX, float dY, String nombre, float disM, float tiempo) {
        this.rutas.remove(ruta);
        Composite calle = new Calle(oX, oY, dX, dY, nombre, disM, tiempo);
        ruta.add(calle);
        this.rutas.add(ruta);
    }

    public String mostrarRuta(Ruta ruta) {
        return ruta.mostrar();
    }

    public String verRutas(String ID) {
        String rut = "";
        for (Ruta ruta : rutas) {
            if (ruta.getIdConductor().equals(ID)) {
                rut = rut + ruta.mostrar();
            }
        }
        return rut;
    }

    public String cargarRutas() {
        String rut = "";
        for (Ruta ruta : rutas) {
            rut = rut + " La ruta con el nombre: " + ruta.getNombre() + " y destino " + ruta.getDestino() + " en la fecha: "
                    + ruta.getFecha() + " a la hora: " + ruta.getHora() + " con un costo de " + ruta.getValor() + " pesos y "
                    + ruta.getCupos() + " disponibles. \n";
        }
        return rut;
    }

    public String resvCupo(String nombre, String id) {
        String resv = "No existe ruta con ese nombre.";
        for (Ruta ruta : rutas) {
            if (ruta.getNombre().equalsIgnoreCase(nombre)) {
                try {
                    ruta.reservaCupo(id);
                    resv = "Reserva realizada en la ruta " + nombre + " con exito.";
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        return resv;
    }

    public String verViajePasajero(String id) {
        Ruta rut = null;
        String resp = "";
        for (Ruta ruta : rutas) {
            for (String pas : ruta.getPasajeros()) {
                if (pas.equals(id)) {
                    rut = ruta;
                    resp = "Usted tiene una reserva en la ruta con el nombre: " + rut.getNombre() + " y destino " + rut.getDestino()
                            + " en la fecha: " + rut.getFecha() + " a la hora: " + rut.getHora() + " con un costo de " + rut.getValor() + " pesos.\n";
                }
            }
        }
        if (rut == null) {
            resp = "Usted no tiene ninguna reserva en el momento.";
        }
        return resp;
    }

    public String realizarPagos(String tipo, String id, String valor) {
        Random ran = new Random();
        Date date = new Date();
        component com;
        String resp = "";

        if (tipo.equals("Baloto")) {
            Pago pago = new Pago();
            pago.asignarValores(valor + "," + (ran.nextInt(9000000) + 1000000) + "," + id);
            com = new Baloto(pago);
            com.asignarValores(date + "");
            pagos.add(com);

            resp = com.mostrarValores();
        } else if (tipo.equals("Efectivo")) {
            Pago pagoE = new Pago();
            pagoE.asignarValores(valor + "," + (ran.nextInt(9000000) + 1000000) + "," + id);
            com = new Efectivo(pagoE);
            com.asignarValores(date + "");
            pagos.add(com);

            resp = com.mostrarValores();
        } else if (tipo.equals("Credito")) {
            Pago pagoC = new Pago();
            pagoC.asignarValores(valor + "," + (ran.nextInt(9000000) + 1000000) + "," + id);
            com = new Credito(pagoC);
            com.asignarValores(date + "," + "Bancolombia");
            pagos.add(com);

            resp = com.mostrarValores();
        }
        return resp;
    }

    public String verPagos(String id) throws Exception {
        String historial = "Historial de pagos: \n";
        if (this.pagos.isEmpty()) {
            throw new Exception("Todavia no hay pagos registrados.");
        } else {
            for (component pago : pagos) {
                String user = "";
                String[] info = pago.mostrarValores().split(",");
                user = info[0];
                info = user.split(":");
                user = info[1].trim();
                if (user.equalsIgnoreCase(id)) {
                    historial = historial + pago.mostrarValores() + "\n";
                }
            }
        }
        return historial;
    }

    public String elimUsa(String id, String idAdmin) {
        boolean existe = false;
        prox = Proxy.rConstructora();
        IUsuario usuario = usuarios.buscar(id);
        String respuesta = "A";

        if (usuario != null) {
            existe = true;
            if (id.equalsIgnoreCase(idAdmin)) {
                respuesta = "No se puede eliminar a usted mismo.";
            } else {
                String correo = usuario.getCorreo();
                usuarios.eliminarUsuario(id);
                prox.elimUs(correo);
                respuesta = "El usuario con la cedula " + id + " ha sido eliminado correctamente";
            }
        }
        if (!existe) {
            respuesta = "Usuario con la cedula " + id + " no existe.";
        }
        return respuesta;
    }
    public void eliminarUsuario(String id, String idAdmin) throws Exception {
        boolean eliminado=false;
        prox = Proxy.rConstructora();
        IUsuario usuario = usuarios.buscar(id);
        
        if(usuario!=null){
            if (id.equalsIgnoreCase(idAdmin)) {
                throw new Exception("No se puede eliminar a usted mismo.");
            } 
            String correo = usuario.getCorreo();
            usuarios.eliminarUsuario(id);
            eliminado=prox.elimUs(correo);
        }
        if(!eliminado){
            throw new Exception("Usuario con la cedula " + id + " no existe.");
        }

        
    }
}
