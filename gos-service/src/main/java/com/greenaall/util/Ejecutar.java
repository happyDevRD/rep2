package com.greenaall.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.Hashtable;

public class Ejecutar {

	Object objeto = null;

	public Ejecutar() {
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ejecutar(String fichero) {
		File file = null;

		try {
			// Creación del fichero .java
			file = File.createTempFile("jav", ".java", new File(System.getProperty("java.io.tmpdir")));
			file.deleteOnExit();
			String pathname = System.getProperty("java.io.tmpdir");
			String filename = file.getName();
			String classname = filename.substring(0, filename.length() - 5);
			PrintWriter out = new PrintWriter(new FileOutputStream(file));
			out.println("public class " + classname + " {");
			out.println("public " + classname + " () {}");
			out.println(leerFichero(fichero));
			out.println("}");
			out.flush();
			out.close();

			// Compilamos
			String[] args = new String[] { "-d", pathname, new File(pathname, filename).getAbsolutePath() };

			int status = com.sun.tools.javac.Main.compile(args);

			// La compilación se ha realizado con éxito
			if (status == 0) {
				// Cargamos en memoria la clase recién compilada
				FileInputStream fis = new FileInputStream(new File(pathname, classname + ".class"));
				long tam = new File(pathname, classname + ".class").length();
				byte[] buffer = new byte[(int) tam];
				int cont = 0;
				int leidos = 0;

				while ((leidos = fis.read()) != -1) {
					buffer[cont++] = (byte) leidos;
				}

				fis.close();

				// Cargamos la clase en memoria
				Loader loader = new Loader();
				loader.add(classname, buffer);
				Class clase = loader.findClass(classname);

				// Creamos un objeto de la nueva clase
				objeto = clase.getDeclaredConstructor().newInstance();

				// Borramos ficheros temporales
				new File(pathname, classname + ".class").delete();
			}

			file.delete();
		} catch (Exception e) {
			if (file != null) {
				file.delete();
			}
		}
	}
	
	public Object compilaPC(String pScript) {

		return this.compilaPC_19(pScript);
	}

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	private Object compilaPC_19(String pScript) {

		Object obj = null;
		File file = null;
		String sError = null;

		try {
			// Creación del fichero .java
			System.out.println("Vamos a crear el fichero temporal en: " + System.getProperty("java.io.tmpdir"));
			file = File.createTempFile("jav", ".java", new File(System.getProperty("java.io.tmpdir")));
			file.deleteOnExit();
			String pathname = System.getProperty("java.io.tmpdir");
			System.out.println("path: " + System.getProperty("java.io.tmpdir"));
			String filename = file.getName();
			System.out.println("nombre archivo: " + filename);
			String classname = filename.substring(0, filename.length() - 5);
			PrintWriter out = new PrintWriter(new FileOutputStream(file));

			// Import
			out.println("import java.util.*;");
			out.println("import java.math.*;");
			out.println("import es.greenaall.gos.gf.ln.*;");

			// Inicio de la clase
			out.println("public class " + classname + " {");

			out.println("HashMap<String,Object> oMapa = null;");

			// Constructor de la clase
			out.println("public " + classname + " () {}");

			// Método metodo
			out.println("public double metodo(HashMap<String,Object> oMap) {");
			out.println("oMapa = oMap;");
			out.println("try {");

			if (pScript.indexOf("#PROCEDURE#") != -1) {
				out.println(pScript.substring(0, pScript.indexOf("#PROCEDURE#")));
			} else {
				out.println(pScript);
			}

			out.println("}catch(Exception e) {");
			out.println("System.out.println(e);");
			out.println("}");
			out.println("return Double.NaN;");
			out.println("}");

			if (pScript.indexOf("#PROCEDURE#") != -1) {
				String sProcedure = pScript.substring(pScript.indexOf("#PROCEDURE#"));
				sProcedure = sProcedure.replaceAll("#PROCEDURE#", "");
				out.println(sProcedure);
			}
			// FIN Método metodo

			// Método modifica
			out.println("void modifica(String pParametro, Object oValor) {");
			out.println("if (oMapa != null) {");
			out.println("String sParametros = pParametro;");
			out.println("if (oMapa.get(\"ParametrosModificar\") != null) {");
			out.println("sParametros += \",\" + oMapa.get(\"ParametrosModificar\").toString();");
			out.println("}");
			out.println("oMapa.put(\"ParametrosModificar\", sParametros);");
			out.println("oMapa.put(pParametro, oValor);");
			out.println("}");
			out.println("}");

			// Método invocar
			out.println("Object invocar(Object poObjeto, String psMetodo, Object[] paObjetos) {");
			out.println("return invocar(poObjeto.getClass(), poObjeto, psMetodo, paObjetos);");
			out.println("}");

			// Método invocar
			out.println("Object invocar(String psClase, String psMetodo, Object[] paObjetos) {");
			out.println("try {");
			out.println("Class oClase = this.getClass(); ");
			out.println("try {");
			out.println("oClase = ((Class) oMapa.get(\"ClaseObjeto\")).forName(psClase);");
			out.println("} catch (Exception ex) {");
			out.println(
					"oClase = ((Class) oMapa.get(\"ClaseObjeto\")).forName(psClase, true, ((Class) oMapa.get(\"ClaseObjeto\")).getClassLoader());");
			out.println("}");
			out.println("return invocar(oClase, null, psMetodo, paObjetos);  ");
			out.println("} catch (Exception ex) {");
			out.println("System.out.println(ex);");
			out.println("}");
			out.println("throw new ArithmeticException(\"Error al invocar \"+ psClase + \" \" + psMetodo);");
			out.println("}");

			// Método invocar
			out.println("Object invocar(Class poClase, Object poObjeto, String psMetodo, Object[] paObjetos) {");
			out.println("try {");
			out.println("for (int i = 0; poClase != null && i < poClase.getMethods().length; i++) {");
			out.println("if (poClase.getMethods()[i].getName().equals(psMetodo) && (paObjetos == null");
			out.println("   || paObjetos.length == poClase.getMethods()[i].getParameterTypes().length)) {");
			out.println("Object[] aParametros = null;");
			out.println("if (poClase.getMethods()[i].getParameterTypes().length == 0 || paObjetos == null) {");
			out.println("aParametros = new Object[poClase.getMethods()[i].getParameterTypes().length];");
			out.println("for (int j = 0; j < poClase.getMethods()[i].getParameterTypes().length; j++) {");
			out.println("aParametros[j] = null;");
			out.println("}");
			out.println("} else { ");
			out.println("aParametros = paObjetos;");
			out.println("}");
			out.println("try {");
			out.println("if (java.lang.reflect.Modifier.isStatic(poClase.getMethods()[i].getModifiers())) {");
			out.println("return poClase.getMethods()[i].invoke(poClase, aParametros);");
			out.println("} else {");
			out.println("if (poObjeto == null) {");
			out.println("poObjeto = poClase.newInstance();");
			out.println("}");
			out.println("return poClase.getMethods()[i].invoke(poClase.newInstance(), aParametros);");
			out.println("}");
			out.println("} catch (Exception e) {} ");
			out.println("}");
			out.println("}");
			out.println("} catch (Exception ex) {");
			out.println("System.out.println(ex);");
			out.println("}");
			out.println("throw new ArithmeticException(\"Error al invocar \"+ poClase + \" \" + psMetodo);");
			out.println("}");

			// Método getObjetoClase
			out.println("Object getObjetoClase(String sKey, Class cClase) {");
			out.println("if (oMapa != null && oMapa.get(sKey) != null) {");
			out.println(
					"Object oObjeto = invocar(\"es.greenaall.util.comun.componentes.DatosDto\",\"devolverObjeto\", new Object[] {oMapa.get(sKey), cClase, null});");
			out.println("if (oObjeto == null){");
			out.println(
					"oObjeto = invocar(\"es.greenaall.util.comun.componentes.DatosDto\",\"devolverObjeto\", new Object[] {oMapa.get(sKey).toString(), cClase, null});");
			out.println("}");
			out.println("if (oObjeto != null && cClase.isInstance(oObjeto)){");
			out.println("return oObjeto;");
			out.println("}");
			out.println("}");
			out.println("return null;");
			out.println("}");

			// Método getLong
			out.println("Long getLong(String sKey) {");
			out.println("Object oObjeto = getObjetoClase(sKey, Long.class);");
			out.println("return oObjeto == null ? new Long(\"0\") : (Long) oObjeto;");
			out.println("}");

			// Método getlong
			out.println("long getlong(String sKey) {");
			out.println("return getLong(sKey).longValue();");
			out.println("}");

			// Método getInteger
			out.println("Integer getInteger(String sKey) {");
			out.println("Object oObjeto = getObjetoClase(sKey, Integer.class);");
			out.println("return oObjeto == null ? new Integer(0) : (Integer) oObjeto;");
			out.println("}");

			// Método getint
			out.println("int getint(String sKey) {");
			out.println("return getInteger(sKey).intValue();");
			out.println("}");

			// Método getString
			out.println("String getString(String sKey) {");
			out.println("Object oObjeto = getObjetoClase(sKey, String.class);");
			out.println("return oObjeto == null ? \"\" : oObjeto.toString();");
			out.println("}");

			// Método getDate (java.util.Date)
			out.println("java.util.Date getDate(String sKey) {");
			out.println("return (java.util.Date) getObjetoClase(sKey, java.util.Date.class);");
			out.println("}");

			// Método getSqlDate (java.sql.Date)
			out.println("java.sql.Date getSqlDate(String sKey) {");
			out.println("return (java.sql.Date) getObjetoClase(sKey, java.sql.Date.class);");
			out.println("}");

			// Método getBigDecimal
			out.println("BigDecimal getBigDecimal(String sKey) {");
			out.println("Object oObjeto = getObjetoClase(sKey, BigDecimal.class);");
			out.println("return oObjeto == null ? new BigDecimal(\"0.00\") : (BigDecimal) oObjeto;");
			out.println("}");

			// Método getDouble
			out.println("Double getDouble(String sKey) {");
			out.println("Object oObjeto = getObjetoClase(sKey, Double.class);");
			out.println("return oObjeto == null ? new Double(\"0\") : (Double) oObjeto;");
			out.println("}");

			// Método getdouble
			out.println("double getdouble(String sKey) {");
			out.println("return getDouble(sKey).doubleValue();");
			out.println("}");

			// Cierre de la clase
			out.println("}");

			out.flush();
			out.close();

			// Compilamos
			String classpath = this.getClass().getClassLoader().getResource("es/greenaall/gos/gf/ln/Calculo.class")
					.getPath();
			// System.out.println(classpath)
			classpath = classpath.substring(0, classpath.length() - 37);
			String classpath2 = this.getClass().getClassLoader().getResource("es/greenaall/util/comun/log/Traza.class")
					.getPath();
			// System.out.println(classpath2);
			classpath2 = classpath2.substring(0, classpath2.length() - 40);

			String classpath3 = this.getClass().getClassLoader()
					.getResource("es/greenaall/gos/ge/dao/sql/SqlGenerico.class").getPath();
			// System.out.println(classpath2);
			classpath3 = classpath3.substring(0, classpath3.length() - 46);

			String sComando = "javac -classpath " + classpath + System.getProperty("path.separator") + classpath2
					+ System.getProperty("path.separator") + classpath3 + " -source 19" + " -d " + pathname + " "
					+ new File(pathname, filename).getAbsolutePath();
			System.out.println(sComando);
			Process process = Runtime.getRuntime().exec(sComando);
			StreamReader reader = new StreamReader(process.getErrorStream());
			reader.start();

			process.waitFor();
			int status = process.exitValue();
			reader.join();
			sError = reader.getResult();

			// La compilación se ha realizado con éxito
			if (status == 0) {
				// Cargamos en memoria la clase recién compilada
				FileInputStream fis = new FileInputStream(new File(pathname, classname + ".class"));
				long tam = new File(pathname, classname + ".class").length();
				byte[] buffer = new byte[(int) tam];
				int cont = 0;
				int leidos = 0;

				while ((leidos = fis.read()) != -1) {
					buffer[cont++] = (byte) leidos;
				}

				fis.close();

				// Cargamos la clase en memoria
				Loader loader = new Loader();
				loader.add(classname, buffer);
				Class clase = loader.findClass(classname);

				// Invocamos al método
				obj = clase.getDeclaredConstructor().newInstance();

				// Borramos ficheros temporales
				new File(pathname, classname + ".class").delete();
			}

			file.delete();
			System.out.println("Ejecutado. Archivo temporal borrado");
		} catch (Exception e) {

			if (file != null) {
				file.delete();
			}
			System.out.println("Error." + sError);
			throw new RuntimeException(e.getMessage());
		}

		if (sError != null && !sError.trim().equals("")) {
			throw new RuntimeException(sError);
		}

		return obj;
	}

	public class Loader extends ClassLoader {
		@SuppressWarnings("rawtypes")
		private Hashtable mClasses = new Hashtable();

		/**
		 * Constructor
		 */

		public Loader() {
			super();
		}

		/**
		 * Añade una clase
		 * 
		 * @param name  Nombre de la clase
		 * @param bytes Cadena de bytes que contiene la clase
		 */

		@SuppressWarnings("unchecked")
		public void add(String name, byte[] bytes) {
			mClasses.put(name, bytes);
		}

		/**
		 * Recupera una clase
		 * 
		 * @param name Nombre de la clase a recuperar
		 * @return Class La clase recuperada
		 * @throws java.lang.ClassNotFoundException
		 */

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public Class findClass(String name) throws ClassNotFoundException {
			byte[] bytes = (byte[]) mClasses.get(name);

			new Date();
			if (bytes == null) {
				return super.findClass(name);
			}

			Class oClase = this.defineClass(name, bytes, 0, bytes.length);
			resolveClass(oClase);
			return oClase;
		}
	}

	public class StreamReader extends Thread {
		private InputStream is;
		private StringWriter sw;

		public StreamReader(InputStream is) {
			this.is = is;
			sw = new StringWriter();
		}

		public void run() {
			try {
				int c;
				while ((c = is.read()) != -1) {
					sw.write(c);
				}
			} catch (IOException e) {
				;
			}
		}

		public String getResult() {
			return sw.toString();
		}
	}

	private String leerFichero(String file) {
		String lectura = new String();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;

			while ((str = br.readLine()) != null) {
				lectura = lectura.concat(str + "\n");
			}

			br.close();
		} catch (Exception e) {
			System.err.println("Error de lectura desde " + file);
		}

		if (lectura.length() == 0) {
			lectura = "return null;";
		}

		return lectura;
	}
}
