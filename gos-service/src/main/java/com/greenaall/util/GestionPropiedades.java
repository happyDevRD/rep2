package com.greenaall.util;

public class GestionPropiedades {
	
	
	public static String getTemp() {
		String sTemp = GestionPropiedades.getValorPropiedad("java.io.tmpdir");

		if ((sTemp == null || "".equals(sTemp))
				&& !"".equals(GestionPropiedades.getValorPropiedad("user.dir",
						""))) {
			String sDirTemp = GestionPropiedades.getValorPropiedad("user.dir",
					"");

			if (sDirTemp.matches(".*bin")) {
				sTemp = sDirTemp.substring(0, sDirTemp.length() - 3) + "temp";
			}

			if (sTemp == null || "".equals(sTemp)) {
				sTemp = GestionPropiedades.getValorPropiedad("user.home", "");
			}

			if (sTemp == null || "".equals(sTemp)) {
				sTemp = GestionPropiedades.getValorPropiedad("TEMP");
			}

			if (sTemp == null || "".equals(sTemp)) {
				if (GestionPropiedades.isWindows()) {
					sTemp = "."; // "c:\\temp";
				} else {
					sTemp = "."; // "/usr/tmp";
				}
			}
		}

		while (sTemp != null
				&& sTemp.length() > 0
				&& sTemp.substring(sTemp.length() - 1, sTemp.length()).equals(
						GestionPropiedades.getValorPropiedad("file.separator",
								"\\"))) {
			sTemp = sTemp.substring(0, sTemp.length() - 1);
		}

		return sTemp;
	}
	
	public static String getValorPropiedad(String psNombre, String psDefecto) {
		return System.getProperty(psNombre, psDefecto);
	}

	public static String getValorPropiedad(String psNombre) {
		return System.getProperty(psNombre);
	}
	
	public static boolean isWindows() {
		return (GestionPropiedades.getValorPropiedad("os.name") != null && GestionPropiedades
				.getValorPropiedad("os.name").indexOf("Windows") >= 0);
	}

}
