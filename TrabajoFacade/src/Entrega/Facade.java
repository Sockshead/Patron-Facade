package Entrega;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Facade {

    protected ArrayList<IUsuario> misUsuarios = new ArrayList<>();
    protected ArrayList<Ruta> rutas = new ArrayList();
    protected FactoryUsuarios usuarios = new FactoryUsuarios();

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

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
        }
        if (!existe) {
            throw new Exception("Conductor con la cedula " + ID + " no existe.");
        }
    }

    public void modPasajero(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        IUsuario usuario = null;

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
        }
        if (!existe) {
            throw new Exception("Pasajero con la cedula " + ID + " no existe.");
        }
    }

    public void modAdministrador(String correo, String password, String ID) throws Exception {
        boolean existe = false;
        IUsuario usuario = null;

        usuario = usuarios.buscar(ID);

        if (usuario != null) {
            existe = true;
            usuario.modificar(password);
            usuarios.actualizarUsuario(ID, usuario);
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

    public void mostrarRuta(Ruta ruta) {
        ruta.mostrar();
    }

    void verRutas(String ID) {
        for (Ruta ruta : rutas) {
            if (ruta.getIdConductor().equals(ID)) {
                ruta.mostrar();
            }
        }
    }
}
