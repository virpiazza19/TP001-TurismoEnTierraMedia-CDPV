package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LectorDeUsuarios {
	private FileReader fr = null;
	private BufferedReader br = null;

	public List<Usuario> leerUsuarios(String archivo) {
	    List <Usuario> usuarios = new ArrayList <Usuario>();
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();
			while (linea != null) {
				try {
					System.out.println(crearUsuario(linea));
				} catch (UsuarioException e) { // controla excepcion por error en parametros al crear usuario
					System.out.println(e.getMessage());
				}
				linea = br.readLine();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
return usuarios;
	}

	private Usuario crearUsuario(String linea) throws UsuarioException {
		String[] lin = linea.split(",");
		if (lin.length != 4) { // lanza excepcion cuando el archivo tiene mas de 4 parametros//
			throw new UsuarioException("Cantidad incorrecta de parametros");
		}
		Usuario usuario;
		try {
			usuario = new Usuario(lin[0], Integer.parseInt(lin[1]), Double.parseDouble(lin[2]),
					TipoAtraccion.valueOf(lin[3].toUpperCase()));
		} catch (NumberFormatException e) {
			throw new UsuarioException("Uno de los parametros no es un numero");
		} catch (IllegalArgumentException e) {
			throw new UsuarioException((lin[3] + " " + "no es una atraccion valida"));
		}
		return usuario;
	}
}