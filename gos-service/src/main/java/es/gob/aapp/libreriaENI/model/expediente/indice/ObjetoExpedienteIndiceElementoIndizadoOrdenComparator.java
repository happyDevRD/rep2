package es.gob.aapp.libreriaENI.model.expediente.indice;

import java.util.Comparator;

public class ObjetoExpedienteIndiceElementoIndizadoOrdenComparator
		implements Comparator<ObjetoExpedienteIndiceContenidoElementoIndizado> {

	@Override
	public int compare(ObjetoExpedienteIndiceContenidoElementoIndizado o1,
						ObjetoExpedienteIndiceContenidoElementoIndizado o2)
	{
		return o1.getOrden() - o2.getOrden();
	}

}
